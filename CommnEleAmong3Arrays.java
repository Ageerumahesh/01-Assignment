package com.ashokit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

//approach1 :- using predefined liberaris like collection
//approach2 :- using without  predefined liberaris with less time and space complexity
//approach3 :- using java 8 

public class CommnEleAmong3Arrays {
	

  public static void solution1(int[] arr1, int[] arr2, int[] arr3) {
    ArrayList listOfVal1, listOfVal2, listOfVal3 = null;
    listOfVal1 = new ArrayList();
    listOfVal2 = new ArrayList();
    listOfVal3 = new ArrayList();
    //copy arr in list
    for (int x : arr1) {
      listOfVal1.add(x);
    }
    for (int x : arr2) {
      listOfVal2.add(x);
    }
    for (int x : arr3) {
      listOfVal3.add(x);
    }
    listOfVal1.retainAll(listOfVal2);
    listOfVal1.retainAll(listOfVal3);
    System.out.println("common elements are " + listOfVal1);
  }

  public static void solution2(int[] arr1, int[] arr2, int[] arr3) {
    int i = 0, j = 0, k = 0;
    int arrLen1 = arr1.length;
    int arrLen2 = arr2.length;
    int arrLen3 = arr3.length;
    while (i < arrLen1 && j < arrLen2 && k < arrLen3) {
      if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
        System.out.println("common elements are " + arr1[i]);
        i++;
        j++;
        k++;
      } else if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr2[j] < arr3[k]) {
        j++;
      } else {
        k++;
      }
    }
  }

  public static void solution3(int[] arr1, int[] arr2, int[] arr3) {
    Integer[] arrVal1 = Arrays.stream(arr1)
      .boxed()
      .toArray(Integer[]::new);
    Integer[] arrVal2 = Arrays.stream(arr2)
      .boxed()
      .toArray(Integer[]::new);
    Integer[] arrVal3 = Arrays.stream(arr3)
      .boxed()
      .toArray(Integer[]::new);
    for (Integer y : arrVal3) {
      for (Integer x : arrVal2) {
        Stream.of(arrVal1).filter(value -> (value.compareTo(x) == 0))
                          .filter(value -> (value.compareTo(y) == 0))
                          .forEach(System.out::println);
      }
    }
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 5, 10, 20, 40, 80};
    int[] arr2 = {6, 7, 20, 80, 100};
    int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
    solution1(arr1, arr2, arr3);
    solution2(arr1, arr2, arr3);
    solution3(arr1, arr2, arr3);

  }
}
