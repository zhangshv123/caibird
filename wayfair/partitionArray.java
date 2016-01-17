class partitionArray {
	public static void main(String[] args) {
		int[] nums={7,7,9,8,6,6,8,7,9,8,6,6};
		int k=10;
		int n=partitionArray(nums,k);
		System.out.println(n);
	}
	public static int partitionArray(int[] nums, int k) {
		    //write your code here
		    if(nums == null || nums.length <= 1)
			return 0;
			int left=0;
			int right=nums.length-1;
			int cur=0;
		while(cur<=right){
			if(nums[cur]<k){
				swap(left,cur,nums);
				left++;
				cur++;
			}else{
				swap(cur,right,nums);
				right--;
			}
		}
		return left;
	}
	public static void swap(int left, int right, int[] nums){
		int tmp=nums[left];
		nums[left]=nums[right];
		nums[right]=tmp;
	}
}