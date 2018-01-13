package Stacks;

public class StockSpan {
	public static int[] span(int input[]) throws StackEmptyException{
		int ans[] = new int[input.length];
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		for(int i=0;i<input.length;i++){
			boolean done = false;
			while(!done){
				if(stack.isEmpty()){
					stack.push(i);
					ans[i]=i+1;
					done = true;
				}
				else if(input[i]>input[stack.top()]){
					stack.pop();
				}
				else{
					ans[i]=i-stack.top();
					stack.push(i);
					done = true;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		int input[] = {26, 27, 88, 19, 99,52};
		int ans[] = span(input);
		for(int i: ans){
			System.out.println(i);
		}

	}

}
