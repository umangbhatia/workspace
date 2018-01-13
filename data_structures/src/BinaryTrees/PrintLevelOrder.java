package BinaryTrees;

import queues.QueuesUsingLL;

public class PrintLevelOrder {
	public static void print(BinaryTree<Integer> root) throws Exception{
		if(root==null){
			return;
		}
		System.out.println(root.data);
		if(root.left==null&&root.right==null){
			return;
		}
		int countNl =0;
		int countPl = 0;
		int k=0;
		BinaryTree<Integer> check = new BinaryTree<Integer>(null);
		QueuesUsingLL<BinaryTree<Integer>> q = new QueuesUsingLL<>();
		q.enqueue(root);
		if(root.right!=null){
			countNl++;
		}
		if(root.left!=null){
			countNl++;
		}
		while(!q.isEmpty()){
			countPl = countNl;
			countNl = 0;
			k=0;
			if(countPl==0){
				break;
			}
			while(k!=countPl){
				BinaryTree<Integer> current = q.dequeue();
				if(current.left!=null){
					check = current.left;
					System.out.print(current.left.data+" ");
					k++;
					if(check.right!=null){
						countNl++;
					}
					if(check.left!=null){
						countNl++;
					}
					q.enqueue(current.left);
				}
				if(current.right!=null){
					System.out.print(current.right.data+" ");
					k++;
					q.enqueue(current.right);
					check = current.right;
					if(check.right!=null){
						countNl++;
					}
					if(check.left!=null){
						countNl++;
					}
				}
			}
			System.out.println();
			
		}
	}
	public static void printBetter(BinaryTree<Integer> root) throws Exception{
		QueuesUsingLL<BinaryTree<Integer>> primary = new QueuesUsingLL<>();
		QueuesUsingLL<BinaryTree<Integer>> secondry = new QueuesUsingLL<>();
		primary.enqueue(root);
		while(!primary.isEmpty()){
			BinaryTree<Integer> current = primary.dequeue();
			if(current!=null){
			System.out.print(current.data+" ");
			if(current.left!=null){
				secondry.enqueue(current.left);
			}
			if(current.right!=null){
				secondry.enqueue(current.right);
			}
			if(primary.isEmpty()){
				primary = secondry;
				secondry = new QueuesUsingLL<>();
				System.out.println();
			}
		}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		print(root);
		printBetter(root);

	}

}
