package deque;

import java.util.Comparator;
import java.util.Iterator;

public class Maximizer61B {
    /**
     * Returns the maximum element from the given iterable of comparables.
     * You may assume that the iterable contains no nulls.
     *
     * @param iterable the Iterable of T
     * @return the maximum element
     */
    public static <T extends Comparable<T>> T max(Iterable<T> iterable) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return null;
        }

        T max = iterator.next();

        while (iterator.hasNext()) {
            T next = iterator.next();
            if (max.compareTo(next) < 0) {
                max = next;
            }
        }

        return max;
    }

    /**
     * Returns the maximum element from the given iterable according to the specified comparator.
     * You may assume that the iterable contains no nulls.
     *
     * @param iterable the Iterable of T
     * @param comp     the Comparator to compare elements
     * @return the maximum element according to the comparator
     */
    public static <T> T max(Iterable<T> iterable, Comparator<T> comp) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return null;
        }

        T max = iterator.next();

        while (iterator.hasNext()) {
            T next = iterator.next();
            if (comp.compare(max, next) < 0) {
                max = next;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayDeque61B<Integer> ad = new ArrayDeque61B<>();
        ad.addLast(5);
        ad.addLast(12);
        ad.addLast(17);
        ad.addLast(23);
        System.out.println(max(ad));
    }
}
