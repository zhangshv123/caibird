class Untitled {
	public static void main(String[] args) {
		System.out.print(getRes("aabcabbbb"));
	}
	public static char getRes(String s){
		char res= s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			char c  = s.charAt(i);
			if(res==c){
				continue;
			}else{
				res=(char)('a'+'b'+'c'-res-c);
			}
		}
		return res;
	}
}