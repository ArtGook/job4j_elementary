package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void when20To4Then20() {
        int left = 20;
        int right = 4;
        int out = Max.max(left, right);
        int expected = 20;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void when10To12Then12() {
        int left = 10;
        int right = 12;
        int out = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void when23To23Then23() {
        int left = 23;
        int right = 23;
        int out = Max.max(left, right);
        int expected = 23;
        Assert.assertEquals(out, expected);
    }
}