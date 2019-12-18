package com.woniu.c_method1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/woniu/c_method1/methodFactory.xml");
		Dept dept = (Dept) ac.getBean("cd");
		
			System.out.println(dept);
		
	}

}
