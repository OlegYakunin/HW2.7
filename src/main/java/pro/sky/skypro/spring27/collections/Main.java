package pro.sky.skypro.spring27.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 6, 3, 4, 6, 4, 5, 5, 2, 7, 9, 44, 8));
    private static final List<String> wordList = new ArrayList<>(List.of("bones", "heart", "heart", "oh", "oh", "heart", "333", "3!1", "3!1"));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        List<Integer> result1 = task1(nums);
        System.out.println(result1);
        List<Integer> result2 = task2(nums);
        System.out.println(result2);
        Set<String> result3 = task3(wordList);
        System.out.println(result3);
        task4(wordList);
    }

    public static void checkDuplicates(List<String> strings){
        Set<String> stringsSet = new HashSet<>(strings);
        for (String stri : stringsSet) {
            int count = 0;
            for (String strj : strings) {
                if (stri.equals(strj)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static List<Integer> task1(List<Integer> nums) {
        System.out.println();
        System.out.println("Задание 1");
        List<Integer> list = new ArrayList<>();
        for (Integer num : nums) {
            if (num != null && num % 2 != 0) {
                list.add(num);
            }
        }
        return list;
    }

    public static List<Integer> task2(List<Integer> nums) {
        System.out.println();
        System.out.println("Задание 2 ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) != null && nums.get(i).equals(nums.get(j))) {
                    nums.set(j, null);
                }
            }
            if (nums.get(i) != null && nums.get(i) % 2 == 0) {
                list.add(nums.get(i));
                Collections.sort(list);
            }
        }
        return list;
    }

    public static Set<String> task3(List<String> list) {
        System.out.println();
        System.out.println("Задание 3");
        return new HashSet<>(wordList);
    }

    public static void task4(List<String> list) {
        System.out.println();
        System.out.println("Задание 4");
        checkDuplicates(strings);
    }
}
