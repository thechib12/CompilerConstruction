package pp.block6.cp;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Christiaan on 03-06-16.
 */
public class FibTest {


    public static void main(String[] args) {
        int n = 4;
        ExecutorService pool = Executors.newCachedThreadPool();

        try {
            Future<Integer> result = pool.submit(new FibonacciCallable(n, pool));
            System.out.println(result.get());


        } catch (Exception e) {

        }
        pool.shutdown();


    }
}
