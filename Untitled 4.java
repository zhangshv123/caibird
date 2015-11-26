class Untitled {
	public static void main(String[] args) {
		String input="VOD,Vodafone,10@GOOG,Google,15@MSFT,Microsoft,12";
		String[] inputArray=input.split("@");
		Arrays.sort(inputArray, new Comparator<String>() {
			
			@Overridet
			public int compare(String s1, String s2) {
				return (s1).compareTo(s2);
			}
		});
		int len=inputArray.length();
		int sign=1;
		StringBuilder res=new StringBuilder("");
		for(int i=0;i<len/2;i++){
			int num=inputArray[i].split()[2]-inputArray[i+len/2].split()[2];
			res.append("[");
			if(num>0){
				res.append("SELL");
				res.append(inputArray.split(",")[0]);
				res.append(Math.abs(num));
			};
			else
			{
				res.append("BUY");
				res.append(inputArray.split(",")[0]);
				res.append(Math.abs(num));
			};
			res.append("]");
		}
	}
}