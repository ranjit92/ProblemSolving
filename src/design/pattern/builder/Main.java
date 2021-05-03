package design.pattern.builder;

public class Main {
	
	
	public static void main(String[] args) {
		User user = new User.UserBuilder("Ranjit","Sah")
				.age(28)
				.address("BTM")
				//.phone("7815011032")
				.build();
		System.out.println(user);
	}

	
}
