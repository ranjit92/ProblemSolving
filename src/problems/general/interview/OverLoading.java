package problems.general.interview;

public class OverLoading {
	public static void main(String[] args) {
		B a = new B();
		a.m1("new");
	}

	static class A {

		public void m1() {
			System.out.println("Am1");
		}

		public void m2() {
			System.out.println("Am2");
		}

	}

	static class B extends A {
		public void m1(String a) {
			System.out.println("Bm1 " + a);
		}

		public void m2() {
			System.out.println("Bm2");
		}

	}

}
