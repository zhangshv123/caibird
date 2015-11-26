class Untitled {
	public static void main(String[] args) {
		String input = "aaabbccd";
		int count = 0;
		char temp = input.charAt(0);
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==temp)
				count++;
			else
			{
				System.out.print(temp+""+count);
				count = 1;
				temp = input.charAt(i);
			}
		}
		System.out.print(temp+""+count);
	}
}