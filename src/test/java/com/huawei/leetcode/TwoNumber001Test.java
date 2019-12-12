package com.huawei.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoNumber001Test {

    @Test
    public void towNumbersSum() {
    }

    @Test
    public void towNumbersSum02() {
        //int[] nums = {2, 5, 5, 4};
        int[] nums = {2, 5, 5, 4};
        int target = 8;
        int[] result = TwoNumber001.towNumbersSum02(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}