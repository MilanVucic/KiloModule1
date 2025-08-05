package module_2.lesson_5.prio_queue;

import java.util.*;

public class MapPriorityQueue<T extends HasPriority> implements PriorityQueue<T>{
    //
    // 2 -> List{"glen"}
    // 1 -> List{"asd","asdf"}
    SortedMap<Integer, List<T>> entries;

    public MapPriorityQueue() {
        entries = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }

    @Override
    public void put(T elem) {
        List<T> list = entries.get(elem.getPriority());
        if (list != null) {
            list.add(elem);
        } else {
            list = new ArrayList<>();
            list.add(elem);
            entries.put(elem.getPriority(), list);
        }
    }

    @Override
    public T pop() {
        List<T> first = entries.firstEntry().getValue();
        if (first == null) {
            throw new IllegalStateException("Nothing in the queue.");
        }
        T elem = first.removeFirst();
        if (first.size() == 0) {
            entries.remove(entries.firstKey());
        }
        return elem;
    }

    @Override
    public int size() {
        int total = 0;
        for (List<T> sublist: entries.values()) {
            total += sublist.size();
        }
        return total;
    }
}
