import java.util.*;
//		   7
//		/    \
//	  6 	  8
//	/       /
// 5       7.5
//			   \
//				8.5
class Untitled {
	private static class Node{
			double val;
			Node left;
			Node right;
			Node(double val){
				this.val=val;
				this.left=null;
				this.right=null;
			}
		}
	public static void main(String[] args) {
		Node root=new Node(7);
				Node n1=new Node(6);
				root.left=n1;
				Node n2=new Node(8);
				root.right=n2;
				Node n3=new Node(5);
				Node n4=new Node(7.5);
				Node n5=new Node(8.5);
				n1.left=n3;
				n2.left=n4;
		        n4.right=n5;
				noSibling(root);
	}
	
	public static void noSibling(Node root){
		Queue<Node> parent=new LinkedList<>();
		System.out.println(root.val);
		parent.offer(root);
		while(!parent.isEmpty()){
			Queue<Node> children=new LinkedList<>();
			while(!parent.isEmpty()){
			    root=parent.poll();
				if(root.left!=null)
					children.offer(root.left);
				if(root.right!=null)
					children.offer(root.right);
			}
			if(children.size()==1)
				System.out.println(children.peek().val);
			parent=children;
		}
	}
	
	
}