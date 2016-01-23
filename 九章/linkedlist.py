#!/usr/bin/python

class ListNode(object):
	def __init__(self, x):
		self.val = x
		self.next = None
class List(object):
#	head
#	def __init__(self, head):
#		self.head = head
	def deserilize(self, nums):
		nodes = [ListNode(x) for x in nums]
		for i in range(0,len(nodes)-1):
			nodes[i].next = nodes[i+1]
		return nodes[0]
	def serilize(self, node):
		res = []
		while node is not None:
			res.append(node.val)
			node = node.next
		return res
	def mid(self, head):
		slow, fast = head, head.next
		while fast != None and fast.next != None:
			slow = slow.next
			fast = fast.next.next
		return slow