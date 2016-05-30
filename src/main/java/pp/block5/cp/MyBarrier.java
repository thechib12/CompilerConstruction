package pp.block5.cp;

/**
 * Created by Christiaan on 27-05-16.
 */
public class MyBarrier implements Barrier {
    private final int height;
    private int status;

    public MyBarrier(int h) {
        height = h;
        status = height;
    }

    @Override
    public synchronized int await() throws InterruptedException {
        int setStatus = --status;
        if (status == 0) {
            status = height;
            notifyAll();

        } else {
            wait();
        }
        return setStatus;
    }

}
