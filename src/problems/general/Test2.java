package problems.general;

public class Test2 {

	public static int getInt(){

		try{
		return 10;
		}
		catch(Exception e){
		return 20;
		}

		finally{
		return 30;
		}

		


	}
	
	public static void main(String[] args) {
		System.out.println(getInt());
	}
}
