package test0518;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main1 {
	public static void main(String[] args) {
		/*
		 * ctx : user1(contact1),user2(contact2), contact1,contact2
		 */
		AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class); 
		User user1 = ctx.getBean("user1", User.class);
		System.out.println(user1.getId()); //hongkd
		System.out.println(user1.getContact().getTel()); //02-1111-1111
		System.out.println(user1.getContact().getFax()); //02-1111-1112
		
		User user2 = ctx.getBean("user2", User.class);
		System.out.println(user2.getId());
		System.out.println(user2.getContact().getTel());
		System.out.println(user2.getContact().getFax());		
	}
}
//1. AppConfig에서 객체 생성
//2. 어노테이션을 이용한 방식 객체 생성
