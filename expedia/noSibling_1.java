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
	//		Node parent;
			Node(double val){
				this.val=val;
				this.left=null;
				this.right=null;
	//			this.parent=null;
			}
		}
	public static void main(String[] args) {
			Node root=new Node(7);
			Node n1=new Node(6);
			root.left=n1;
			Node n2=new Node(8);
			root.right=n2;
	//		n1.parent=root;
	//		n2.parent=root;
			Node n3=new Node(5);
			Node n4=new Node(7.5);
			Node n5=new Node(8.5);
			n1.left=n3;
	//		n3.parent=n1;
			n2.left=n4;
	//		n4.parent=n2;
	        n4.right=n5;
			System.out.println(root.val);

			noSibling(root);
	}
	public static void noSibling(Node root ){
		if(root==null){
			return;
		}
		if(root.left==null && root.right!=null){
			System.out.println(root.right.val);
		}
		if(root.left!=null && root.right==null){
			System.out.println(root.left.val);
		}
		noSibling(root.left);
		noSibling(root.right);
	}
	
}