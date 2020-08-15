package com.ashokit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.*;
import java.util.stream.IntStream;
//approach1 :- using predefined liberaris like collection
//approach2 :- using without  predefined liberaris with less time and space complexity
//approach3 :- using java 8 
public class SecondLargestAndSecondMin {
  // using  predifined methods

  public static void solution1(int[] arr) {
    List listOfEle = null;
    Set listOfVal = null;
    listOfEle = new ArrayList();
    listOfVal = new HashSet();
    for (int x : arr) {
      listOfEle.add(x);
    }
    listOfVal.addAll(listOfEle);
    listOfEle.clear();
    listOfEle.addAll(listOfVal);
    Collections.sort(listOfEle);
    System.out.println("second min = " + listOfEle.get(1));
    System.out.println("second max =  " + listOfEle.get(listOfEle.size() - 2));
  }
  // using  without predifined methods

  public static void solution2(int[] arr) {
    int arrLen = arr.length;
    int i, j = 0;
    int resSum = 0 ;
    Arrays.sort(arr);
    for (i = 0; i < arrLen-1; i++) {
      if (arr[i] != arr[i + 1]) {
       arr[j++]  = arr[i];
      }
    }
    arr[j++] = arr[arrLen-1];
    //to print orginal array 
    System.out.println("second min = " + arr[1]);
    System.out.println("second max = " + arr[j-2]);
  }

  // using  java 8
  public static void solution3(int[] arr) {
    int[] resArr = null;
    IntStream streamOfVal = null;
    streamOfVal = Arrays.stream(arr).sorted();
    resArr = streamOfVal.distinct().toArray();
    System.out.println("second min = " + resArr[1]);
    System.out.println("second max = " + resArr[resArr.length - 2]);
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 5, 9, 6, 4, 7, 2};
    solution1(arr);
    solution2(arr);
    solution3(arr);

  }
}
