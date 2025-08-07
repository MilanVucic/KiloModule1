package module_2.lesson_6;

public class NamePrinter {
    private String prefix;
    private String suffix;

    public NamePrinter(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public void printName(String name) {
        System.out.println(prefix);
        System.out.println(name);
        System.out.println(suffix);
    }
}
