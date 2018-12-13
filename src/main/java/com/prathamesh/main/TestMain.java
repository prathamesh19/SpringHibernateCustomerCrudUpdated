package com.prathamesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prathamesh.entity.Customer;
import com.prathamesh.service.CustomerService;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1=new Customer(101,"abc");
		Customer c2=new Customer(102,"pqr");
		Customer c3=new Customer(103,"xyz");
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("springbean.xml");
		CustomerService cs=(CustomerService) ac.getBean("cService");
	//cs.addCustomer(c1);
	//cs.addCustomer(c2);
	//cs.addCustomer(c3);
//System.out.println(cs.getCustomer(101));
		System.out.println(cs.getAllCustomers());
	}

}
