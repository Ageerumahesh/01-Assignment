package com.ashokit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//approach1 :- using predefined liberaris like collection
//approach2 :- using without  predefined liberaris with less time and space complexity
//approach3 :- using java 8 

public class FindMinAndMax {
 
  public static void solution1(int[] arr) {
    int max = 0, min = 0 ;
    List<Integer> setOfVal = null;
    setOfVal = new ArrayList();
    for (int x : arr) {
      setOfVal.add(x);
    }
    min = Collections.min(setOfVal);
    max = Collections.max(setOfVal);
    System.out.println("min = " + min +" max = "+max);
  }

  public static void solution2(int[] arr) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    int i = 0;
    int arrLen = arr.length;
    for (i = 0; i < arrLen; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println("min ="+min +"max ="+max);
  }

  //using java 8
  public static void solution3(int[] arr) {
    int max = 0, min = 0;
    max = Arrays.stream(arr).max().getAsInt();
    min = Arrays.stream(arr).min().getAsInt();
   System.out.println("min = " + min +" max = "+max);
  }

  public static void main(String[] args) {
    int[] arr = {6, 8, 1, 9, 2, 1, 10};
    solution1(arr);
    solution2(arr);
    solution3(arr);

  }
}

