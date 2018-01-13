package Stacks;
import Stacks.StackUsingArray;
public class StackArrayUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingArray s = new StackUsingArray();
		StackUsingLL<Integer> l = new StackUsingLL<>();
		for(int i=0;i<5;i++){
			l.push(i);
		}
		while(!l.isEmpty())
		System.out.print(l.pop()+" ");
		System.out.println(l.size());

	}

}
