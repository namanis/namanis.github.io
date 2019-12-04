package com.alpi.desacoplar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VeiculoApp {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");
		 VeiculoService contestService = (VeiculoService)context.getBean("veiculoService");
		 contestService.dirigir();
		 }
		
		 }

