import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MedianOfIntegerStream {
	public static void main(String[] args) {
		MedianOfIntegerStream streamMedian = new MedianOfIntegerStream();
		int[] nums={1,2,4,5};
		System.out.println(streamMedian.MedianOfIntegerStream(nums));
		
	}
	public int MedianOfIntegerStream(int[] nums){
		Queue<Integer> minq = new PriorityQueue<Integer>();
		Queue<Integer> maxq = new PriorityQueue<Integer>();
		int mid=0;
		if(nums.length==0||nums==null)
		return mid;
		
		mid=nums[0];
		
		for(int i=0;i<nums.length;i++){
			if(i!=0){
		    	if(nums[i]<=mid){
					maxq.add(-nums[i]);
				}else{
					minq.add(nums[i]);
				     }
			}
			if(maxq.size()>minq.size()){
				minq.add(mid);
				mid=-maxq.poll();
			}
			if(minq.size()>maxq.size()+1){
				maxq.add(-mid);
				mid=minq.poll();
			}
		}
		if(minq.size()!=maxq.size()){
			return (mid+minq.peek())/2;
		}else{
			return mid;
		}
	}
}