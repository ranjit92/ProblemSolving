package problems.leetcode.may;

/**
 * @author ranjit
 *
 *         <p>
 *         Trie is an efficient information reTrieval data structure. Using
 *         Trie, search complexities can be brought to optimal limit (key
 *         length). If we store keys in binary search tree, a well balanced BST
 *         will need time proportional to M * log N, where M is maximum string
 *         length and N is number of keys in tree. Using Trie, we can search the
 *         key in O(M) time. However the penalty is on Trie storage requirements
 *         (Please refer Applications of Trie for more details)
 *         </p>
 */
public class Trie {

	static final int ALPHABET_SIZE = 26; // consider only lower case a-z

	TrieNode root = new TrieNode();

	private static class TrieNode {

		TrieNode[] children = new TrieNode[ALPHABET_SIZE];

		boolean isEndOfWord;

		public TrieNode() {
			isEndOfWord = false;
		}

	}

	/** Initialize your data structure here. */
	public Trie() {
		new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {

		int level;
		int length = word.length();
		int index;
		TrieNode trav = root;
		
		for(level = 0; level < length; level++) {
			index = word.charAt(level)-'a';
			if(null == trav.children[index]) {
				trav.children[index] = new TrieNode();
			}
			trav = trav.children[index];
		}
		
		trav.isEndOfWord = true;
		
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		
		int level;
		int length = word.length();
		int index;
		TrieNode trav = root;
		
		for(level = 0; level < length; level++) {
			
			index = word.charAt(level)-'a';
			
			if(trav.children[index] == null)
				return false;
			
			trav = trav.children[index];
		}
		
		return (trav !=null && trav.isEndOfWord);
		
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		int level;
		int length = prefix.length();
		int index;
		TrieNode trav = root;
		
		for(level = 0; level < length; level++) {
			
			index = prefix.charAt(level)-'a';
			
			if(trav.children[index] == null)
				return false;
			
			trav = trav.children[index];
		}
		
		return (trav !=null);
	}
	
	
	public static void main(String[] args) {
		Trie obj = new Trie();
		  obj.insert("educ");
//		  obj.insert("educat");
		  System.out.println(obj.search("educ"));
		  System.out.println(obj.startsWith("eduy"));
//		  boolean param_3 = obj.startsWith(prefix);
	}
}
