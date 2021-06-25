
public class EnumProblem {

	public static void main(String[] args) {
		CalCycle.CAL_CYCLE.execute(2);
	}
}

enum Calculator{
CALCULATOR;
	//private CalCycle calcy = CalCycle.CAL_CYCLE;
	
	public void calculateArea(double radis) {
		System.out.println(CalCycle.CAL_CYCLE.PI * radis * radis);
	}
}

enum CalCycle{
	
	CAL_CYCLE;
	public final double PI = 3.14;
	private Calculator cal = Calculator.CALCULATOR;
	
	public void execute(double radis) {
		cal.calculateArea(radis);
	}
}



