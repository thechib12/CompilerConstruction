package pp.s1594273.q2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Graph class, used for Data Dependency Graphs.
 *
 * @author Arend Rensink
 */
public class Graph implements Iterable<Node> {
    /**
     * Set of nodes in this graph.
     */
    private final List<Node> nodes;

    /**
     * Constructs an initially empty graph.
     */
    public Graph() {
        this.nodes = new ArrayList<>();
    }

    /**
     * Builds a simple graph and prints it out.
     */
    public static void main(String[] args) {
        Graph g = new Graph();
        Node n0 = g.addNode("First");
        Node n1 = g.addNode();
        Node n2 = g.addNode("Last");
        n0.addEdge(n1);
        n1.addEdge(n2);
        n2.addEdge(n0);
        n2.addEdge(n2);
        System.out.println(g);
    }

    /**
     * Adds a new node to this graph and returns it.
     * The new node number equals the number of nodes at the
     * time of invocation.
     */
    public Node addNode() {
        Node result = new Node(this, this.nodes.size());
        this.nodes.add(result);
        return result;
    }

    /**
     * Adds a new node to this graph with a given ID and returns it.
     * The new node number equals the number of nodes at the
     * time of invocation.
     */
    public Node addNode(String id) {
        Node result = new Node(this, this.nodes.size(), id);
        this.nodes.add(result);
        return result;
    }

    /**
     * Returns the set of nodes in this graph.
     */
    public List<Node> getNodes() {
        return this.nodes;
    }

    /**
     * Returns an iterator over the nodes in this graph.
     */
    @Override
    public Iterator<Node> iterator() {
        return this.nodes.iterator();
    }

    /**
     * Returns the number of nodes in this graph.
     */
    public int size() {
        return this.nodes.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Graph with %d nodes%n", size()));
        for (Node node : this) {
            result.append(node.toString());
            result.append('\n');
        }
        return result.toString();
    }

    @Override
    public int hashCode() {
        return this.structure().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Graph)) {
            return false;
        }
        Graph other = (Graph) obj;
        return structure().equals(other.structure());
    }

    private Map<Integer, Set<Integer>> structure() {
        Map<Integer, Set<Integer>> result = new HashMap<>();
        for (Node node : getNodes()) {
            Set<Integer> targets = new HashSet<>();
            for (Node target : node.getEdges()) {
                targets.add(target.getNr());
            }
            result.put(node.getNr(), targets);
        }
        return result;
    }

    /**
     * Writes the current graph in .dot (graphviz) format to <filename>.
     * Google GraphViz for more information on the .dot format.
     * Example usage (with {@code g} a variable of type {@code Graph}:
     * <code>
     * try {
     * g.writeDOT("graph.dot", true);
     * } catch (IOException e) {
     * e.printStackTrace();
     * }
     * </code>
     * Thanks to Koen Braham for providing this code.
     *
     * @param filename Output filename for the destination of the DOT file
     * @param directed If True, then the edges are written as directed edges.
     * @throws IOException
     */
    public void writeDOT(String filename, boolean directed) throws IOException {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        Map<Node, Integer> nodeLabels = new HashMap<>();
        if (directed) {
            sb.append("digraph G {\r\n");
        } else {
            sb.append("graph G {\r\n");
        }

        // Define the nodes in the dot file and store node labels
        for (Node node : this) {
            sb.append("    ")
                    .append(i)
                    .append(" [penwidth=3,label=\"")
                    .append(node.getNr())
                    .append("_")
                    .append(node.getId())
                    .append("\",color=1, colorscheme=paired12] \r\n");
            nodeLabels.put(node, i);
            i++;
        }

        sb.append("\r\n");

        // Define the edges of all nodes using their defined label names
        for (Node node : this) {
            for (Node t : node.getEdges()) {
                sb.append("    ")
                        .append(nodeLabels.get(node))
                        .append(directed ? "->" : "--")
                        .append(nodeLabels.get(t))
                        .append(" [penwidth=2] \r\n");
            }
        }

        sb.append("}");
        Files.write(Paths.get(filename), sb.toString().getBytes());
    }
}
