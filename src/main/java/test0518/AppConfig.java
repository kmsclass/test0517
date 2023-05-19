package test0518;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfig {
	@Bean
	public Contact contact1() {  
		Contact c = new Contact();
		c.setTel("02-1111-1111"); 
		c.setFax("02-1111-1112"); 
		return c; 
	}
	@Bean
	public Contact contact2() {  
		Contact c = new Contact();
		c.setTel("02-2222-2220"); 
		c.setFax("02-2222-2229"); 
		return c; 
	}
	@Bean
	public User user1() {
		User u = new User();
		u.setId("hongkd");
		u.setContact(contact1());
		return u;
	}
	@Bean
	public User user2() {
		User u = new User();
		u.setId("kimsg");
		u.setContact(contact2());
		return u;
	}
	
}
