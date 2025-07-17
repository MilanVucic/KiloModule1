package module_1.lesson_17;

import java.util.*;

public class Main {
    // Additional HW: Create a word counter that's given a String
    // and it displays the top words sorted by the number of occurrences
    public static void main(String[] args) {
        String sentence = "hello !@#$%$%^&*^^#$%@#$!#@" +
                "ššššćććčččšđđ this is a sentence where we would like to count letter occurrences.";


        Map<Character, Integer> map = getLetterCounts(sentence);
        SortedMap<Integer, List<Character>> result = getSortedCounts(map);

        for (Integer key: result.keySet()) {
            System.out.println(key + " -> " + result.get(key));
        }
    }

    // Takes a map like
    // a -> 5, b -> 3, c -> 5
    // and makes a sorted map that looks like
    // 5 -> [a,c], 3 -> b
    // 5 -> [a]
    private static TreeMap<Integer, List<Character>> getSortedCounts(Map<Character, Integer> countMap) {
        TreeMap<Integer, List<Character>> res = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (Character key: countMap.keySet()) {
            Integer count = countMap.get(key);
            if (res.containsKey(count)) {
                List<Character> list = res.get(count);
                list.add(key);
                res.put(count, list);
            } else {
                List<Character> list = new ArrayList<>();
                list.add(key);
                res.put(count, list);
            }
        }
        return res;
    }

    private static void treeMapExample() {
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        treeMap.put(5, "asd");
        treeMap.put(3, "asd");
        treeMap.put(12, "asd");
        treeMap.put(13, "asd");
        System.out.println(treeMap);
    }

    public static Map<Character, Integer> getLetterCounts(String sentence) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (result.containsKey(letter)) {
                int prevCount = result.get(letter);
                result.put(letter, prevCount + 1);
            } else {
                result.put(letter, 1);
            }

//            result.put(letter, result.getOrDefault(letter, 0) + 1);
        }
        return result;
    }
}
