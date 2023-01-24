package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float inDollar = 180;
        float expectedEuro = 2;
        float expectedDollar = 3;
        float outEuro = Converter.rubleToEuro(inEuro);
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2 euro. Test result: " + passedEuro);
        System.out.println("180 rubles are 3 dollars. Test result: " + passedDollar);
    }
}
