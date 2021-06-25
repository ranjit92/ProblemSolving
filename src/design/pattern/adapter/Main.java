package design.pattern.adapter;

public class Main {
	public static void main(String[] args) {
		ChromeDriver chrome = new ChromeDriver();
		chrome.selectElement();
		chrome.getElement();

		IEDriver ie = new IEDriver();
		ie.clickElement();
		ie.findElement();
		
		Adapter ad = new Adapter(ie);
		ad.selectElement();
		ad.getElement();
		
	}
}
