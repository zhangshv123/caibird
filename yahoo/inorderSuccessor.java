
/*************************************************************************
*** Write a function to find the inorder successor of a node in a BST
	null
	/
	4
	/\
	3 5
	/\
	1 null  
*** Assume that all elements are unique
*************************************************************************/



public class Node {
	int data;
	Node left;
	Node right;
	Node Parent;
}

public Node inorderSuccessor(Node root,Node curr){
	//check right subtree
	if(curr.right!=null){//node has right subtree, return min in right subtree.
		Node temp = curr.right;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp;
	}
	//node do not have right subtree, then is node have its right parent, return parent, other return parent of parent.
	Node parent = curr.parent;
	while(parent!=null && parent.left!=curr){
		curr=parent;
		parent=parent.parent;
	}
	return parent;
}


/**************************************************************************************
*** Justin Bieber invents a new language. It is basically English, but 
*** the only difference is that the order of the alphabet is different.
*** He keeps the actual order a secret. However, his fans somehow have
*** obtained a list of random words he wrote down that they believe are
*** in his alphabetical order:
*** 
***     JUSTIN, BIEBER, BANANA, APPLE, ADD, ...
***
*** Help his fans figure out the order (or an order that is consistent with the list)
***************************************************************************************/
/**
J<B J<A 
I<A B<A
P<D 

I,A,B
LIST<String>
boolean int[26][26]
elmenet[A-'0'][J-'0'];

//store data in to table
 O(n*MAX(LENGTH{0,,,N}->C))
 
 
 //sorting:  we have k character O(k^2) E=k^2
 O(26*26)->O(1)
 
 //O(K)
 
 //the problem
 o(n)


**/

FUNCTION:O(LENGTH)
	COMPARE STRING S1,STRING S2
	O(min(s1.length,s2.length))
	GET: (Charcter A,Character B)

know the index of the character, it can insert the character at certain index and move thre rest element one after it.

String 


























