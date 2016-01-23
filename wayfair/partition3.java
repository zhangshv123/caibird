import java.util.*;
/* 主要的思路是通过改变数字内容来实现保留数字之间相对的顺序，
比方说数列 1,-2,3,-1,2,-3
应该变成 3.1,-0.2,4.3,-1.1,5.2,-2.3
小数点前存储应该在的位置，小数点后存贮原来的值 */
class Untitled {
	public static void main(String[] args) {
		double[] nums={1,-2,3,-1,2,-3};
		double[] res=partitionArray(nums,0);
		for(double item:res)
			System.out.print(item+" ");
	}
	public static double[] partitionArray(double[] nums, int k) {
		int count=0;
		for(double num:nums){
			if(num<0){
				count++;
			}
		}
		int pos=0;
		int neg=count;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>=0){
				nums[i]=neg+nums[i]*0.1;
				neg+=1;
			}else{
				nums[i]=-pos-Math.abs(nums[i])*0.1;
				pos+=1;
			}
		}
		
		for(int i=0;i<nums.length;i++){
			while(Math.floor(Math.abs(nums[i]))!=i){
				int idx=(int)Math.floor(Math.abs(nums[i]));
				double tmp=nums[i];
				nums[i]=nums[idx];
				nums[idx]=tmp;
			}
		}
		for(int i=0;i<nums.length;i++)
			nums[i]=nums[i]*10%10;
		return nums;
		}
}