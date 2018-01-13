package TextProcessing;

public class TrieClass {
	private TrieNode root;
	int count = 0;
	public TrieClass(){
		root = new TrieNode('\0');
	}
	public int count(){
		return count;
	}
	public boolean find(String word){
		return find(word, root);
	}
	private boolean find(String word, TrieNode root) {
		if(word.length()==0){
			if(root.isTerminating)
			return true;
			return false;
		}
		TrieNode next = root.children.get(word.charAt(0));
		if(next==null){
			return false;
		}else{
			return find(word.substring(1), next);
		}
	}
	public boolean findI(String word){
		TrieNode currentNode = root;
		for(int i=0;i<word.length();i++){
			TrieNode child = currentNode.children.get(word.charAt(i));
			if(child!=null){
				currentNode = child;
			}else{
				return false;
			}
		}
		return currentNode.isTerminating;
	}
	public void add(String word){
		if(!find(word)){
			count++;
			add(word, root);
		}
	}
	private void add(String word, TrieNode root) {
		if(word.length()==0){
			root.isTerminating=true;
			return;
		}
		// TODO Auto-generated method stub
		TrieNode current = root.children.get(word.charAt(0));
		if(current==null){
			current = new TrieNode(word.charAt(0));
			root.children.put(word.charAt(0), current);
			
		}
		add(word.substring(1), current);
	}
	public boolean remove(String word){
		if(find(word)){
			count--;
		return remove(word, root);
		}
		return false;
	}
	private boolean remove(String word, TrieNode root) {
		// TODO Auto-generated method stub
		if(word.length()==0){
			root.isTerminating=false;
			return true;
		}
		TrieNode child = root.children.get(word.charAt(0));
		boolean smallans = remove(word.substring(1), child);
		if(smallans){
			if(!child.isTerminating && child.children.size()==0){
				root.children.remove(child.value);
			}
		}
		return false;
	}
	

}
