import java.util.*;
class findDifferent{
	public static void main(String[] args) {
		int[] A={5,7,8,8};
		int[] B={8,5,5,1,3};
		findDifferent(A,B);
	}
	public static void findDifferent(int[] A, int[] B){
		Arrays.sort(A);
		Arrays.sort(B);
		int i=0,j=0;
		while(i<A.length-1&&j<B.length-1){
			if(A[i]==A[i+1]){
				i++;
			}
			if(B[j]==B[j+1]){
				j++;
			}
			if(A[i]==B[j]){
				i++;
				j++;
			}
			if(A[i]<B[j]){
				System.out.println(A[i]+"-"+"A");
				i++;
			}else if(A[i]>B[j]){
				System.out.println(B[j]+"-"+"B");
				j++;
			}
		}
		while(i<A.length-1){
			if(A[i]==A[i+1]){
				i++;
			}else{
				System.out.print(A[i]+"-"+"A");
				i++;
			}
		}
		while(j<B.length-1){
			if(B[j]==B[j+1]){
				j++;
			}else{
				System.out.print(B[j]+"-"+"B");
				j++;
			}
		}
	}
}