package Trees;
//1 3 2 3 4 1 5 1 6 1 7 0 0 0
import Trees.TreeUse;
public class HeightOfATree {
	public static int height(TreeNode<Integer> root){
		if(root.children.size()==0){
			return 1;
		}
		int height = 1;
		int max = 0;
		for(int i=0; i<root.children.size();i++){
			int check = height(root.children.get(i));
			if(check>max){
				max = check;
			}
		}
		height += max;
		return height;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(height(root));

	}

}
