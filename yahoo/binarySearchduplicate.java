class Untitled {
	public static void main(String[] args) {
		int[] nums={1,2,2,2,2,3};
		System.out.println(CountOccurances(nums,nums.length,2));
	}
	static int GetRightPosition(int A[], int l, int r, int key)
	{
		int m;
	 
		while( r - l > 1 )
		{
			m = l + (r - l)/2;
	 
			if( A[m] <= key )
				l = m;
			else
				r = m;
		}
	 
		return l;
	}
	 
	// Input: Indices Range (l ... r]
	// Invariant: A[r] >= key and A[l] > key
	static int GetLeftPosition(int A[], int l, int r, int key)
	{
		int m;
	 
		while( r - l > 1 )
		{
			m = l + (r - l)/2;
	 
			if( A[m] >= key )
				r = m;
			else
				l = m;
		}
	 
		return r;
	}
	 
	static int CountOccurances(int A[], int size, int key)
	{
		// Observe boundary conditions
		int left = GetLeftPosition(A, -1, size-1, key);
		int right = GetRightPosition(A, 0, size, key);
	 
		// What if the element doesn't exists in the array?
		// The checks helps to trace that element exists
		return (A[left] == key && key == A[right])?
			   (right - left + 1) : 0;
	}
	
	int BinarySearchIndexOfMinimumRotatedArray(int A[], int l, int r)
	{
		// extreme condition, size zero or size two
		int m;
	 
		// Precondition: A[l] > A[r]
		if( A[l] <= A[r] )
			return l;
	 
		while( l <= r )
		{
			// Termination condition (l will eventually falls on r, and r always
			// point minimum possible value)
			if( l == r )
				return l;
	 
			m = l + (r-l)/2; // 'm' can fall in first pulse,
							// second pulse or exactly in the middle
	 
			if( A[m] < A[r] )
				// min can't be in the range
				// (m < i <= r), we can exclude A[m+1 ... r]
				r = m;
			else
				// min must be in the range (m < i <= r),
				// we must search in A[m+1 ... r]
				l = m+1;
		}
	 
		return -1;
	}
	 
	int BinarySearchIndexOfMinimumRotatedArray(int A[], int size)
	{
		return BinarySearchIndexOfMinimumRotatedArray(A, 0, size-1);
	}
	
}