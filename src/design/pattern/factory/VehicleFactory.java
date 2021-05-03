package design.pattern.factory;

public class VehicleFactory {

	public static Vehicle getInstance(String type, int wheel) {
		if(type.equals("car")) {
			return new Car(wheel);
		}
		else if(type.equals("bike")) {
			return new Bike(wheel);
		}
		return null;
	}
}
