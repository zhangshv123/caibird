class Untitled {
	public static void main(String[] args) {
		int[] A = {112,122,360,311,85,225,405,53,405,43,342,13,588,424,299,37,104,289,404,414};
		int k = 3 ;
		System.out.println(postOffice(A,k));
	}
	
	public static int postOffice(int[] A, int k) {
		        // Write your code here
    	if(A==null||A.length==0)
			return 0;
		int n=A.length;
		if(n<1){
			return 0;
		}
		int[][] dp=new int[n+1][k+1];
		int[][] distance=new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++){
				int mid=(i+j)/2;
				for(int m=i;m<=j;m++){
					distance[i][j]+=Math.abs(A[m-1]-A[mid-1]);
				}
			}
		}
			return minDistance(A,n,k,dp,distance);
	}
	
	public static int minDistance(int[] A,int n,int k,int[][] dp,int[][] distance){
		if(k==1){
			return distance[1][n];
		}
		int res =Integer.MAX_VALUE;
		for(int l=0;l<n;l++){
			res=Math.min(res,minDistance(A,n,k-1,dp,distance)+distance[l+1][n]);
		}
		dp[n][k]=res;
		return res;
		}
}