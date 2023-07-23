import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача1 ");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.print(num);
            }
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new HashSet<>(nums);
            for (Integer number : set) {
                if (number % 2 == 0) {
                    System.out.print(number);
                }
            }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача3");
        Set<String> set1 = new HashSet<>(List.of("слава", "паша", "паша", "маша"));
        System.out.println(set1);
    }
    public static void task4() {
        System.out.println("Задача4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        int countA = Collections.frequency(strings, "один");
        int countB = Collections.frequency(strings, "два");
        int countC = Collections.frequency(strings, "три");
        System.out.print(countA + "\n" + countB + "\n" + countC);
    }
}