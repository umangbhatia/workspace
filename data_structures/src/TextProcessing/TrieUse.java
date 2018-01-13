package TextProcessing;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieClass t = new TrieClass();
		t.add("abc");
		t.add("new");
		t.add("news");
		t.add("are");
		System.out.println(t.find("news"));
		System.out.println(t.count());
		t.remove("news");
		System.out.println(t.find("news"));
		System.out.println(t.count());

	}

}
