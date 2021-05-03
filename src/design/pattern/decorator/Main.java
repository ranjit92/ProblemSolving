package design.pattern.decorator;

public class Main {
	public static void main(String[] args) {
		ChristmasTree tree = new Garland(new BubbleLights(new ChristmasTreeImpl()));
		System.out.println(tree.decorate());

	}
}
