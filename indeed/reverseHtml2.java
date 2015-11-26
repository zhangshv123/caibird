import java.util.*;

class Untitled {
	public static void main(String[] args) {
		String str = "12345&78;&amp,888ggggg";
			
		System.out.println(htmlReverse1(str));
	}
	
	public static String htmlReverse1(String str){
//		String sens[] = str.split("&[a-z0-9]*[;,]");
		int startIndex=0;
		int endIndex=0; 
		String temp = "";
		List<String> list = new ArrayList<>();
		for(int i = 0; i < str.length()-1; i++) {
			char c = str.charAt(i);
			if(c=='&'){
			//begining of the special word
				//empty the temp
				if(!temp.equals("")){
					StringBuilder sb = new StringBuilder(temp);
					list.add(sb.reverse().toString());
					temp="";
				}
				temp+=c;
			}else if(c==';' || c==','){
			//ending of the special word
				temp+=c;
				list.add(temp);
				temp="";
			}else{
			//normal character
				temp+=c;
			}
		}
		if (!temp.equals("")) {
			list.add(temp);
		}
		String res="";
		for (int i = list.size()-1; i >=0; i--) {
			res+=list.get(i);
		}	
		return res;
	}
	
	public static String htmlReverse(String str){
		String sens[] = str.split("&[a-z0-9]*[;,]");
		int startIndex=0;
		int endIndex=0;
		String res = "";
		List<String> list = new ArrayList<>();
		for (int i = 0; i < sens.length-1; i++) {
			startIndex = str.indexOf(sens[i],endIndex)+sens[i].length();
			endIndex = str.indexOf(sens[i+1],startIndex);
			StringBuilder sb = new StringBuilder(sens[i]);
			list.add(sb.reverse().toString());
			list.add(str.substring(startIndex,endIndex));
		}
		StringBuilder sb = new StringBuilder(sens[sens.length-1]);
		list.add(sb.reverse().toString());
		for (int i = list.size()-1; i >=0; i--) {
			res+=list.get(i);
		}	
		return res;
	}
}