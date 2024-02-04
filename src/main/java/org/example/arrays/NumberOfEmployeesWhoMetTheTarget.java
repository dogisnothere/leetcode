package org.example.arrays;

import java.util.Arrays;

public class NumberOfEmployeesWhoMetTheTarget {
    public static void main(String[] args) {
        int[] hours = new int[]{0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours,target));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int k = 0;
        for (int hour : hours) {
            if (hour >= target) {
                k++;
            }
        }
        return k;
    }
}
