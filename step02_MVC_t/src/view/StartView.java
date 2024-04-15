package view; 

import controller.StudentController;

public class StartView {
	public static void main(String[] args) {
//		System.out.println("--- Search All Students ---");
//		StudentController.request(1);
//		System.out.println("--- Search One Student ---");
//		StudentController.request(2);
//		System.out.println("--- Register Studnet ---");
//		StudentController.request(3);
//		StudentController.request(1);
		System.out.println("--- Delete Student ---");
		StudentController.request(4);
//		StudentController.request(2);
		StudentController.request(3);
		StudentController.request(1);
		System.out.println("--- Edit Student Infomation ---");
		StudentController.request(5);
		
	}
}
