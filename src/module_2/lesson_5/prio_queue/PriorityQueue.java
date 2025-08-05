package module_2.lesson_5.prio_queue;

public interface PriorityQueue<T extends HasPriority> {
    void put(T elem);
    T pop();
    int size();
}
