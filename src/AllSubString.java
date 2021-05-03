import java.util.ArrayList;
import java.util.List;

public class AllSubString {

	public static void main(String[] args) {
		List<String> all = getAllSubString("abcd");
		all.forEach(System.out::println);
	}
	
	
	public static List<String> getAllSubString(String str){
		List<String> all = new ArrayList<>();
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				StringBuilder sb = new StringBuilder();
				for(int k = i; k <= j; k++) {
					sb.append(str.charAt(k));
				}
//				String sb = str.substring(i, j+1);
				
				all.add(sb.toString());
			}
		}
		return all;
	}
}
