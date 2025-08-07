package module_2.lesson_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> myComparatorFunction = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };
        Comparator<Integer> myComparatorFunction2 = (a, b) -> {
            return a.compareTo(b);
        };
        Comparator<Integer> myComparatorFunction3 = (a, b) -> a - b;
        Comparator<Integer> myComparatorFunction4 = Integer::compareTo;
        Comparator<Integer> myComparatorFunction5 = Main::myCustomCompare;
        SortedMap<Integer, String> map = new TreeMap<>(myComparatorFunction);

        List<String> names = new ArrayList<>();
        names.add("Milan");
        names.add("Glen");
        names.add("Jay");
        names.add("Alexandra");
        names.add("Lolita");
        List<String> filtered = names.stream()
                .filter(a -> a.length() > 3)
                .sorted((a, b) -> b.length() - a.length())

                .toList();
        boolean anyNamesLongerThan10 = names.stream().allMatch(s -> s.length() < 10);
        Optional<String> nameOnL = names.stream()
                .filter(s -> s.charAt(0) == 'L')
                .filter(s -> s.length() > 10)
                .findAny();
        System.out.println(nameOnL.orElse("Nothing found"));
        System.out.println(anyNamesLongerThan10);

        NamePrinter namePrinter = new NamePrinter("____", "*****");
        names.forEach(namePrinter::printName);
    }

    private static int myCustomCompare(Integer a, Integer b) {
        return a - b;
    }
}
