package com.ashokit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//approach1 :- using predefined liberaris like collection
//approach2 :- using without  predefined liberaris with less time and space complexity
//approach3 :- using java 8 

public class DuplicateProgram1FrstAprch {

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
      if ((int) keyValue.getValue() != 1) {
        System.out.println(keyValue.getKey());
      }
    }

  }
  // bruteforce approach

  public static void solution2(int[] arr) {
    int arrLen = 0;
    int i, j = 0, count = 0;
    int[] duplctArr = null;
    arrLen = arr.length;
    duplctArr = new int[arrLen];
    Arrays.sort(arr);
    for (i = 0; i < arrLen - 1; i++) {
      j = i + 1;
      if (arr[i] == arr[j]) {
        j++;
        count++;
        continue;
      }

      i = j - 1;
      if (count >= 1) {
        count = 0;
        System.out.println(arr[i]);
      }
    }
  }

  public static void solution3(int[] arr) {
    List listOfVal1 = null;
    Set listOfVal2 = new HashSet();
    listOfVal1 = new ArrayList();
    //add values to list
    for (int x : arr) {
      listOfVal1.add(x);
    }
    listOfVal1.stream()
      .filter(n -> !listOfVal2.add(n))
      .forEach(System.out::println);

  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 5, 5, 5, 6, 6, 7, 2};
    solution1(arr);
    solution2(arr);
    solution3(arr);

  }
}
