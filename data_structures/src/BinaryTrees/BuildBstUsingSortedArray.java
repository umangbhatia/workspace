package BinaryTrees;

import java.util.Scanner;

import org.xml.sax.ext.LexicalHandler;

public class BuildBstUsingSortedArray {
	public static BinaryTree<Integer> build(int a[], int s, int e){
		if(s>e){
			return null;
		}
		int mid = (s+e)/2;
		BinaryTree<Integer> root = new BinaryTree<Integer>(a[mid]);
		root.left = build(a,s , mid-1);
		root.right = build(a, mid+1, e);
		return root;
	}

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
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a[] = takeInput();
		PrintLevelOrder.printBetter(build(a, 0, a.length-1));

	}

}
