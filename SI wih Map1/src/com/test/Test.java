package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	 //he answer for a question that have answer as the key and username as the value
	    Question q=(Question)factory.getBean("q");  
	    q.displayInfo();  
	      
	}

}
