package pp.block3.cp.serverclient;

/**
 * Created by Christiaan on 10-05-16.
 */
public class LeftRightTest implements Runnable {

    LeftRightDeadlock deadlock;

    public LeftRightTest(LeftRightDeadlock deadlock) {
        this.deadlock = deadlock;
    }

    public static void main(String[] args) {
        LeftRightDeadlock deadlock = new LeftRightDeadlock();

        for (int i = 0; i < 100; i++) {
            LeftRightTest thread = new LeftRightTest(deadlock);
            Thread r = new Thread(thread);
            r.start();
        }
        System.out.println("done!");
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            deadlock.leftRight();
            deadlock.rightLeft();
        }
    }
}
