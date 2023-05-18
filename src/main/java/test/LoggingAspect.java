package test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	final String publicMethod = "execution(public * test..*(..))";
	@Before(publicMethod)  
	public void before() {
		System.out.println("[LA] Before 메서드 실행 전 실행");
	}
	@AfterReturning(pointcut=publicMethod, returning="ret")
	public void afterReturning(Object ret) {
		System.out.println("[LA] AfterReturning 메서드 정상 종료 후 실행.리턴값="+ret);
	}
	@AfterThrowing(pointcut=publicMethod, throwing="ex")
	public void afterThrowing(Throwable ex) {
	  System.out.println
	     ("[LA] AfterThrowing 메서드 예외 종료 후 실행. 예외메세지="+ex.getMessage());
	}
	@After(publicMethod)
	public void afterFinally() {
		System.out.println("[LA] After 메서드 종료 후 실행");
	}
}