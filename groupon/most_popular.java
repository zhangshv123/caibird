import java.util.*;
class Untitled {
	public static void main(String[] args) {
		String sentence="dog is a dog is a";
		ArrayList<String> res=mostPopular(sentence);
		for(String item: res){
			System.out.print(item+" ");
		}
	}
	public static ArrayList<String> mostPopular(String sentence){
		String[] sens=sentence.split(" ");
		ArrayList<String> res=new ArrayList<>();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String sen:sens){
			if(map.containsKey(sen)){
				map.replace(sen,map.get(sen)+1);
			}else{
				map.put(sen,1);
			}
		}
		int max=0;
		Set<String> set=map.keySet();
		for(String item:set){
			if(map.get(item)>max){
				max=map.get(item);
				res.clear();
				res.add(item);
			}else if(map.get(item)==max){
				res.add(item);
			}
		}
		return res;
	}
}