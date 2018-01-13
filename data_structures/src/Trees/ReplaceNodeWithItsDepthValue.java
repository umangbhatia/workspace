package Trees;
//redo
public class ReplaceNodeWithItsDepthValue {
	public static void replace(TreeNode<Integer> root, int count){
		if(root==null){
			return;
		}
		root.data = count;

		for(int i=0; i<root.children.size();i++){
			replace(root.children.get(i), count+1);
		}
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		replace(root, 1);
		TreeUse.printL((root));

	}

}
