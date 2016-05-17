package pp.block3.cp.serverclient;

/**
 * Created by Christiaan on 10-05-16.
 */
public class LeftRightDeadlock {

    private static int counter = 0;
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() {
        synchronized (left) {
            synchronized (right) {
                System.out.println("leftRIGHT!");
                counter++;
            }
        }
    }

    public void rightLeft() {
        synchronized (right) {
            synchronized (left) {
                System.out.println("rightLEFT!");
                counter--;
            }
        }
    }


}
