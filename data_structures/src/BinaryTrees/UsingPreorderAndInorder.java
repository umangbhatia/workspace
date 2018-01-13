package BinaryTrees;

import java.util.Scanner;

public class UsingPreorderAndInorder {
	public static int[]takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size = s.nextInt();
		int input[]= new int[size];
		for(int i=0; i<size; i++){
			System.out.println("enter "+i+" element");
			input[i]=s.nextInt();
		}
		return input;
		}
	public static BinaryTree<Integer> build(int pre[], int in[]){
		if(pre.length==0){
			return null;
		}
		BinaryTree<Integer> root = new BinaryTree<Integer>(pre[0]);
		int data = pre[0];
		int index = 0;
		for(int i=0;i<in.length;i++){
			if(in[i]==data){
				index = i;
				break;
			}
		}
		int inLeft[] = new int[index];
		int inRight[] = new int[in.length-index-1];
		for(int i = 0;i<index;i++){
			inLeft[i] = in[i];
		}
		for(int i = index+1;i<in.length;i++){
			inRight[i-index-1] = in[i];
		}
		int preLeft[] = new int[inLeft.length];
		int count =0;
		for(int i=0;i<pre.length;i++){
			for(int j=0; j<inLeft.length;j++){
				if(pre[i]==inLeft[j]){
					preLeft[count] = inLeft[j];
					count++;
				}
			}
		}
		int preRight[] = new int[inRight.length];
		count =0;
		for(int i=0;i<pre.length;i++){
			for(int j=0; j<inRight.length;j++){
				if(pre[i]==inRight[j]){
					preRight[count] = inRight[j];
					count++;
				}
			}
		}
		root.left = build(preLeft, inLeft);
		root.right = build(preRight, inRight);
		return root;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int in [] = takeInput();
		int pre[] = takeInput();
		BinaryTreeUse.printL(build(pre, in));

	}

}
