import java.util.*;
class Untitled {
	public static void main(String[] args) {
		for(int item:quantiles()){
			 System.out.print(item+" ");
		}
	}
	
	public static int[] quantiles(){
		Scanner input = new Scanner(System.in);
		int Q = input.nextInt();
		int lines = input.nextInt();
		int[] res=new int[Q-1];
		ArrayList<Integer> nums=new ArrayList<>();
		int i=0;
		int num;
		int count;
		int[] countSum=new int[lines];
		ArrayList<Integer> items=new ArrayList<>();
		while(i<lines){
			 num=input.nextInt();
			 count=input.nextInt();
			 countSum[i]=count;
			 items.add(num);
			 i++;
		}
		int dividor=gcd(countSum);
		for(int m=0;m<countSum.length;m++){
			countSum[m]=countSum[m]/dividor;
		}
		for(int m=0;m<countSum.length;m++){
			while(countSum[m]>0){
				nums.add(items.get(m));
				countSum[m]--;
			}
		}
		Collections.sort(nums);
		int N=nums.size();
		for(i=1;i<Q;i++){
			if(N*i%Q==0)
				res[i-1]=nums.get(N*i/Q-1);
			else{
				int index=N*i/Q;
				res[i-1]=nums.get(index);
			}
				
		}
		return res;
	}
	
	public static int gcd(int[] input)
	{
		int result = input[0];
		for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
		return result;
	}
	
	public static int gcd(int a, int b)
	{
		while (b > 0)
		{
			int temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}
	
}