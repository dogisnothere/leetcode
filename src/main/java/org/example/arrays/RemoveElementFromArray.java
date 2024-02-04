package org.example.arrays;

/*
* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
* The order of the elements may be changed.
* Then return the number of elements in nums which are not equal to val.
*
* https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
* */

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int c;
        for(int i = 0; i < nums.length; i++){
            c = nums[i];
            if (c !=val) {
                nums[k] = c;
                k++;
            }
        }
        return k;
    }
}
