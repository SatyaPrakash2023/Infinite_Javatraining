package com.java.day6;

import java.util.Scanner;
import java.util.*;

public class SecondSmallest
{ 
   static int secSmallest(int arr[], int n)
   {
      // assigning first element as smallest temporarily
      int smallest = arr[0];

      // we find the smallest element here
      for (int i=0; i < n; i++){
         if(arr[i] < smallest)
            smallest = arr[i];
      }

     // temporarily assinging largest max value
     int sec_smallest = Integer.MAX_VALUE;


     // finding second smallest here
     for (int i=0; i < n; i++){
         if(arr[i] != smallest && arr[i] < sec_smallest)
           sec_smallest = arr[i];
     }

    return sec_smallest;

  }
  public static void main(String args[])
  {

      int arr[] = {12, 13, 1, 10, 34, 10};
      int n = arr.length;
      System.out.print(secSmallest(arr, n)); 
   }
}