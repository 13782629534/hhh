package com.woniu.a_spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class deptTest {

	@Test
	public void test() {
		
		ApplicationContext as = new ClassPathXmlApplicationContext("com/woniu/a_spring/springBean.xml");
		Dept dept=(Dept) as.getBean("dept");
		System.out.println(dept);
	}

}
