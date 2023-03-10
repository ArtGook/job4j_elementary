package ru.job4j.array;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {30, 20, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {7, 4, -3, 2, 89};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-3, 2, 4, 7, 89};
        assertThat(result).containsExactly(expected);
    }
}