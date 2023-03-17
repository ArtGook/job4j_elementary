package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public int max(int one, int two, int three, int four) {
        return max(one, two, max(three, four));
    }

    public static void main(String[] args) {
        int rsl1 = Max.max(20, 4);
        System.out.println("max value = " + rsl1);
        int rsl2 = Max.max(10, 12);
        System.out.println("max value = " + rsl2);
        int rsl3 = Max.max(23, 23);
        System.out.println("equals value = " + rsl3);
    }
}
