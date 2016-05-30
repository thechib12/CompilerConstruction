package pp.block4.cc.cp;

/**
 * Created by Christiaan on 19-05-16.
 */
public interface BasicLock {


    public void lock(int thread_nr);


    public void unlock(int thread_nr);
}
