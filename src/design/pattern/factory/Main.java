package design.pattern.factory;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle = VehicleFactory.getInstance("car", 4);
		vehicle.print();

	}

}
