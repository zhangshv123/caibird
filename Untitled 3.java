static String printHoldings(String portfolioString) {
	if(portfolioString == null || portfolioString.length() == 0) {
		return "";
	}
	// split input string by "@" then put splited string into a string array
	String[] inputArray = portfolioString.split(SEPARATOR);
	
	Arrays.sort(inputArray, new Comparator<String>() {
		
		@Override
		public int compare(String s1, String s2) {
			return (s1).compareTo(s2);
		}
	});
	
	StringBuilder result = new StringBuilder("");
	
	for(String holding : inputArray) {
		// temporary stringbuilder for each holding
		StringBuilder tmpStb = new StringBuilder("");
		// split every holding string array to assemeble the target string
		String[] tmpArr = holding.split(",");
		tmpStb.append("[");
		for(String attr : tmpArr) {
			tmpStb.append(attr);
			
			// if it's not the last attribute of this holding
			if(!attr.equals(tmpArr[tmpArr.length - 1])) {
				tmpStb.append(", ");
			}
		}
		tmpStb.append("]");
		// if it's not the last holding of this holding array
		if(!holding.equals(inputArray[inputArray.length - 1])) {
			tmpStb.append(", ");
		}
		// append each fromated holding string into result stringbuilder
		result.append(tmpStb.toString());
	}
	return result.toString();
	
}