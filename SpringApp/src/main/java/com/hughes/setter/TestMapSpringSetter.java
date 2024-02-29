package com.hughes.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class TestMapSpringSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("GetterSetterFile.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		MapSpringSetter s = (MapSpringSetter) factory.getBean("id2");
		System.out.println(s.getMp());
	}

}
