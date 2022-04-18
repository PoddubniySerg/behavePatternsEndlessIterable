import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min, max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min + 1;
        this.max = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    class RandomsIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min) + min;
        }
    }
}