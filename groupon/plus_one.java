import java.util.*;
class Untitled {
	public static void main(String[] args) {
		int[] nums1={9,9,9};
		int[] adder={0,0,1};
		ArrayList<Integer> res=addOne(nums1,adder);
		for(int num: res){
			System.out.print(num);
		}
	}
	public static ArrayList<Integer> addOne(int[] num1, int[] adder){
		ArrayList<Integer> res=new ArrayList<>();
		int carry=0;
		for(int i=adder.length-1;i>=0;i--){
			res.add(0,(num1[i]+adder[i]+carry)%10);
			carry=(num1[i]+adder[i]+carry)/10;
		}
		if(carry!=0){
			res.add(0,1);
		}
		return res;
	}
}