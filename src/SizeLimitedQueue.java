import java.util.LinkedList;

public class SizeLimitedQueue<E> extends LinkedList<E> {

    private final int SizeLimitOfQueue;

    public SizeLimitedQueue(int SizeLimitOfQueue) {
        this.SizeLimitOfQueue = SizeLimitOfQueue;
    }

    @Override
    public boolean add(E o) {
        while (this.size() == SizeLimitOfQueue) {
            super.remove();
        }
        super.add(o);
        return true;
    }
}