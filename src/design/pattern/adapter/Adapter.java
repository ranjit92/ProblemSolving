package design.pattern.adapter;

public class Adapter implements WebDriver{

	private IEDriver iedriver;
	
	
	public Adapter(IEDriver iedriver) {
		this.iedriver = iedriver;
	}
	@Override
	public void selectElement() {
		iedriver.clickElement();
	}

	@Override
	public void getElement() {
		iedriver.findElement();
	}

}
