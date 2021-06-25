package design.pattern.bridge;

public class Main {
	public static void main(String[] args) {
		Shape redcircle = new Circle(new RedCircle());
		Shape greenCircle = new Circle(new GreenCircle());
		
		redcircle.draw();
		greenCircle.draw();
	}

}
