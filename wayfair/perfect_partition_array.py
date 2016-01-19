#!/usr/bin/python
#Insertion sort is a simple algorithm and swaps adjacent numbers in O(1) space. 
#This is the general behavior we're looking for. 
#In the code below, the integers are continuously swapped until the beginning of the list, initially represented by `j`, is reached. 
#Once `j` is reached, `j` is incremented by 1 to prevent the partitioned part of the list from being altered. ``
class Solution:
	def partition4(self,L):
		j = 0
		
		for i in range(1, len(L)):
			val = L[i]
			k = i
		   
			while k > j and val < 0:
				L[k] = L[k - 1]
				k -= 1
			   
				if j == k:
					j += 1
	 
			L[k] = val
		return L
s = Solution()		
L = [1,-2,3,-1,2,-3]
print s.partition4(L)

# result: [-3, -7, -6, -5, 9, 2, 1, 0, 0, 3, 2] ``` Here's a visual of how the partitioning works with the integers -3 and -7. -3 is swapped until it reaches the L[0]. Next, -7 is swapped until it reaches L[1] and so on. ``` # -3 [9, 2, -3, 1, 0, 0, -7, -6, 3, -5, 2] # first pass [9, -3, 2, 1, 0, 0, -7, -6, 3, -5, 2] # second pass [-3, 9, 2, 1, 0, 0, -7, -6, 3, -5, 2] # third pass # -7 [-3, 9, 2, 1, 0, 0, -7, -6, 3, -5, 2] # first pass [-3, 9, 2, 1, 0, -7, 0, -6, 3, -5, 2] # second pass [-3, 9, 2, 1, -7, 0, 0, -6, 3, -5, 2] [-3, 9, 2, -7, 1, 0, 0, -6, 3, -5, 2] [-3, 9, -7, 2, 1, 0, 0, -6, 3, -5, 2] [-3, -7, 9, 2, 1, 0, 0, -6, 3, -5, 2] ... ```
