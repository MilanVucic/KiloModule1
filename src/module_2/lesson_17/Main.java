package module_2.lesson_17;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Example.class;
        Example e = new Example(10);
        System.out.println(e.getA());
        try {
            Field a = clazz.getDeclaredField("a");
            a.setAccessible(true);
            a.set(e, 999);
            a.setAccessible(false);
        } catch (NoSuchFieldException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println(e.getA());
    }

    private static void constructors(Class<?> clazz) {
        try {
            Constructor<Example> constructor = (Constructor<Example>) clazz.getDeclaredConstructor(int.class);
            Example e = constructor.newInstance(9);
            System.out.println(e.getA());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void methods(Class<?> clazz) {
        Example e1 = new Example(50);
        Example e2 = new Example(500);
        try {
            Method method = clazz.getDeclaredMethod("doStuff", double.class, String.class);
            method.setAccessible(true);
            method.invoke(e2, 9.5, "hello");
            method.setAccessible(false);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void doStuff(Integer... numbers) {

    }

    private static void fields(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("--------");
            System.out.println(f.getName() + " " + f.getType().getSimpleName());
            int modifiers = f.getModifiers(); // 129 -> 10000001
            // Modifiers -> 1001101101 -> public?
            //              0000000001 -> MASK FOR PUBLIC
            //              0000000001
            // Modifiers -> 1001101101 -> final?
            //              0000010000 -> MASK FOR FINAL
            //              0000000000
            boolean isPublic = (modifiers & Modifier.PUBLIC) > 0;
            boolean isFinal = (modifiers & Modifier.FINAL) > 0;
            System.out.println(isFinal);
            System.out.println(isPublic);
            System.out.println("--------");
        }
    }
}
