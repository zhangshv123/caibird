class Untitled {
	public static void main(String[] args) {
		int[] A={3, 8, 4};
		System.out.println(houseRobber2(A));
	}
	public static long houseRobber2(int[] A) {
		// write your code here
		int n = A.length;
		long []res = new long[3];
		long ans = 0;
		if(n==0)
			return 0;
		if(n >= 1) {
			res[0] = A[0];
			ans = Math.max(ans, res[0]);
		}
		if(n >= 2) {
			res[1] = Math.max(A[0], A[1]);
			ans = Math.max(ans, res[1]);
		}
		if(n >= 3) {
			res[2] = Math.max(A[0]+A[2], A[1]);
			ans = Math.max(ans, res[2]);
		}
		if(n > 2){
			for(int i = 3; i < n; i++) {
				res[i%3] = Math.max(res[(i-3)%3], res[(i-2)%3])+ A[i];
				ans = Math.max(ans, res[i%3]);
			}
		} 
		return ans;
	}   
}