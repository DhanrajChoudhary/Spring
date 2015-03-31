package Learning.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DrawingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Triangle triangle=new Triangle();
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml"); 
		Triangle triangle=(Triangle)context.getBean("triangle");
		System.out.println(triangle.getType());
		System.out.println(triangle.getId());
		triangle.draw();
	}

}
