package BinaryTrees;

public class BSTClass {
	BinaryTree<Integer> root = new BinaryTree<Integer>(null);
	int size = 0;
	BinaryTree<Integer> temp = new BinaryTree<Integer>(null);
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;
	}
	public static int Max(BinaryTree<Integer> root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(Max(root.left), Max(root.right)));
	}
	public static int Min(BinaryTree<Integer> root){
		if(root==null){
			return Integer.MAX_VALUE;
		}
		
		return Math.min(root.data, Math.min(Min(root.left), Min(root.right)));
	}
	public BinaryTree<Integer> remove(int a, BinaryTree<Integer> root){
		if(root==null){
			return null;
		}
		if(root!=null){
		if(root.data==a){
			if(root.right==null&&root.left==null){
				size--;
				return null;
			}
			if(root.right==null&&root.left!=null){
				
				size--;
				return null;
			}
			if(root.left==null&&root.right!=null){
				
				size--;
				return null;
				
			}
			if(root.right!=null&&root.left!=null){
				temp.data = Min(root.right);
				root.data = temp.data;
				root.right= remove(temp.data, root.right);
				return root;
 			}
		}else{
			if(root.data>a){
				root.left= remove(a, root.left);
				return root;
			}else{
				root.right = remove(a, root.right);
				return root;
			}
		}
	}
		return root;
	}
	
	public void insert(int a){
		BinaryTree<Integer> current = new BinaryTree<Integer>(a);
		if(size==0){
			root.data = a;
			temp = root;
			size++;
			return;
		}else{
			while(true){
				if(a>temp.data){
					if(temp.right==null){
						temp.right=current;
						temp = root;
						size++;
						return;
					}else{
						temp = temp.right;
						
					}
				}else{
					if(temp.left==null){
						temp.left=current;
						temp = root;
						size++;
						return;
					}else{
						temp = temp.left;
				
					}
				}
			}
		}
		
	}
	
	
}
