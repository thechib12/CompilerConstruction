package pp.s1594273.q2_3;

import java.io.File;
import java.io.IOException;
import java.util.*;


import pp.iloc.Assembler;
import pp.iloc.model.*;
import pp.iloc.parse.FormatException;
import pp.s1594273.q2.Graph;
import pp.s1594273.q2.Node;

public class ILOC2DDG {
    private static final ILOC2DDG instance = new ILOC2DDG();
    private static final String BASE_DIR = "src/main/java/pp/s1594273/q2_3/";
    private static final String INPUT_FILE = "test.iloc";
    private static final OpCode[] storeOperations = {OpCode.store, OpCode.storeAI, OpCode.storeAO, OpCode.cstore, OpCode.cstoreAI, OpCode.cstoreAO};
    private static final OpCode[] loadOperations = {
            OpCode.load, OpCode.loadAI, OpCode.loadAO, OpCode.cload, OpCode.cloadAO, OpCode.cloadAI};
    private static final OpCode[] pushOperations = {OpCode.push, OpCode.cpush};
    private static final OpCode[] popOperations = {OpCode.cpop, OpCode.pop};
    /**
     * The singleton instance of this class.
     */
    Map<Instr, Node> nodes;

    /**
     * Private constructor for the singleton instance.
     */
    private ILOC2DDG() {
        // empty by design
    }

    /**
     * Returns the singleton instance of this class.
     */
    public static ILOC2DDG instance() {
        return instance;
    }

    /**
     * Converts an ILOC file given as parameter and prints out the
     * resulting CFG.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: filename");

        }
        try {
            Program prog = Assembler.instance().assemble(new File(args[0]));
            System.out.println(instance().convert(prog));
        } catch (FormatException | IOException exc) {
            exc.printStackTrace();
        }
    }

    public Graph convert(Program prog) {
        Graph graph = new Graph();
        nodes = new HashMap<>();
        List<Instr> listInstructions = prog.getInstr();
        int instrcount = 0;
        for (Instr instr : listInstructions) {
            Op operation = (Op) instr;
            Node node = graph.addNode(operation.getOpCode().name());
            nodes.put(instr, node);
            if (containOperation(loadOperations, operation) || containOperation(popOperations, operation)) {
                for (Instr instr2 : listInstructions.subList(0, instrcount)) {
                    Op operation2 = (Op) instr2;
                    if (instr != instr2 && (containOperation(storeOperations, operation2) || containOperation(pushOperations, operation2))) {
                        System.out.println(instr2);
                        node.addEdge(nodes.get(operation2));
                    }

                }

            }
            List<Operand> operands = operation.getArgs();
            int sourceCount = operation.getOpCode().getSourceCount();
            for (int i = 0; i < sourceCount; i++) {
                if (operands.get(i).getType() == Operand.Type.REG) {
                    for (Instr instr3 : listInstructions.subList(0, instrcount)) {
                        Op operation3 = (Op) instr3;
                        int target = operation3.getOpCode().getTargetCount();
                        if (target == 1) {
                            Operand operand = operation3.getArgs().get(operation3.getArgs().size() - 1);
                            if (operand.equals(operands.get(i))) {
                                node.addEdge(nodes.get(operation3));
                                break;
                            }
                        }

                    }
                }
            }
            instrcount++;
        }
        Node endNode = graph.addNode("END");
        for (Instr instr : listInstructions) {

            if (containOperation(storeOperations, (Op) instr) || containOperation(pushOperations, (Op) instr)) {
                endNode.addEdge(nodes.get(instr));
            }
        }

        this.writeDot(graph);
        return graph;
    }


    public boolean containOperation(OpCode[] opcodes, Op op) {
        return Arrays.asList(opcodes).contains(op.getOpCode());
    }


    public void writeDot(Graph graph) {
        try {
            graph.writeDOT("src/main/java/pp/s1594273/q2_3/datagraph.dot", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}