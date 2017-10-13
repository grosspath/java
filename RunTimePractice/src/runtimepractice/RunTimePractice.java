/*
 * Copyright 2017 jerolg
 */

package runtimepractice;

// @author jerolgraves

import java.util.HashMap;

 
public class RunTimePractice {
    
    public static int findNumsOfRepetitions(String s, char c){
        int sum = 0;
        for(int i = 0; i < s.length(); i ++){
            if (s.charAt(i) == c){
                sum++;
            }
        }
        return sum;
    }
    
    public static int[] findNumsV1(String s, char[] c){
        int[] sums = new int[c.length];
        for(int i = 0; i < s.length(); i ++){
            for (int j = 0; j < c.length; j++){
                if (s.charAt(i) == c[j]){
                    sums[j] = sums[j] + 1;
                }
            }
        } return sums;
    }
    
    public static int[] findNumsV2(String s, char[] c){
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <s.length(); i ++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
                
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum + 1);
            }
        }
        
        for (int j = 0; j < c.length; j++){
            int sum;
            if (!map.containsKey(c[j])){
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
       return sums; 
    }

    // @param args the command line arguments

    public static void main(String[] args) {
        // WRITE CODE HERE
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("abcaad;flads;asd;lhasd;klhasd;asd;liasds;liassd;liajsd;laisd;oiasf;ias", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test: "+ duration+"ms");
        
        char[] a = {'a', 'b'};
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsV1("abcabcaad;flads;asd;lhasd;klhasd;asd;liasds;liassd;liajsd;laisd;oiasf;ias", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: "+ duration+"ms");
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsV2("abcabcaad;flads;asd;lhasd;klhasd;asd;liasds;liassd;liajsd;laisd;oiasf;ias", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: "+ duration+"ms");
                
    }

}
