class Untitled {
	public static void main(String[] args) {
		String input="VOD,Vodafone,10@GOOG,Google,15@MSFT,Microsoft,12";
		String[] inputArray=input.split(":");
		String[] firsts=inputArray[0].split("@");
		String[] seconds=inputArray[1].split("@");
		String[] res=new String[];
		Arrays.sort(firsts, new Comparator<String>() {
			
			@Overridet
			public int compare(String s1, String s2) {
				return (s1).compareTo(s2);
			}
		});
		Arrays.sort(seconds, new Comparator<String>() {
			
			@Overridet
			public int compare(String s1, String s2) {
				return (s1).compareTo(s2);
			}
		});
		int[] subsum=new int[firsts.length];
		int sum=0;
		for(int i=0;i<firsts.length;i++){
			subsum[i]=firsts[i].split(",")[2]*seconds[i].split(",")[3];
		}
		for(int i=0;i<subsum.length;i++){
			sum+=subsum[i];
		}
		for(int i=0;i<firsts.length;i++){
			res.append("[");
			res.append(firsts[i].split(",")[0]);
			res.append(",");
			res.append(firsts[i].split(",")[1]);
			res.append(",");
			res.append(firsts[i].split(",")[2]);
			res.append(",");
			res.append(seconds[i].split(",")[3]);
			res.append(",");
			int tmp=Integer.parseInt(firsts[i].split(","[2])*Double.parseDouble(seconds[i].split(",")[3]);
		res.append(tmp);
		int percent=subsum[i]/sum*100;
		res.append(percent);
		}
	}
}