package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double act1 = x2 - x1;
        double act2 = y2 - y1;
        double act3 = Math.pow(act1, 2);
        double act4 = Math.pow(act2, 2);
        double act5 = act3 + act4;
        double rsl = Math.sqrt(act5);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
