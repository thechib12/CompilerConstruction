package pp.block5.cp;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Christiaan on 27-05-16.
 */
public class LockFreeBarrier implements Barrier {
    private final int height;
    private AtomicInteger status;
    private AtomicInteger numReleased;
    private volatile boolean release;

    public LockFreeBarrier(int height) {
        this.height = height;
        status = new AtomicInteger(height);
        numReleased = new AtomicInteger(0);

    }

    @Override
    public int await() throws InterruptedException {
        int setStatus = status.decrementAndGet();
        if (setStatus == 0) {
            status.set(height);
            numReleased.set(0);
            release = true;

        }

        do {
            Thread.yield();
        } while (
                !release
                );
        int releaseNum = numReleased.incrementAndGet();
        if (releaseNum == height) {
            release = false;
        }

        return setStatus;
    }
}
