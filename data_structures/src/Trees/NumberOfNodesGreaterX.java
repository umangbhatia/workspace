package Trees;
//1 3 2 3 4 1 5 1 6 1 7 0 0 0
import Trees.TreeUse;
public class NumberOfNodesGreaterX {
	public static int count(TreeNode<Integer> root, int x) {
//		if(root.children.size()==0){
//			if(root.data>x){
//				return 1;
//			}return 0;
//		}
		int count = 0;
		if(root.data>x){
			count++;
		}
		for(int i=0;i<root.children.size();i++){
			count+=count(root.children.get(i), x);
		}
		return count;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(count(root, 3));

	}

}
