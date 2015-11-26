class twoSum{
	public static void main(String[] args) {
		int[] array= {2, 2, 11, 15};
		int target=3;
		int left=0;
		int right=array.length-1;
		while(left<right){
			if(array[left]+array[right]==target){
				System.out.println("true");
				return;
			}else if(array[left]+array[right]>target)
				right--;
			else 
				left++;
		}
		System.out.println("false");
//		return;
	}
}