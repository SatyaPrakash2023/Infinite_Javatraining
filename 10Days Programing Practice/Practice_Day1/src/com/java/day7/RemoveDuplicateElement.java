package com.java.day7;

import java.util.HashSet;
import java.util.Set;

class Main
{
  public static void main (String[] args)
  {
     int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
     int n = arr.length;
     Set<Integer> hash_Set = new HashSet<>();
for (int i=0; i<n; i++)
hash_Set.add(arr[i]);

System.out.print(hash_Set);
}
}