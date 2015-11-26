import java.util.*;

class Untitled {
	public static void main(String[] args) {
		String sentences=" dog dog ha ha ha bi bi bi bi z z z z z";
		int k=1;
		findKmostPopular(sentences,k);
	}
	
	public static void findKmostPopular(String strs,int k){
		String[] sen=strs.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		for(String str:sen){
			if(map.containsKey(str)){
				map.replace(str, map.get(str)+1);
			}else{
				map.put(str,1);
			}
		}
	
	ArrayList<String> list=new ArrayList(map.keySet());
	Queue<String> queue=new PriorityQueue<String>(new Comparator<String>(){
		@Override
		public int compare(String s1,String s2){
			return map.get(s2)-map.get(s1);
		}
	});
	for(String item:map.keySet()){
		queue.offer(item);
	}
	while(k-->1){
		queue.poll();
	}
	System.out.print(queue.poll());
	}
}