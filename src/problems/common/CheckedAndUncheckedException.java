package problems.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUncheckedException {

	public static void main(String[] args){
		
		int a = 10;
		int b = 0;
		
		//int c = a/b;
		
		getFile(null);
		
	}
	
	public static String getFile(String name){
		if(name == null || name.isEmpty()) {
			throw new RuntimeException("No file present");
		}
		return name;
	}
}
