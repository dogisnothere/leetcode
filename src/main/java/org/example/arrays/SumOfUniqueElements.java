package org.example.arrays;

import java.util.Arrays;

/*
* You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
* Return the sum of all the unique elements of nums.
* https://leetcode.com/problems/sum-of-unique-elements/description/
* */
public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        int count = 1;

        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
            } else {
                if (count == 1) {
                    sum = sum + nums[i-1];
                }
                count=1;
            }
        }
        if(count == 1){
            sum = sum + nums[nums.length-1];
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,4,4,6,6};
        System.out.println(sumOfUnique(nums));
    }


}
