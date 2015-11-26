import java.util.*;
class Untitled {
	public static void main(String[] args) {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		ArrayList<String> res=mostPopular(s);
		for(String str:res){
			System.out.print(str+" ");
		}
	}
	public static ArrayList<String> mostPopular(String str){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<str.length()-10;i++){
			String index=str.substring(i,i+10);
			if(map.containsKey(index)){
				map.replace(index,map.get(index)+1);
			}else{
				map.put(index,1);
			}
		}
		int max=Integer.MIN_VALUE;
		ArrayList<String> res=new ArrayList<>();
		Set<String> keys=map.keySet();
		for(String key:keys){
			if(map.get(key)>max){
				max=map.get(key);
				res.clear();
				res.add(key);
			}else if(map.get(key)==max){
				res.add(key);
			}
		}
		return res;
	}
}