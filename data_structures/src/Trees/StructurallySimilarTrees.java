package Trees;

public class StructurallySimilarTrees {
	public static boolean check(TreeNode<Integer> root1, TreeNode<Integer> root2){
		if(root1.data!=root2.data||root1.children.size()!=root2.children.size()){
			return false;
		}
		if(root1.data==root2.data&&root1.children.size()==0&&root2.children.size()==0){
			return true;
		}
		for(int i=0;i<root1.children.size();i++){
			boolean check=check(root1.children.get(i), root2.children.get(i));
			if(check==false){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root1 = TreeUse.takeInputL();
		TreeNode<Integer> root2 = TreeUse.takeInputL();
		System.out.println(check(root1, root2));

	}

}
