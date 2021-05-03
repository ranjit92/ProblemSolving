package design.pattern.decorator;

public class BubbleLights extends TreeDecorator{
	
	public BubbleLights(ChristmasTree tree) {
		super(tree);
	}
	
	@Override
	public String decorate() {
		return super.decorate() + decorateWithBulb();
	}
	
	public String decorateWithBulb() {
		return " with bulb";
	}

}
