from linkedlist import List,ListNode
class ListNode(object):

	def __init__(self, val, next=None):
		self.val = val
		self.next = next
class Solution:
	def deleteDuplicates(self, head):
		# write your code here
		if head==None or head.next==None :
			return head
		dummy=ListNode(0)
		dummy.next=head
		head=dummy
		while head.next and head.next.next :
			if head.next.val==head.next.next.val:
				value=head.next.val
				while head.next and head.next.val==value:
					head.next=head.next.next
			else:
					head=head.next
		return dummy.next
		
s = Solution()
l = List()
print l.serilize(s.deleteDuplicates(l.deserilize([0,1,1,2,3])))