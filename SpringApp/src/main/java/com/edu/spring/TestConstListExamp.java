package com.edu.spring;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;


public class TestConstListExamp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Resource r = new ClassPathResource("applicationContext.xml");
			BeanFactory factory = new XmlBeanFactory(r);
			ConstListExamp s = (ConstListExamp) factory.getBean("ls");
			s.display();
		}

	}

