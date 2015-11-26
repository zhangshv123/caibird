import java.util.*;

class Untitled {
	public static void main(String[] args) {
		String[] input ={"a2rW","swA2"};
		List<String> list= Arrays.asList(input);
		List<List<String>> res = combination(list);
		for(List<String> aws:res){
			for(String item:aws){
				System.out.println(item);
			}
			System.out.println();
		}
	}
	public static List<List<String>> combination(List<String> list){
		List<List<String>> res = new ArrayList<>();
		for(int i=0;i<Math.pow(3,list.size());i++){
			res.add(get(i,list));
		}
		return res;	
	}
	public static List<String> get(int n,List<String> list){
		List<String> aws = new ArrayList<>();
		for(int i=0;i<list.size();i++){
			String temp = list.get(i).toLowerCase();
			if(n%3==1){
				temp = list.get(i).toUpperCase();
			}
			if(n%3==2){
				temp = list.get(i);
			}
			n/=3;
			aws.add(temp);
		}
		return aws;
	}
	
}