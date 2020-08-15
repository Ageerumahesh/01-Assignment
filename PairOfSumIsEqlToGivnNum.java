package com.ashokit;

public class PairOfSumIsEqlToGivnNum {

  public static void solution(int[] arr, int gvnNum) {
    int i = 0, j = 0;
    int arrLen = arr.length;
    for(i =0;i<arrLen;i++)
      for(j=i+1;j<arrLen;j++)
        if (arr[i] + arr[j] == gvnNum) 
          System.out.println("pair is =" + arr[i] + "," + arr[j]);
      
  }
  

  public static void main(String[] args) {
    int[] arr = {3, 6, 8, -8, 10, 8};
    int gvnNum = 16;
    solution(arr, gvnNum);
  }
}
