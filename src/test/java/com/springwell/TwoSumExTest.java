package com.springwell;

import com.springwell.leetocde.TwoSumEx;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TwoSumExTest {

    private TwoSumEx twoSumEx;

    @BeforeEach
    void setUp() {
        twoSumEx = new TwoSumEx();
    }

    @Test
    void twoSum_number_found() {
        int[] array = new int[]{1, 3, 7, 9, 2};
        int target = 11;
        int[] twoSum = twoSumEx.findTwoSum(array, target);
        assertThat(twoSum[0], equalTo(3));
        assertThat(twoSum[1], equalTo(4));
    }

    @Test
    void twoSum_number_not_found() {
        int[] array = new int[]{1, 3, 7, 9, 2};
        int target = 61;
        int[] twoSum = twoSumEx.findTwoSum(array, target);
        assertThat(twoSum, is(nullValue()));
    }

    @Test
    void twoSum_empty_array_will_return_null() {
        int[] array = new int[]{};
        int target = 61;
        int[] twoSum = twoSumEx.findTwoSum(array, target);
        assertThat(twoSum, is(nullValue()));
    }

    @Test
    void twoSum_empty_one_element_array_will_return_null() {
        int[] array = new int[]{11};
        int target = 11;
        int[] twoSum = twoSumEx.findTwoSum(array, target);
        assertThat(twoSum, is(nullValue()));
    }

    @Test
    void twoSum_empty_two_elements_array_success() {
        int[] array = new int[]{9, 2};
        int target = 11;
        int[] twoSum = twoSumEx.findTwoSum(array, target);
        assertThat(twoSum[0], equalTo(0));
        assertThat(twoSum[1], equalTo(1));
    }
}