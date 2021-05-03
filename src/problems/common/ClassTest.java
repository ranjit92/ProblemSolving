package problems.common;

public class ClassTest {
	public static void main(String[] args) {
		BB obj = new BB();
//		CC obj1 = new CC();
		obj.methodABC();
	}
}

	class AA {
		public AA() {
			System.out.println("A");
		}

		public void methodABC() {
			System.out.println("A-ABC");
		}
	}

	class BB extends AA {
		public BB() {
			System.out.println("B");
		}

		public void methodABC() {
			System.out.println("B-ABC");
		}
	}

	class CC extends BB {
		public CC() {
			System.out.println("C");
		}

		public void methodABC() {
			System.out.println("C-ABC");
		}
	}


