package pp.block5.cp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christiaan on 27-05-16.
 */
public class LockFreeStackTester {

    public static void main(String[] args) {
        LockFreeStackTester stackTest = new LockFreeStackTester();
        stackTest.test();


    }

    public void test() {
        List<Thread> threads = new ArrayList<>();
        LockFreeStackInterface<Integer> stack = new LockFreeStack<>(1000);
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new ProdCons(stack));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(stack.getLength());
    }
}
