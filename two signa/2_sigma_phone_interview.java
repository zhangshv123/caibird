class Untitled {
	public static void main(String[] args) {
		int[] A={1,4,6,8,10};
		int[] B={2,3,5,9};
		int[] C=mergeArray(A,B);
		for(int num:C){
			System.out.print(num);
		}
	}
	
	public static int[] mergeArray(int[] A, int[] B){
		int first=0;
		int second=0;
		int third=0;
		int[] res=new int[A.length+B.length];
		
		while(first<A.length||second<B.length){
			if(first>=A.length){
				while(second<B.length){
					res[third++]=B[second++];
				}
			}else if(second>=B.length){
				while(first<A.length){
					res[third++]=A[first++];
				}
			}else if(A[first]<B[second]){
				res[third++]=A[first++];
			}else if(A[first]>B[second]){
				res[third++]=B[second++];
			}
		}
		return res;
	}
}