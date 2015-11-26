//     2
//   /   \
//  1     4
//   \   /  \
//    5  3    6
import java.util.*;
class Untitled {
	public static void main(String[] args) {
		node root=new node(2);
		root.left=new node(1);
		root.right=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(3);
		root.right.right=new node(6);
		printAll(root);
	}
	public static class node{
		int val;
		node left;
		node right;
		public node(int val){
			this.val=val;
			this.left=null;
			this.right=null;
		}
	}
	
	public static void printAll(node root){
		ArrayList<node> path=new ArrayList<>();
		//if it is a leaf
		if(root.left==null&&root.right==null){
			for(node item: path){
				System.out.println(item.val+" ");
			}
			System.out.println(root.val);
		}else{  
			path.add(root);
			if(root.left!=null)
				printAll(root.left);
			if(root.right!=null)
				printAll(root.right);

			path.remove(path.size()-1);
		}
	}
}