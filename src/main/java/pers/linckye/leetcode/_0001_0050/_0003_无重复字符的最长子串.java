package pers.linckye.leetcode._0001_0050;

import java.util.HashSet;
import java.util.Set;

/**
 * @author linckye
 */
public class _0003_无重复字符的最长子串 {


    /**
     * 难度：中等
     *
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
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
     *
     */
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            boolean add = set.add(c);
            if (add) {
                maxLength = Math.max(maxLength, ++right - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        System.out.println(integers.add(1));
        System.out.println(integers.add(1));
    }

}
