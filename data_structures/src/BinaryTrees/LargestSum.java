package BinaryTrees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LargestSum {
	public static int solution(BinaryTree<Integer> root){
		if(root.left==null&&root.right==null){
			return root.data;
		}
		int sumL = solution(root.left);
		int sumR = solution(root.right);
		int sumWR = root.data+sumR;
		int sumWL = root.data+sumL;
		int sum = root.data+sumL+sumR;
		return Math.max(sumR, Math.max(sumL, Math.max(sumWR, Math.max(sum, sumWL))));
	}
	public static BinaryTree<Integer> input(int nodes, int tree[]){
		BinaryTree<Integer> root = new BinaryTree<Integer>(tree[0]);
		int count =1;
		ArrayList<BinaryTree<Integer>> array = new ArrayList<>();
		array.add(root);
		while(!array.isEmpty()){
			BinaryTree<Integer> current = array.get(0);
			array.remove(0);
			current.left = new BinaryTree<Integer>(tree[count]);
			array.add(current.left);
			count++;
			current.right = new BinaryTree<Integer>(tree[count]);
			count++;
			array.add(current.right);
			if(count==nodes){
				break;
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
			int nodes = s.nextInt();
			int tree[] = new int[nodes];
			for(int i=0;i<nodes;i++){
				tree[i] = s.nextInt();
			}
			BinaryTree<Integer> root = input(nodes, tree);
			System.out.println(solution(root));
		}

	}

}
