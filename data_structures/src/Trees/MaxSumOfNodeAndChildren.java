
package Trees;
import Trees.TreeUse;

//1 3 2 3 4 1 5 1 6 1 7 0 0 0

public class MaxSumOfNodeAndChildren {
	public static int check(TreeNode<Integer> root){
		if(root.children.size()==0){
			return root.data;
		}
		int sum = root.data;
		
		for(int i =0; i<root.children.size();i++){
			sum+= root.children.get(i).data;
		}
		int max = sum;
		for(int i=0; i<root.children.size(); i++){
			int check = check(root.children.get(i));
			if(check>max){
				max = check;
			}
		}
		return max;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(check(root));

	}

}
