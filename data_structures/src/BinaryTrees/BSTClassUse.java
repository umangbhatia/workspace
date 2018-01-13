package BinaryTrees;

public class BSTClassUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BSTClass root = new BSTClass();
		root.insert(10);
		root.insert(7);
		root.insert(8);
		root.insert(12);
		System.out.println(root.size);
		System.out.println();
		PrintLevelOrder.printBetter(root.root);
		root.root = root.remove(12, root.root);
		System.out.println();
		PrintLevelOrder.printBetter(root.root);

	}

}
