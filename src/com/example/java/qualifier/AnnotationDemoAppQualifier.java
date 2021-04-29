package com.example.java.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAppQualifier {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext4.xml");
			
		Coach coach =context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}
}
