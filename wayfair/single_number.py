#!/usr/bin/python
from sets import Set
class Solution(object):
	def singleNumber(self, nums):
		set=Set()
		for i in range(len(nums)):
			if nums[i] in (set) :
				set.remove(nums[i])
			else:
				set.add(nums[i])
		return set.pop()
s = Solution()		
numbers=[1,1,2,2,3]
print s.singleNumber(numbers)
