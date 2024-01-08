package ex1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Quiz {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		QuizMasterService q = context.getBean("quizService", QuizMasterService.class);
		System.out.println(q.askQuestion());
		
		context.close();
	}
}
