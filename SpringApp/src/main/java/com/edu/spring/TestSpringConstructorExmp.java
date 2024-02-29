package com.edu.spring;



import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;
public class TestSpringConstructorExmp {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("ContextFile.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		SpringConstructorExmp x = (SpringConstructorExmp) factory.getBean("e");
		x.add();
		SpringConstructorExmp2 y = (SpringConstructorExmp2) factory.getBean("f");
		y.subs();

	}

}

