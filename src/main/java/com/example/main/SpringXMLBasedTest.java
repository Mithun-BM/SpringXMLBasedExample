package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.classes.Employee;
import com.example.classes.Manager;

public class SpringXMLBasedTest {



	public static void main(String[] args) throws Exception {

		//XML based configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		//employee scope - singleton demo
		System.out.println("---------------employee bean--------------\n");
		Employee eobj1 = (Employee) context.getBean("employee");
		eobj1.setFirstName("eobj1firstName");
		System.out.println(eobj1.getFirstName());

		System.out.println("---------------employee bean--------------\n");
		Employee eobj2 = (Employee) context.getBean("employee");
		eobj2.setFirstName("eobj2firstName");
		System.out.println(eobj2.getFirstName());

		System.out.println("\n");
		System.out.println("Previous eobj1:  "+eobj1.getFirstName());

		System.out.println("\n");

		//employee1 scope - prototype demo
		System.out.println("---------------employee1 bean--------------\n");
		Employee eobj3 = (Employee) context.getBean("employee1");
		eobj3.setFirstName("eobj3firstName");
		System.out.println(eobj3.getFirstName());

		System.out.println("---------------employee1 bean--------------\n");
		Employee eobj4 = (Employee) context.getBean("employee1");
		eobj4.setFirstName("eobj4firstName");
		System.out.println(eobj4.getFirstName());

		System.out.println("\n");
		System.out.println("Previous eobj3:  "+eobj3.getFirstName());

		//manager scope - singleton demo
		System.out.println("----------------manager bean-------------\n");
		Manager mobj1 = (Manager) context.getBean("manager");
		mobj1.setMfirstName("mobj1firstName");
		//mobj1.setEmp(eobj1);
		System.out.println(mobj1.getMfirstName());
		System.out.println(mobj1.getEmp().getFirstName());

		System.out.println("----------------manager bean-------------\n");
		Manager mobj2 = (Manager) context.getBean("manager");
		mobj2.setMfirstName("mobj2firstName");
		//mobj2.setEmp(eobj2);
		System.out.println(mobj2.getMfirstName());
		System.out.println(mobj2.getEmp().getFirstName());
		System.out.println("\n");
		System.out.println("Previous mobj1 manager name:  "+mobj1.getMfirstName());
		System.out.println("Previous mobj1 emp name:  "+mobj1.getEmp().getFirstName());

		//manager scope - prototype demo 
		System.out.println("----------------manager1 bean-------------\n");
		Manager mobj3 = (Manager) context.getBean("manager1");
		mobj3.setMfirstName("mobj1firstName");
		//mobj1.setEmp(eobj1);
		System.out.println(mobj3.getMfirstName());
		System.out.println(mobj3.getEmp().getFirstName());

		System.out.println("----------------manager1 bean-------------\n");
		Manager mobj4 = (Manager) context.getBean("manager1");
		mobj4.setMfirstName("mobj2firstName");
		//mobj2.setEmp(eobj2);
		System.out.println(mobj4.getMfirstName());
		System.out.println(mobj4.getEmp().getFirstName());
		System.out.println("\n");
		System.out.println("Previous mobj3 manager name:  "+mobj3.getMfirstName());
		System.out.println("Previous mobj3 emp name:  "+mobj3.getEmp().getFirstName());

	}

}
