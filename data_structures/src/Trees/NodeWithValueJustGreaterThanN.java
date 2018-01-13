package Trees;

import queues.QueuesUsingLL;

public class NodeWithValueJustGreaterThanN {
	public static int findNode(TreeNode<Integer> root, int n) {
		if(root.children.size()==0){
			if(root.data>n) return root.data;
			else return Integer.MAX_VALUE;
		}
		int greater = Integer.MAX_VALUE;

		for(int i=0; i<root.children.size();i++){
			int check = findNode(root.children.get(i), n);
			if(check>n&&check<greater){
				greater = check;
			}
			if(root.data>n&&root.data<greater){
				greater = root.data;
			}else{
				greater = check;
			}
		}
		return greater;

	}
	public static int findNodeI(TreeNode<Integer> root, int n) throws Exception{
		int ans = Integer.MAX_VALUE;
		if(root.data>n){
			ans = root.data;
		}
		TreeNode<Integer> current = root;
		QueuesUsingLL<TreeNode<Integer>> q = new QueuesUsingLL<>();
		q.enqueue(current);
		while(!q.isEmpty()){
			current = q.dequeue();
			for(int i=0; i<current.children.size();i++){
				int check = current.children.get(i).data;
				if(check>n && check<ans){
					ans = check;
				}
				q.enqueue(current.children.get(i));
			}
		}
		return ans;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(findNodeI(root, 4));

	}

}
