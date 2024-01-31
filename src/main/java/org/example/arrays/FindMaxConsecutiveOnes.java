package org.example.arrays;
/*
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 */
public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int count_max = 0;
        for (int num : nums) {
            if (num != 0) {
                count++;
                if (count_max < count) {
                    count_max = count;
                }
            } else {
                count = 0;
            }
        }
        return count_max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,0,1,1,1,0,1,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
