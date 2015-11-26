import java.util.*;
class triangleCount {
	private static class Pair{
		int preIndex;
		int value;
		Pair(int preIndex,int value){
			this.preIndex = preIndex;
			this.value = value;
		}
	}
	public static void main(String[] args) {
		int[] input = {4,2,6,7,9};
		//record the relationship between the index and the value		Hashtable<Integer,Integer>index = new Hashtable<>();
		Pair[] pairs = new Pair[input.length];
		for (int i = 0; i < input.length; i++) {
			pairs[i] = new Pair(i,input[i]);
		}
		Arrays.sort(pairs,new Comparator<Pair>(){
			@Override 
			public int compare(Pair l1, Pair l2) { 
				return l1.value - l2.value; 
			} 
		});
		Triangle(pairs);
	}
	public static void Triangle(Pair[] pairs){
		for (int i = 2; i < pairs.length; i++) {
			System.out.println(pairs[i].preIndex+" ");
			TwoSum(pairs,i);
		}
	}
	
	public static void TwoSum(Pair[] pairs,int targetIndex){
		int left = 0;
		int right = targetIndex - 1;
		int target = pairs[targetIndex].value;
		while (left<right) {
			int sum = pairs[left].value + pairs[right].value;
			if (sum > target) {
				for (int i = left; i < right; i++) {
					System.out.println(pairs[i].preIndex+" "+pairs[right].preIndex);
				}
				right--;
			}else {
				left++;
			}
				
		}
	}
}