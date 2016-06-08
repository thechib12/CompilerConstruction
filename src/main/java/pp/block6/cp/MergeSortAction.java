package pp.block6.cp;

import java.util.concurrent.RecursiveAction;

/**
 * Created by Christiaan on 03-06-16.
 */
public class MergeSortAction extends RecursiveAction {
    private int begin;
    private int end;
    private int[] arr;

    public MergeSortAction(int[] arr, int begin, int end) {
        this.begin = begin;
        this.end = end;
        this.arr = arr;
    }


    @Override
    protected void compute() {

        int half = arr.length / 2;
        MergeSortAction action1 = new MergeSortAction(arr, begin, half);
    }
}
