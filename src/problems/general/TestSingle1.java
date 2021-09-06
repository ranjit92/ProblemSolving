package problems.general;

public class TestSingle1 {

	TestSingle1 test=null;
	
	private TestSingle1() {
		
	}
	
	public TestSingle1 getInstance() {
		if(test == null) {
			synchronized(TestSingle1.class) {
				if(test == null) {
					return new TestSingle1();
				}
			}
			
		}
			return test;
		
	}
	
}
