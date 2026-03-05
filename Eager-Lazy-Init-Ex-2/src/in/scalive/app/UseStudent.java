package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("/in/scalive/resources/beanconf.xml");
		System.out.println("Container started");
		Student s1=container.getBean(Student.class);
		System.out.println("Roll="+s1.getRoll());
		System.out.println("Name="+s1.getName());
		
		Student s2=container.getBean(Student.class);
		System.out.println("Roll="+s2.getRoll());
		System.out.println("Name="+s2.getName());
		
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
}
