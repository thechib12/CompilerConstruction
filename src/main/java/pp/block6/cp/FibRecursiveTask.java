package pp.block6.cp;

import java.util.concurrent.RecursiveTask;

/**
 * Created by Christiaan on 03-06-16.
 */
public class FibRecursiveTask extends RecursiveTask<Integer> {
    private int n;

    public FibRecursiveTask(int n) {
        this.n = n;
    }


    @Override
    protected Integer compute() {
        if (n > 1) {
            FibRecursiveTask left = new FibRecursiveTask(n - 1);
            FibRecursiveTask right = new FibRecursiveTask(n - 2);
            left.fork();
            Integer right_answer = right.compute();
            Integer left_answer = left.join();
            return left_answer + right_answer;

        } else {
            return new Integer(1);
        }

    }
}
