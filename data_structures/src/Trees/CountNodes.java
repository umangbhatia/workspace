package Trees;
import Trees.TreeUse;
public class CountNodes {
	public static int count(TreeNode<Integer> root) {
		if(root.children.size()==0){
			return 1;
		}
		if(root.data==null){
			return 0;
		}
		int count = 1;
		for(int i=0; i<root.children.size();i++){
			count += count(root.children.get(i));
		}
		return count;
		
	}
//	1 3 2 3 4 1 5 1 6 1 7 0 0 0
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(count(root));

	}

}
