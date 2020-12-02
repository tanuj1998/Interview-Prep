/*
Array Quadruplet
Given an unsorted array of integers arr and a number s, write a function findArrayQuadruplet that finds four numbers (quadruplet) in arr that sum up to s. Your function should return an array of these numbers in an ascending order. If such a quadruplet doesn’t exist, return an empty array.

Note that there may be more than one quadruplet in arr whose sum is s. You’re asked to return the first one you encounter (considering the results are sorted).

Explain and code the most efficient solution possible, and analyze its time and space complexities.

input:  arr = [2, 7, 4, 0, 9, 5, 1, 3], s = 20

output: [0, 4, 7, 9]
*/
import java.io.*;
import java.util.*;

//arr: [2, 7, 4, 0, 9, 5, 1, 3]
//arr: [0, 1, 2, 3, 4, 5, 7, 9]
//s = 20
//[0, 1, 2, 3, 4, 5, 7, 9]
// i  j     k           m
class Solution {
  
  static int[] findArrayQuadruplet(int[] arr, int s) {
    // your code goes here
    int n = arr.length;
    int[] ans = new int[4];
    if(n < 4){
      return new int[0];
    }
    Arrays.sort(arr);
    /*for(int i = 0; i < arr.length-3; i++){
      for(int j = 1; j < arr.length-2; j++){
        for(int k = 2; k < arr.length-1; k++){
          int difference = s - arr[i] - arr[j] - arr[k];
          for(int m = 3; m < arr.length; m++){
            if(arr[m] == difference){
              ans[0] = arr[i];
              ans[1] = arr[j];
              ans[2] = arr[k];
              ans[3] = arr[m];
            }
          }
        }
      }
    }
    return ans;*/
    for(int i = 0; i <= n-4; i++){
      for(int j = i+1; j <= n-3; j++){
        int sum = s - (arr[i] + arr[j]);
        
        int low = j+1;
        int high = n-1;
        
        while(low < high){
          if(arr[low] + arr[high] < sum){
            low++;
          }
          else if(arr[low] + arr[high] > sum){
            high--;
          }
          else{
            return new int[]{ arr[i],arr[j],arr[low],arr[high] };
          }
        }
      }
    }
    return new int[0];
  }

  public static void main(String[] args) {
    int[] test = new int[]{ 2,7,4,0,9,5,1,3 };
    int[] res = findArrayQuadruplet(test,20);
    for(int i = 0; i < res.length; i++){
      System.out.println(res);
    }
  }

}