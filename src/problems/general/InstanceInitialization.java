package problems.general;

public class InstanceInitialization {
	{
		System.out.println("print block2");
	}
	{
		System.out.println("print block");
	}
	
	static {
		System.out.println("print static block");
	}
	
	public InstanceInitialization(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		 InstanceInitialization a_ = new InstanceInitialization("From constroctor ");
	}
	
}
