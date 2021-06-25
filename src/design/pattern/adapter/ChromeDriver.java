package design.pattern.adapter;

public class ChromeDriver implements WebDriver{

	@Override
	public void selectElement() {
		System.out.println("Find element chrome");
	}

	@Override
	public void getElement() {
		System.out.println("Get element chrome");
	}

}
