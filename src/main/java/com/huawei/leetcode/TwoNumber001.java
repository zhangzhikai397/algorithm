package com.huawei.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 【leetcode-简单-1 题目描述】给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoNumber001 {
    // 暴力破解法,两次循环， 时间复杂度 O(n^2)
    public static int[] towNumbersSum(int[] nums, int target) {
        int[] towIndex = null;
        if (nums == null || nums.length == 0) {
            return towIndex;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if ((nums[i] + nums[j]) == target) {
                    towIndex = new int[2];
                    towIndex[0] = i;
                    towIndex[1] = j;
                    return towIndex;
                }
            }
        }
        return towIndex;
    }

    /**
     * 非暴力破解法, 用空间换时间, 使用Map结构
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] towNumbersSum02(int[] nums, int target) {
        int[] index = new int[2];
        if (nums == null || nums.length == 0) {
            return index;
        }
        Map<Integer, Integer> hashTable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(nums[i])) {
                index[0] = i;
                index[1] = hashTable.get(nums[i]);
                return index;
            }

            hashTable.put(target - nums[i], i);
        }
        return index;
    }
}
