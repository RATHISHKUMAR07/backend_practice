package Ds.Trees;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}


public class BinaryTree {
	
	
	TreeNode root;
	
	BinaryTree(){
		root = null;
	}
	
	public void insert(int val) {
		root = insertNode(val, root);
	}
	
	private TreeNode insertNode(int val, TreeNode root) {
		if(root == null) {
			root = new TreeNode(val);
			return root;
		}
		
		if(root.left == null) {
			root.left = insertNode(val,root.left);
		}
		else if(root.right == null) {
			root.right = insertNode(val, root.right);
		}
		else {
			root.left = insertNode(val, root.left);
		}

		
		return root;
	}
	
	public void preorder(TreeNode root) {
		if(root  == null) {
			return;
		}

		
		System.out.print(root.val + " ");
		inorder(root.left);
		inorder(root.right);
	}
	
	public void inorder(TreeNode root) {
		if(root  == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}
	
	public void postorder(TreeNode root) {
		if(root  == null) {
			return;
		}

		
		inorder(root.left);
		inorder(root.right);
		System.out.print(root.val + " ");
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        System.out.println("Preorder");
        tree.preorder(tree.root);
        
        System.out.println("\nInorder");
        tree.inorder(tree.root);
        
        System.out.println("\nPostorder");
        tree.postorder(tree.root);

	}

}
