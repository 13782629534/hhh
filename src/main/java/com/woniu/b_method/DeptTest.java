package com.woniu.b_method;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class DeptTest {

	@Test
	public void test() {
		/*
		 * ApplicationContext a1 = new
		 * ClassPathXmlApplicationContext("com/woniu/b_method/staticFactory.xml"); Dept
		 * dept = (Dept) a1.getBean("d1"); System.out.println(dept);
		 */
//		ApplicationContext a1 = new ClassPathXmlApplicationContext("com/woniu/b_method/staticFactory.xml");
//		Dept dept = (Dept) a1.getBean("d3");
//		System.out.println(dept);
		
		BeanFactory a1 = new XmlBeanFactory(new ClassPathResource("com/woniu/b_method/staticFactory.xml"));
		Dept dept = (Dept) a1.getBean("d3");
		
		System.out.println(dept);
	}

}
