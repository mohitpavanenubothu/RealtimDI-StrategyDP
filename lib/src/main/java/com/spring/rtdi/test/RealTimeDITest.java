package com.spring.rtdi.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.rtdi.controller.MainController;
import com.spring.rtdi.vo.EmployeeVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/rtdi/cfgs/applicationContext.xml");
		// get SpringBean class obj ref
		MainController controller = ctx.getBean("controller", MainController.class);
		// read inputs as stirng values and store them into EmployeeVO class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name::");
		String name = sc.next();
		System.out.println("Enter employee desg::");
		String desg = sc.next();
		System.out.println("Enter employee basicSalary::");
		String basicSalary = sc.next();
		
		EmployeeVO vo = new EmployeeVO();
		vo.setEname(name);
		vo.setDesg(desg);
		vo.setBasicSalary(basicSalary);
		// invoke methods
		try {
			String result = controller.processEmployee(vo);
			System.out.println(result);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Internal problem::" + e.getMessage());
		}
		ctx.close();

	}// main
}// class
