package Dictionary;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


public class Dictionary {
	class TrieNode{
		
		ArrayList<String> words;
		TrieNode[] nodes;
		
		TrieNode(){
			words = new ArrayList<String>();
			nodes = new TrieNode[8];
		}
		
		public ArrayList<String> getWords(){
			return this.words;
		}
	}
	
	TrieNode root;
	
	public Dictionary(){
		root = new TrieNode();
		readFile();
	}
	
	public String getWords(ArrayList<Integer> num){
		TrieNode t = root;
		for(int i=0; i<num.size(); i++){
			if(t==null){
				return "";
			}
			t = t.nodes[num.get(i)];
		}
		if(t==null){
			return "";
		}
		ArrayList<String> words = t.getWords();
		String result = "";
		for(int i=0; i<words.size(); i++){
			result+=words.get(i) + "\n";
		}
		return result;
	}
	
	public String getAllWords(ArrayList<Integer> num){
		if(num.isEmpty()){
			return "";
		}
		TrieNode t = root;
		for(int i=0; i<num.size(); i++){
			if(t==null){
				return "";
			}
			t = t.nodes[num.get(i)];
		}
		String result = getAllWords(t);
		return result;
	}
	
	private String getAllWords(TrieNode node) {
		String result = "";
		if(node == null){
			return "";
		}
		ArrayList<String> words = node.getWords();
		for(int i = 0; i < words.size(); i++){
			result+=words.get(i)+"\n";
		}
		for(int i = 0; i < 8; i++){
			result+=getAllWords(node.nodes[i]);
		}
		return result;
	}

	private void readFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("texts/words.txt").getFile().replace("%20", " "));
		try{
			//List<String> lines = Files.readAllLines(file.toPath());
		}catch(Exception e){
			e.printStackTrace();
		}
		ArrayList<String> words = new ArrayList<String>();
		BufferedReader br;
		
		try{
			br = new BufferedReader(new FileReader(file));
			String line;
			while( (line = br.readLine()) != null){
				words.add(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		for(int i=0; i<words.size(); i++){
			insertWord(words.get(i));
		}
		/**/
	}
	
	private void insertWord(String word){
		TrieNode trie = root;
		for(int i = 0; i<word.length(); i++){
			char c = word.charAt(i);
			int index = getIndex(c);
			if(index==-1){
				continue;
			}
			
			if(trie.nodes[index] == null){
				TrieNode temp = new TrieNode();
				trie.nodes[index] = temp;
				trie = temp;
			}else{
				trie = trie.nodes[index];
			}
			
			if(i == word.length()-1){
				trie.words.add(word);
			}
		}
	}
	
	
	
	private int getIndex(char c){
		switch(c){
		case 'a':
		case 'b':
		case 'c':return 0;
		case 'd':
		case 'e':
		case 'f':return 1;
		case 'g':
		case 'h':
		case 'i':return 2;
		case 'j':
		case 'k':
		case 'l':return 3;
		case 'm':
		case 'n':
		case 'o':return 4;
		case 'p':
		case 'q':
		case 'r':
		case 's':return 5;
		case 't':
		case 'u':
		case 'v':return 6;
		case 'w':
		case 'x':
		case 'y':
		case 'z':return 7;
		default: return -1;
			
		}
	}
}
