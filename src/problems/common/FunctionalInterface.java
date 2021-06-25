package problems.common;

interface FunctionalInterfaceTest {

	public void get();
	
	public default void get1() {
		System.out.println("get1");
	}
	public default void get2() {
		System.out.println("get2");
	}
}


class Impl implements FunctionalInterfaceTest{

	@Override
	public void get() {
		System.out.println("get");
	}
	
	@Override
	public void get1() {
		System.out.println("get from Impl");
	}
}

public class FunctionalInterface{
	public static void main(String[] args) {
		FunctionalInterfaceTest fi = new Impl();
		fi.get();
		fi.get1();
		fi.get2();
	}
}

