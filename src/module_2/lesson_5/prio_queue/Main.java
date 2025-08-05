package module_2.lesson_5.prio_queue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<ToDoTask> prioQueue = new MapPriorityQueue<>();
        prioQueue.put(new ToDoTask(ToDoPrio.LOW, "Trash", "Take it out"));
        prioQueue.put(new ToDoTask(ToDoPrio.LOW, "Trash", "Buy new bags"));
        prioQueue.put(new ToDoTask(ToDoPrio.MEDIUM, "Learn", "Study Spanish"));
        prioQueue.put(new ToDoTask(ToDoPrio.HIGH, "Go To Work", "$$$$"));
        prioQueue.put(new ToDoTask(ToDoPrio.LOW, "Work out", "...."));

        System.out.println(prioQueue.pop());
        System.out.println(prioQueue.pop());
        prioQueue.put(new ToDoTask(ToDoPrio.HIGH, "Go To Work on Weekend", "$$$$"));
        System.out.println(prioQueue.pop());
        System.out.println(prioQueue.pop());
        System.out.println(prioQueue.pop());
        System.out.println(prioQueue.pop());
    }
}
