class Untitled {
//就是Lintcode上的方法,O(n)time,O(1)space
	public static void main(String[] args) {
		int[] nums={1,-2,3,-1,2,-3};
		int[] res=partitionArray(nums,0);
		for(int item:res)
			System.out.print(item+" ");
	}
	public static int[] partitionArray(int[] nums, int k) {
		int i = 0, j = nums.length - 1;
		while (i <= j) {
			while (i <= j && nums[i] < k) i++;
			while (i <= j && nums[j] >= k) j--;
			if (i <= j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			}
		}
		return nums;
	}
}