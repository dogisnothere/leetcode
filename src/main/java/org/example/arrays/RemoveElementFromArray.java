package org.example.arrays;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }

//    public static int removeElement(int[] nums, int val) {
//        int k = 0;
//        for(int i = 0; i < nums.length; i++){
//            int c = nums[i];
//            if(c!=val){
//                nums[k] = c;
//                k++;
//            }
//        }
//        return k;
//    }

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
