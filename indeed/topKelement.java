import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int[] nums ={9, 8, 3, 5, 11};
		int k=3;
		int[] res=new int[k];
		res=topK(nums,k);
		for(int item:res)
			System.out.println(item);
	}
	
	public static int[] topK(int[] arr,int k){
		int[] res=new int[k];
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		if(k>arr.length){
			//System.out.println("hehe");
			return arr;
		}else{
			for(int i=0;i<arr.length;i++){
				queue.offer(arr[i]);
//				System.out.println(queue.size());
			}
			for(int i=0;i<arr.length-k;i++){
				queue.poll();
//				System.out.println(queue.poll());
			}
			for(int i=0;i<k;i++){
				res[i]=queue.poll();
//				System.out.println(res[i]);
			}
		}
		return res;
	}	
}