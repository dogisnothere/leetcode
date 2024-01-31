package org.example.arrays;
/*
* Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
* https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
* */
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = new String[]{"a","bc"};
        String[] word2 = new String[]{"ab","c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = String.join("",word1);
        String w2 = String.join("",word2);
        if(w1.length() != w2.length()) {
            return false;
        } else {
            return String.join("",word1).equals(String.join("",word2));
        }
    }
}
