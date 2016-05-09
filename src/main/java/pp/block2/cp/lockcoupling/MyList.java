package pp.block2.cp.lockcoupling;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Christiaan on 02-05-16.
 */
public class MyList implements List {
//    @Override
    List<Object> list;

    public MyList(){


    }
    public void insert(int pos, Object val) {

    }

    @Override
    public void add(Object val) {

    }

    @Override
    public void remove(Object item) {

    }

    @Override
    public void delete(int pos) {

    }

    @Override
    public int size() {
        return 0;
    }
}

class Node<T> {
    private T data;
    private Lock lock;
    private Node previous;
    private Node next;


    public Node(T data, Node previous, Node next){
        this.data = data;
        this.lock = new ReentrantLock();
        this.previous = previous;

    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        synchronized (this){
            return next;

        }

    }
}