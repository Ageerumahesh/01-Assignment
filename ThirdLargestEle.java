package com.ashokit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//approach1 :- using predefined liberaris like collection
//approach2 :- using without  predefined liberaris with less time and space complexity
//approach3 :- using java 8 

public class ThirdLargestEle {

  public static void solution1(int[] arr) {
    int arrLen = arr.length;
    Set listOfVal  = null;
    if (arrLen < 3) {
      System.out.println("Invalid input , please give elements atleast 3");
    }
    listOfVal = new HashSet();
    for(int x  : arr){
      listOfVal.add(x);
    }
    Object[] resArr = listOfVal.toArray();
    System.out.println(resArr[resArr.length-3]);
  }
  
  public static void solution2(int[] arr) {
    int arrLen = arr.length;
    int i, j = 0;
    Arrays.sort(arr);
    if (arrLen < 3) {
      System.out.println("Invalid input , please give elements atleast 3");
    }
    for (i = 0; i < arrLen-1; i++) {
      if (arr[i] != arr[i + 1]) {
       arr[j++]  = arr[i];
      }
    }
    arr[j++] = arr[arrLen-1];
    //to print third largest value
    for(i=0;i<j;i++){
      if(i==j-3)
      System.out.println(arr[i]);
    }
    
  
  }

  public static void solution3(int[] arr) {
    int arrLen = arr.length;
    if (arrLen < 3) {
      System.out.println("Invalid input , please give elements atleast 3");
    }
    int resultSum = 0;
    IntStream streamOfEle = null;
    int[] resArr = null;
    resArr = Arrays.stream(arr).distinct().sorted().toArray();
    System.out.println(Array.get(resArr, resArr.length - 3));
  }

  public static void main(String[] args) {
    int[] arr = {6, 8, 1, 9, 2, 1, 10};
    solution1(arr);
    solution2(arr);
    solution3(arr);
  }
}
