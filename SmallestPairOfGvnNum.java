package com.ashokit;

import java.util.Arrays;

public class SmallestPairOfGvnNum {

  public static void solution(int[] arr, int gvnNum) {
    int i = 0, j = 0;
    int arrLen = arr.length;
    Arrays.sort(arr);
    for (i = 0; i < arrLen; i++) {
      for (j = i + 1; j < arrLen; j++) {
        if (arr[i] + arr[j] == gvnNum) {
          System.out.println("pair is = " + arr[i] + "," + arr[j]);
          i = arrLen;
          break;
        }
      }
    }

  }

  public static void main(String[] args) {
    int[] arr = {1, 7, 2, 9, 6};
    int gvnNum = 3;
    solution(arr, gvnNum);
  }
}
