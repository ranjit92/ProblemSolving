package problems.common;

public class Test3 {

	
}

class AAA {
AAA() {
print();
}
public void print() {
System.out.println("Inside A");
}
}


class BBB extends AAA {
int x = 10;
BBB() {
print();
}
public void print() {
System.out.println("Inside B");
}
}

// driver class
class DriverTest {
public static void main(String args[]) {

AAA a = new BBB();
//System.out.println(a.x);

}

}
