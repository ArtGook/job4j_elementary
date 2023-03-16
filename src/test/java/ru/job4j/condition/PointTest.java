package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when09to02then2() {
        Point distance = new Point(0, 9);
        Point that = new Point(0, 2);
        distance.distance(that);
        double expected = 7.0;
        assertThat(distance.distance(that)).isEqualTo(expected);
    }

    @Test
    public void when19to13then2() {
        Point distance = new Point(1, 9);
        Point that = new Point(1, 3);
        distance.distance(that);
        double expected = 6.0;
        assertThat(distance.distance(that)).isEqualTo(expected);
    }

    @Test
    public void when50to10then2() {
        Point distance = new Point(5, 0);
        Point that = new Point(1, 0);
        distance.distance(that);
        double expected = 4.0;
        assertThat(distance.distance(that)).isEqualTo(expected);
    }
}