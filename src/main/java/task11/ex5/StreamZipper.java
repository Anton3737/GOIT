package task11.ex5;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamZipper {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        ZipperIterator<T> iterator = new ZipperIterator<>(first.iterator(), second.iterator());
        Iterable<T> iterable = () -> iterator;

        return StreamSupport.stream(iterable.spliterator(), false)
                .onClose(() -> {
                    closeSilently(first);
                    closeSilently(second);
                });
    }

    private static void closeSilently(Stream<?> stream) {
        try {
            stream.close();
        } catch (Exception ignored) {
            // Ignore exceptions on close
        }
    }

    private static class ZipperIterator<T> implements Iterator<T> {
        private final Iterator<T> iteratorFirst;
        private final Iterator<T> iteratorSecond;

        private boolean useFirst = true;

        public ZipperIterator(Iterator<T> iteratorFirst, Iterator<T> iteratorSecond) {
            this.iteratorFirst = iteratorFirst;
            this.iteratorSecond = iteratorSecond;
        }

        @Override
        public boolean hasNext() {
            return iteratorFirst.hasNext() || iteratorSecond.hasNext();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements");
            }
            T next;
            if (useFirst) {
                next = iteratorFirst.next();
            } else {
                next = iteratorSecond.next();
            }
            useFirst = !useFirst;
            return next;
        }
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream2 = Stream.of(5, 6, 7, 8, 9);

        Stream<Integer> zippedStream = zip(stream1, stream2);

        zippedStream.forEach(System.out::println);
    }
}
