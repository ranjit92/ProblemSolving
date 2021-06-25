package problems.common;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) {
		
		
		String[] strarr = new String[10];
		
		//example one null pointer
//		String str = strarr[9].concat("something");
//		System.out.println("printing value "+ str);
		
		
		//example with optional
		
		Optional<String> opVal = Optional.ofNullable(strarr[9]);
		System.out.println("printing value "+ opVal.orElse("default"));
		
	}

}
