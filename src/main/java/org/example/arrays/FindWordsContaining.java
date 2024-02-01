package org.example.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
* You are given a 0-indexed array of strings words and a character x.
* Return an array of indices representing the words that contain the character x.
* Note that the returned array may be in any order.
* https://leetcode.com/problems/find-words-containing-character/description/
* */
public class FindWordsContaining {
    public static void main(String[] args) {
        String[] words = new String[]{"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words,x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new LinkedList<>();
        for(int i = 0; i < words.length; i++){
            for(char c : words[i].toCharArray()){
                if (c == x){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}
