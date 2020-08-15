package com.ashokit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.stream.IntStream;

//approach1 :- using predefined liberaris like collection
//approach2 :- using without  predefined liberaris with less time and space complexity
//approach3 :- using java 8 
public class RemoveDuplicate {
	

  public static void solution1(int[] arr) {
    HashMap hMap = null;
    int arrLen = arr.length;
    int i;
    Set keys = null;
    Iterator itrtor = null;
    //create hashmap and keep count of every number
    hMap = new HashMap();
    for (i = 0; i < arrLen; i++) {
      if (hMap.get(arr[i]) == null) {
        hMap.put(arr[i], 1);
      } else {
        hMap.put(arr[i], (int) hMap.get(arr[i]) + 1);
      }
    }
    //count is greater than 1 we have to print in console
    keys = hMap.entrySet();
    itrtor = keys.iterator();
    while (itrtor.hasNext()) {
      Map.Entry keyValue = (Map.Entry) itrtor.next();
      System.out.println(keyValue.getKey());
    }
  }

  public static void solution3(int[] arr) {
    // Using Arrays.stream() to convert 
    // array into Stream 
    IntStream stream = null;
    stream = Arrays.stream(arr);
    stream.distinct().forEach(System.out::println);
  }

  public static void solution2(int[] arr) {
    int arrLen = arr.length;
    int i, j = 0;
    Arrays.sort(arr);
    for (i = 0; i < arrLen-1; i++) {
      if (arr[i] != arr[i + 1]) {
       arr[j++]  = arr[i];
      }
    }
    arr[j++] = arr[arrLen-1];
    //to print orginal array 
    for(i=0;i<j;i++){
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 5, 5, 5, 6, 6, 7, 2};
//    solution1(arr);
    solution2(arr);
//    solution3(arr);

  }
}
