package design.pattern.bridge;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle() {
		System.out.println("Green circle");
	}

}
