package problems.common;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {
	
	public static void main(String[] args) {
		Map<User, String> map = new HashMap<>();
		
		User u1 = new User(1, "Bob");
		User u2 = new User(1, "Bob");
		map.put(u1, "CSE");
		map.put(u2, "EE");
		System.out.println(map);
	}
	
	
}


class User{
	
	int id;
	String name;
	
	public User(final int id, final String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		
		User user = (User)obj; 
		return (this.name.equals(user.name)) && (this.id == user.id);
	}
	
	
	@Override
	public int hashCode() {
		 return this.id;
	}
}
