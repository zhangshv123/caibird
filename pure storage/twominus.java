class Untitled {
	public static void main(String[] args) {
		int[] A={1,3,4,6};
		System.out.print(twoMinus(A,2));
	}
	public static int twoMinus(int[] nums, int target){
		int slow=0;
		int fast=0;
		int count=0;
		while(slow<nums.length){
			while(fast<nums.length){
//				slow++;
				if(nums[fast]-nums[slow]<target){
					fast++;
				}else{
					break;
				}
			}
			if(fast<nums.length && nums[fast]-nums[slow]==target){
				count++;
			}
			slow++;
		}
			return count;
	}
}