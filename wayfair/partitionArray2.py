#!/usr/bin/python
#!/usr/bin/python
#!/usr/bin/python
class Solution:
	"""
	@param nums: The integer array you should partition
	@param k: As description
	@return: The index after partition
	"""
	def partitionArray2(self, nums, k):
		pos=[]
		neg=[]
		for i in range(len(nums)):
			if(nums[i]>=0):
				pos.append(nums[i])
			else:
				neg.append(nums[i])
		for i in range(len(neg)):
			nums[i]=neg[i]
		for i in range(len(pos)):
			nums[len(neg)+i]=pos[i]
		return nums
s = Solution()		
numbers=[1,-2,3,-1,2,-3]
print s.partitionArray2(numbers,0)

