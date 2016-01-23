class Untitled {
	//0(n^2)的time,O(1)space
	public static void main(String[] args) {
		int[] nums = {1,-2,3,-1,2,-3};
		partition(nums);
		for(int item : nums){
			System.out.print(item + " ");
		}
	}
	public static void partition(int[] nums){
		for(int i = 1; i< nums.length; i++){
			if(nums[i] < 0){
				for(int j = i; j > 0; j--){
					if (nums[j-1] > 0) {
						int temp = nums[j];
						nums[j] = nums[j-1];
						nums[j-1] = temp;
					}else{
						break;
					}
				}
			}
		}
	}
}