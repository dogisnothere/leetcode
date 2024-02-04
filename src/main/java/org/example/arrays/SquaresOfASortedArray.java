package org.example.arrays;
/*
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
 */



import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] resultArray = new int[len];
        int i = 0;
        int j = len-1;
        int a = 0;
        int b = 0;
        for(int k = 0; k < len; k++){
            a = nums[i]*nums[i];
            b = nums[j]*nums[j];

            if(a>=b) {
                resultArray[len - k - 1] = a;
                i++;
            } else {
                resultArray[len - k - 1] = b;
                j--;
            }
        }
        return resultArray;
    }
}
