package com.ashokit;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//approach1 :- using predefined liberaris like collection
//approach2 :- using without  predefined liberaris with less time and space complexity
//approach3 :- using java 8 

public class SumOfUniqueEle {

  public static void solution1(int[] arr) {
    HashMap hMap = null;
    int arrLen = arr.length;
    int i;
    Set keys = null;
    Iterator itrtor = null;
    int resultSum = 0;
    //create hashmap and keep count of every number
    hMap = new HashMap();
    for (i = 0; i < arrLen; i++) {
      if (hMap.get(arr[i]) == null) {
        hMap.put(arr[i], 1);
      } else {
        hMap.put(arr[i], (int) hMap.get(arr[i]) + 1);
      }
    }
    //sum of unique elements in arr
    keys = hMap.entrySet();
    itrtor = keys.iterator();
    while (itrtor.hasNext()) {
      Map.Entry keyValue = (Map.Entry) itrtor.next();
      resultSum = resultSum + (int) keyValue.getKey();
    }
    System.out.println(resultSum);
  }

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
    for(i=0;i<j;i++){
      resSum = resSum+ arr[i];
    }
    System.out.println(resSum);
  }
  //using java8

  public static void solution3(int[] arr) {
    int resultSum = 0;
    IntStream streamOfEle = null;
    streamOfEle = Arrays.stream(arr);
    resultSum = streamOfEle.distinct().sum();
    System.out.println(resultSum);
  }

  public static void main(String[] args) {
    int[] arr = {1, 6, 4, 3, 2, 2, 3, 8, 1};
    solution1(arr);
    solution2(arr);
    solution3(arr);
  }
}
