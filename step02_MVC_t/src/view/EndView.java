package view;

import model.domain.Student;

public class EndView {
	// 모든 데이터 출력
	public static void printAllStudents(Student[] studentArray) {
//		for(int i = 0; i < studentArray.length; i++) {
//			System.out.println(studentArray[i]);
//		}

		for (Student student : studentArray) {
			if (student != null) {
				System.out.println(student.getName() + " " + student.getAge());
			}else {
				System.out.println(student);
			}
		}
	}

	// 한명 출력
	public static void printStudent(Student student) {
		if (student != null) {
			System.out.println(student.getName() + " " + student.getAge());
		}
	}

	public static void printMessage(String msg) {
		System.out.println(msg);
	}

}
