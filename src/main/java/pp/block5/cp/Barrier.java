package pp.block5.cp;

/**
 * Created by Christiaan on 27-05-16.
 */
public interface Barrier {
    public int await() throws InterruptedException;
}
