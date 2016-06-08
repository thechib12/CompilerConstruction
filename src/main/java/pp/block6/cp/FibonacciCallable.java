package pp.block6.cp;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * Created by Christiaan on 03-06-16.
 */
public class FibonacciCallable implements Callable {
    int n;
    ExecutorService pool;

    public FibonacciCallable(int n, ExecutorService pool) {
        this.n = n;
        this.pool = pool;
    }


    @Override
    public Integer call() throws Exception {
        if (n > 1) {
            try {
                Future<Integer> left = pool.submit(new FibonacciCallable(n - 1, pool));
                Future<Integer> right = pool.submit(new FibonacciCallable(n - 1, pool));
                return left.get() + right.get();
            } catch (Exception e) {
                System.out.println("hoi");
            }
        } else {
            return new Integer(1);
        }
        return null;
    }
}
