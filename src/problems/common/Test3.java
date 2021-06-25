package problems.common;

public class Test3 {

	
}

public class A {
A() {
print();
}
public void print() {
System.out.println("Inside A");
}
}


class B extends A {
int x = 10;
B() {
print();
}
protected void print() {
System.out.println("Inside B");
}
}

// driver class
class DriverTest {
public static void main(String args[]) {

A a = new B();
//System.out.println(a.x);

}

}
