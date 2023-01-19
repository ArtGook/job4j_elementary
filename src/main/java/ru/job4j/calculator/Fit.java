package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short mHeight) {
        double rsl = (mHeight - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short wHeight) {
        double rsl = (wHeight - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short wHeight = 170;
        short mHeight = 187;
        double woman = Fit.womanWeight(wHeight);
        double man = Fit.manWeight(mHeight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
