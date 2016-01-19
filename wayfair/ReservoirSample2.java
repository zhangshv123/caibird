//时间复杂度O（n）
class Untitled {
	public static void main(String[] args) {
		int[] S={1,2,3,4,5};
		int[] R={0,0,0};
		int[] res=ReservoirSample(S,R);
		for(int re:res)
			System.out.print(re);
	}
	/*
		S has items to sample, R will contain the result
		在取第n个数据的时候，我们生成一个0到1的随机数p，如果p小于k/n，替换池中任意一个为第n个数。大于k/n，继续保留前面的数。直到数据流结束，返回此k个数。但是为了保证计算机计算分数额准确性，一般是生成一个0到n的随机数，跟k相比，道理是一样的。
		从S中抽取首k项放入「水塘」中
		对于每一个S[j]项（j ≥ k）：
			随机产生一个范围0到j的整数r
			若 r < k 则把水塘中的第r项换成S[j]项
	*/
	
	public static int[] ReservoirSample(int[] S, int[] R){
		int n=S.length;
		int k=R.length;
		for(int i = 0;i<k;i++){
			R[i] = S[i];
		}
		// replace elements with gradually decreasing probability
		for(int i=k;i<n;i++){
			int j=(int)(Math.random() * i); // important: inclusive range
			if(j<k)
				R[j]=S[i];
		}
		return R;
	}
}