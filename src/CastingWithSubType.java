
public class CastingWithSubType {
	public static void main(String[] args) {
		Parent p = new Sub();
		//p.print();
		Sub b = (Sub)p;
		b.print();
	}
}


class Parent{
	
}


class Sub extends Parent{
	
	public void print() {
		System.out.println("Indside print");
	}
}



