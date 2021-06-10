package inflearnSpring1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * classpath:applicationContext.xml 접근
		 */
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		/*
		 * id가 tWalk인 Bean을 접근 , 두번쨰 인자는 타입
		 */
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		
		/*
		 * transportationWalk move 메소드를 실행
		 */
		transportationWalk.move();
		
		
		/*
		 * 리소스 최소화를 위하여 닫음
		 */
		ctx.close();
		
	}

}
