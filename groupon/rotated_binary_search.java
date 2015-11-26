import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

//  you have a sorted array
//  [2 , 3,  8,  19,  57,  10082]






class Solution {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//     System.out.println(binarySearch(arr, 7));
		
		
		int[] rotatedArray = { 4, 5, 6, 7, 1, 2, 3};//case 1
		int[] rotatedArray2 = { 7, 1, 2, 3, 4, 5 ,6};  //case 2
		
		System.out.println(rotatedSearch(rotatedArray,7));     
		
		System.out.println(rotatedSearch(rotatedArray2,7));    
		System.out.println(maxProfit(rotatedArray2));    
		
	}
	public static int binarySearch(int[] arr, int target){
		//TODO: logic
		int left=0;
		int right=arr.length-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(target<arr[mid]) right=mid-1;
			else if(target>arr[mid]) left=mid+1;
			else return mid;
		}
		return -1;
	}
	
	public static int rotatedSearch(int[] arr, int target){
		int left=0;
		int right=arr.length-1;
		
		while(left<=right){
			int mid=left+(right-left)/2;
			if(arr[mid]==target)  return mid;
			
			//if lower part is sorted
			if(arr[left]<=arr[mid]){
				if(arr[left]<=target&&target<arr[mid])
						right=mid-1;
				else
						left=mid+1;
			}
			//if upper part is sorted
			else{
				if(arr[mid]<target&&target<=arr[right])
						left=mid+1;
				else
						right=mid-1;
			}
		}
		//TODO: logic
		return -1;
	}
	
	
//   array of stock price 
//   [4, 6, 1, 9, 8, 10, 24, 0, 22] ==> return 23
//   [4 , 1, 0] ==> return 0  
	
	
	public static int maxProfit(int[] price){
		if(price==null||price.length==0)
				return 0;
		int maxProfit=0, min=price[0];
		int n=price.length;
		for(int i=0;i<n;i++){
			maxProfit=Math.max(maxProfit,price[i]-min);
			min=Math.min(min,price[i]);
		}   
		return maxProfit;
	}
	
	
	
	
}
