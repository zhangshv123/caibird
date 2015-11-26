import java.util.*;
class Untitled {
	public static void main(String[] args) {
		String sentence="Indeed use python java to deal with the python python and is for java";
		String k1="java";
		String k2="python";
		System.out.print(mostNear(sentence,k1,k2));
	}
	
	public static int mostNear(String sentence,String k1, String k2){
		String[] strs=sentence.split(" ");
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		int distance=Integer.MAX_VALUE;

		for(int k=0;k<strs.length;k++){
			if(strs[k].equals(k1)){
				arr1.add(k);
			}
			if(strs[k].equals(k2))
				arr2.add(k);
		}
			int i=0,j=0;
			while(i<arr1.size()&&j<arr2.size()){
				if(distance>Math.abs(arr1.get(i)-arr2.get(j))){
					distance=Math.abs(arr1.get(i)-arr2.get(j));
				}
				if(arr1.get(i)<arr2.get(j))
					i++;
				if(arr1.get(i)>arr2.get(j))
					j++;
			}
		return distance;
	}
}