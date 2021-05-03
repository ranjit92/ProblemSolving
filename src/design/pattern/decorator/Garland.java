package design.pattern.decorator;

public class Garland extends TreeDecorator{
	public Garland(ChristmasTree tree) {
		super(tree);
	}
	
	@Override
	public String decorate() {
		return super.decorate() + decorateWithGarLand();
	}
	
	public String decorateWithGarLand() {
		return " with Garland";
	}
}
