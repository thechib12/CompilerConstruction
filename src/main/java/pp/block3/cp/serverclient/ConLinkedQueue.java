package pp.block3.cp.serverclient;

import pp.block1.queue.*;


import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Rogier on 19-04-16.
 */
public class ConLinkedQueue<T> implements Queue<T> {
    private ConcurrentLinkedQueue<T> list;

    public ConLinkedQueue() {
        list = new ConcurrentLinkedQueue<>();
    }

    @Override
    public void push(T x) {
        list.add(x);
    }

    @Override
    public T pull() throws QueueEmptyException {
        return list.poll();
    }

    @Override
    public int getLength() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}