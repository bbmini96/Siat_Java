package model;

import model.domain.Student;

public class StudentModel {

	// DB
	private static Student[] studentArray = new Student[5];
	private static int index;

	static {
		studentArray[0] = new Student("Java", 28);
		studentArray[1] = new Student("Python", 32);
		studentArray[2] = new Student("C++", 40);
		index = 3;
	}

	// 모든 학생 검색
	public static Student[] getAllStudnets() {
		return studentArray;
	}

	// 한 학생의 정보만 검색(이름)
	public static Student getStudent(String name) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && name == studentArray[i].getName()) {
				return studentArray[i];
			}
		}
		return null;
	}

	// 저장 메소드
	/* Student 객체를 배열에 저장 */
	public static boolean registerStudent(Student student) {

		for(int i = 0 ; i < studentArray.length; i++) {
			if (student != null && studentArray[i] == null) {
				studentArray[i] = student;
				return true;
			}
		}

//		if (student != null && index < studentArray.length) {
//			studentArray[index++] = student;
//			return true;
//		}

		return false;
	}

	// 삭제 메소드
	/* Student 객체를 배열에서 삭제 */
	public static boolean deleteStudnet(String name) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && name == studentArray[i].getName()) {
				studentArray[i] = null;
				return true;
			}
		}
		return false;
	}

	// 수정 메소드
	/* 이름으로 검색 -> 학생의 이름이 있다면 원하는 이름으로 수정 */
	public static Student updateStudentName(String name, String newName) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && name == studentArray[i].getName()) {
				studentArray[i].setName(newName);
				return studentArray[i];
			}
		}
		return null;
	}
}
