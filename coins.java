import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int[] coins = {5,3,1};
		System.out.println(minCoin1(2,coins));
		System.out.print(Integer.MAX_VALUE);
	}
	public static int minCoin(int n,int[] coins){
		int count=0;
		int i=0;
		while(n>0){
			if(n>=coins[i]){
				n-=coins[i];
				count++;
			}else{
				i++;
			}
		}
		return count;
	}
	
	public static int minCoin1(int n,int[] coins){
		int[] nums=new int[n+1];
		//initializa
		nums[0]=0;
		int coinsNum = coins.length;
		for(int j=0;j<coinsNum;j++){
			if(coins[j]<n){
				nums[coins[j]]=1;
			}
		}
		//dp
		for(int i=0;i<=n;i++){
			int min = Integer.MAX_VALUE;
			if(nums[i]==1){
				continue;
			}
			for(int j=0;j<coinsNum;j++){
				if(i-coins[j]>=0){
					min=Math.min(min,nums[i-coins[j]]+1);
				}
			}
			nums[i]=min;
//			System.out.println(i+" "+nums[])
		}
		return nums[n];
	}
}