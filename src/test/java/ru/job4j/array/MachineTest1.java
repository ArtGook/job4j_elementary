package ru.job4j.array;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MachineTest1 {

    @Test
    public void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}