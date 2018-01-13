package Trees;

import queues.QueuesUsingLL;

public class SecondLargest {
	public static MultipleResult<Integer> secLargest(TreeNode<Integer> root){
		MultipleResult<Integer> result = new MultipleResult<>();
		if(root.children.size()==0){
			result.result1 = root.data;
			result.result2 = null;
			return result;
		}
		int max = root.data;
		int second = root.data;
		for(int i=0; i<root.children.size();i++){
			int check1 = Integer.MIN_VALUE;
			int check2 = check1;
			if(secLargest(root.children.get(i)).result1!=null){
				 check1 = secLargest(root.children.get(i)).result1;
			}
			if(secLargest(root.children.get(i)).result2!=null){
				 check2 = secLargest(root.children.get(i)).result2;
			}
			int maxx = Math.max(max, check1);
			if(maxx == check1){
				second = Math.max(max, check2);
			}else{
				second = Math.max(check1, second);
			}
			max  = maxx;
		}
		result.result1= max;
		result.result2 = second;
		return result;
	}
	public static int secLargestI(TreeNode<Integer> root) throws Exception{
		int max = root.data;
		int second = root.data;
		TreeNode<Integer> current = root;
		QueuesUsingLL<TreeNode<Integer>> q = new QueuesUsingLL<>();
		q.enqueue(current);
		while(!q.isEmpty()){
			current = q.dequeue();
			for(int i =0;i<current.children.size();i++){
				int check2 = current.children.get(i).data;
				if(check2>max){
					second = max ;
					max = check2;
				}
				if(check2>second&&check2<max){
					second = check2;
				}
				q.enqueue(current.children.get(i));
			}
		}
		return second;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(secLargest(root).result2);
	}

}
