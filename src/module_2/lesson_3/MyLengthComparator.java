package module_2.lesson_3;

import java.util.Comparator;

public class MyLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
