package org.example.arrays;
/*
* You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i-th customer has in the j-th bank.
* Return the wealth that the richest customer has.
* https://leetcode.com/problems/richest-customer-wealth/description/
 * */
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max_amount = 0;
        int amount = 0;
        for(int[] account : accounts){
            for(int money : account){
                amount = amount + money;
            }
            if (amount > max_amount){
                max_amount = amount;
            }
            amount = 0;
        }
        return max_amount;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{new int[]{1,2},new int[]{4,5,7}};
        System.out.println(maximumWealth(a));
    }
}
