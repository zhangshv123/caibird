import java.util.*;
class Untitled {
	public static void main(String[] args) {
		int[] num={1,2,3,5,6,8};
		List<String> res=summaryRanges(num);
		for(String item:res){
			System.out.print(item+" ");
		}
	}
	
	public static List<String> summaryRanges(int[] nums) {
		int len=nums.length;
		int i=0;
		List<String> res=new ArrayList<String>();
		while(i<len){
			int j=1;
			while(i+j<len&&nums[i+j]-nums[i]==j){
				j++;
			}
			res.add(j==1?Integer.toString(nums[i]):nums[i]+"-"+nums[i+j-1]);
			i+=j;
		}
		return res;
	}
}