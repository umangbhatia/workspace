package Trees;

public class NumberOfLeafNodes {
	public static int count(TreeNode<Integer> root){
		if(root.children.size()==0){
			return 1;
		}
		int count = 0;
		for(int i=0; i<root.children.size();i++){
			count+= count(root.children.get(i));
		}
		return count;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(count(root));

	}

}
