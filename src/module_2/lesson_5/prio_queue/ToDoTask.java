package module_2.lesson_5.prio_queue;

public class ToDoTask implements HasPriority{
    private ToDoPrio priority;
    private String name;
    private String description;

    public ToDoTask(ToDoPrio priority, String name, String description) {
        this.priority = priority;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return priority + " " + name + " " + description;
    }

    @Override
    public int getPriority() {
        return priority.ordinal();
    }
}
