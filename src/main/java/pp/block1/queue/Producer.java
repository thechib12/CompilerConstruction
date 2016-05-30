package pp.block1.queue;

/**
 * Created by Rogier on 19-04-16.
 */
public class Producer implements Runnable{
    private Queue<String> queue;

    public Producer(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        queue.push("Item");
    }
}
