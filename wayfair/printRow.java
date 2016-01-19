class Untitled {
	public static void main(String[] args) {
		int[][] res=printRow(3,4);
		for(int[] i:res){
			for(int s:i){
				System.out.print(s+" ");
			}
			System.out.println("");
		}
	}
	public static int[][] printRow(int m,int n){
		int[][] res=new int[n][n+1];
		int gap=0;
		for(int i=0;i<n+1;i++){
			res[0][i]=i;
		}
		for(int i=1;i<n;i++){
			res[i][0]=i;
		for(int j=2;j<n+1;j++){
			res[i][1]=i;
			res[i][j]=res[i][j-1]+i;
		}}
		return res;
	}
}