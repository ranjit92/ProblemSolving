package problems.general;

public class FloatTest1 {
	public static void main(String[] args) {
		int a = 40;
		long b = 10L;
		float c = 4.0f;
		double d = 5.0d;
		
		
		double  re = (a + b)*(c + d);
		System.out.println(re);
		
		A aa = new B();
		aa.print();
	}
	
}

class A {
	public void print() {
		System.out.println("Print from A");
	}
}

class B extends A{
	public void print() {
		System.out.println("Print from B");
	}
}