package com.huawei.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 【leetcode-中等-3 题目描述】给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestSubstring003 {
    /**
     * 求给定字符串的最长子串的长度
     * 题解思路
     *
     * @param str
     * @return
     */
    public static int lengthOfLongestSubstring(String str) {
        if (str.length() == 0) {
            return 0;
        }
        // 字符串长度
        int len = str.length();
        // 最大子串长度
        int maxSubLen = 0;
        // 左边定位非重复位置
        int leftPos = 0;
        // 使用Map结构做滑动窗口
        Map<Character, Integer> hashTable = new HashMap<Character, Integer>();
        // 遍历字符串
        for (int i = 0; i <= len - 1; i++) {
            Character curChar = str.charAt(i);
            if (hashTable.containsKey(curChar)) {
                leftPos = Math.max(hashTable.get(curChar) + 1, leftPos);
            }
            // 如果hashTable里面没有curChar字符, 则直接添加到hashTable中
            hashTable.put(curChar, i);
            maxSubLen = Math.max(maxSubLen, i - leftPos + 1);
        }
        return maxSubLen;
    }
}
