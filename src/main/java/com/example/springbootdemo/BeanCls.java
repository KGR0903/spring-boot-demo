package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanCls {

	@Autowired
	ModelCls model;
	public void display()
	{
		
		System.out.println(" Inside Bean Cls");
		model.display();
	}
	
}
