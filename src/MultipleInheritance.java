interface A {

	public default void get() {
		System.out.println("From A");
	}
}

interface B {
	public default void get() {
		System.out.println("From B");
	}
}

public class MultipleInheritance implements A, B {

//	@Override
//	public void get() {
//		A.super.get();
//		B.super.get();
//	}

	public static void main(String[] args) {
		MultipleInheritance ob = new MultipleInheritance();
		ob.get();
	}

	@Override
	public void get() {

		A.super.get();
	}

}
