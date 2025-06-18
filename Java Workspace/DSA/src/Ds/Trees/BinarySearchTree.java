package Ds.Trees;
class Tree{
	int val;
	Tree left;
	Tree right;
	
	Tree(int val){
		this.val = val;
	}
}
public class BinarySearchTree {
	
	Tree root;
	
	BinarySearchTree(){
		root = null;
	}
	
	
	Tree insert(int val, Tree root) {
		if(root == null) {
			root = new Tree(val);
		}
		else if(val < root.val) {
			root.left = insert(val, root.left);
		}
		else {
			root.right = insert(val, root.right);
		}
		
		return root;
	}
	
	Tree search(int val, Tree root)
	{
		if(root.val == val) {
			System.out.println("True - " + val);
			return root;
		}
		else if(val <  root.val) {
			return search(val, root.left);
		}
		else {
			return search(val, root.right);
		}			
	}
	
	void sortTree(Tree root) {
		if(root == null) {
			return;
		}
		
		sortTree(root.left);
		System.out.print(root.val + " ");
		sortTree(root.right);
	}
	
	int minValue(Tree root) {
		int min = root.val;
		while(root.left != null) {
			min = root.left.val;
			root = root.left;
		}
		
		return min;
	}
	
	int maxValue(Tree root) {
		int max = root.val;
		while(root.right != null) {
			max = root.right.val;
			root = root.right;	
		}
		
		return max;
	}
	
	Tree delete(Tree root, int val) {
		if(root  == null) {
			return root;
		}
		
		if(val < root.val) {
			root.left = delete(root.left, val);
		}
		else if(val >  root.val) {
			root.right = delete(root.right, val);
		}
		else {
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			
			root.val = minValue(root.right);
			root.right = delete(root.right, root.val);
		}
		
		return root;
	}	
	
	

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.root = bst.insert(50, bst.root);
		bst.root = bst.insert(30, bst.root);
		bst.root = bst.insert(20, bst.root);
		bst.root = bst.insert(40, bst.root);
		bst.root = bst.insert(70, bst.root);
		bst.root = bst.insert(60, bst.root);
		bst.root = bst.insert(80, bst.root);
		
		bst.sortTree(bst.root);
		
		System.out.println("\nMin - " + bst.minValue(bst.root));
		System.out.println("Max - " + bst.maxValue(bst.root));
		
		bst.search(40, bst.root);
		
		bst.delete(bst.root, 50);
		
		bst.sortTree(bst.root);



	}

}
