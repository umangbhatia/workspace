package TextProcessing;

import java.util.HashMap;

public class TrieNode {
	char value;
	boolean isTerminating;
	HashMap<Character, TrieNode> children;
	public TrieNode(char value) {
		// TODO Auto-generated constructor stub
		this.value = value;
		children = new HashMap<>();
	}

}
