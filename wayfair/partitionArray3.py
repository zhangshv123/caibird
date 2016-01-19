class Solution:
	"""
	@param nums: The integer array you should partition
	@param k: As description
	@return: The index after partition
	"""
	def partitionArray3(self, nums):
		count=0
		for i in range(len(nums)):
			if nums[i]<0 :
				count+=1
		pos=0
		neg=count
		for i in range(len(nums)):
			if(nums[i]>=0):
				nums[i]=neg+nums[i]*0.1
				neg+=1
			else:
				nums[i]=-pos-abs(nums[i])*0.1
				pos+=1
		for i in range(len(nums)):
			while abs(int(nums[i])) != i:
				idx = abs(int(nums[i]))
				nums[i],nums[idx] = nums[idx],nums[i]
		return nums
s = Solution()		
numbers=[1,-2,3,-1,2,-3]
print s.partitionArray3(numbers)