package com.ashokit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//approach1 :- using predefined liberaris like collection
//approach2 :- using without  predefined liberaris with less time and space complexity
//approach3 :- using java 8 

public class DiffOfTwoNum {

  public static void solution1(int[] arr) {
    int max = 0, min = 0, diff = 0;
    List<Integer> setOfVal = null;
    setOfVal = new ArrayList();
    for (int x : arr) {
      setOfVal.add(x);
    }
    min = Collections.min(setOfVal);
    max = Collections.max(setOfVal);
    diff = max - min;
    System.out.println("difference is = " + diff);
  }

  public static void solution2(int[] arr) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, diff = 0;
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
    diff = max - min;
    System.out.println("difference is = " + diff);
  }

  //using java 8
  public static void solution3(int[] arr) {
    int max = 0, min = 0, diff = 0;

    max = Arrays.stream(arr).max().getAsInt();
    min = Arrays.stream(arr).min().getAsInt();
    diff = max - min;
    System.out.println("difference is = " + diff);
  }

  public static void main(String[] args) {
    int[] arr = {6, 8, 1, 9, 2, 1, 10};
    solution1(arr);
    solution2(arr);
    solution3(arr);

  }
}
