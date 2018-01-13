package Trees;

public class PrintNodesAtDepthK {
	public static void print(TreeNode<Integer> root, int k){
		if(k==0){
			System.out.println(root.data);
			return;
		}
		if(root.children.size()==0){
			return;
		}
		for(int i=0; i<root.children.size();i++){
			print(root.children.get(i), k-1);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root =TreeUse.takeInputL();
		print(root, 2);

	}

}
