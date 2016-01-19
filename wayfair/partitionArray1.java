import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int[] nums={1,-2,3,-1,2,-3};
		int[] res=partitionArray(nums,0);
		for(int item:res)
			System.out.print(item+" ");
	}
	public static int[] partitionArray(int[] nums, int k) {
		ArrayList<Integer> pos=new ArrayList<>();
		ArrayList<Integer> neg=new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			if(nums[i]>=0)
				pos.add(nums[i]);
			else {
				neg.add(nums[i]);
			}
		}
		for(int i=0;i<neg.size();i++){
			nums[i]=neg.get(i);
		}
		for(int i=0;i<pos.size();i++){
			nums[neg.size()+i]=pos.get(i);
		}
		return nums;
	}
}