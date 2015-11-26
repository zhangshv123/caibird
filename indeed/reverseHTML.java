import java.util.*;

class Untitled {
	public static void main(String[] args) {
		String html="&43242;html&lt;123&yen;";
		ArrayList<String> res=new ArrayList<String>();
		res=reverseHTML(html);
		for(int i=res.size()-1;i>=0;i--)
			System.out.println(res.get(i));
		
	}
	
	public static ArrayList<String> reverseHTML(String html){
		ArrayList<String> list=new ArrayList<String>();
		int startIdx=0;
		String item="";
		for(int i=0;i<html.length();i++){
			if(i!=0&&html.charAt(i)=='&'){
			 	item=html.substring(startIdx,i);
				String tmp=reverse(item);
				list.add(tmp);
				startIdx=i;
			}
			if(html.charAt(i)==','||html.charAt(i)==';'){
				item=html.substring(startIdx, i+1);
				list.add(item);
				startIdx=i+1;
			}
		}
		return list;
	}
	
	public static String reverse(String item){
		String res="";
		for(int i=0;i<item.length();i++){
			res=item.charAt(i)+res;
		}
		return res;
	}
}