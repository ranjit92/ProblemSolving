package problems.common;

public class TrySystemExit {
	
	public static void main(String[] args) {
		try {
			System.out.println("in main");
//			System.exit(2);
		}
		finally {
			System.out.println("in finally");
		}
	}

}
