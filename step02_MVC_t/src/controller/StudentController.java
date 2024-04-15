/* 컨트롤러 
 * StartView -> 요청한 처리 결과를 반환 -> EndView 전달
 * - 수행기능
 * 		1 - 모든 검색
 * 		2 - 개인 (1명) 검색 : 이름으로 검색
 * 		3 - 저장
 * 		4 - 삭제
 * 		5 - 수정
 * 
 */
package controller;

import model.StudentModel;
import model.domain.Student;
import view.EndView;

public class StudentController {
	public static void request(int reqNumber) {
		if(reqNumber == 1) {
			
			Student[] studentArray = StudentModel.getAllStudnets();
			EndView.printAllStudents(studentArray); 
			
		}else if(reqNumber == 2) {
			
			Student student = StudentModel.getStudent("Java");
			EndView.printStudent(student);
			
		}else if(reqNumber == 3) {
			
			Student react = new Student("React", 10);
			boolean result = StudentModel.registerStudent(react);
			if (result) {
				EndView.printMessage("학생 객체 저장 성공");
			}else {
				EndView.printMessage("학생 객체 저장 실패");
			}
			
		}else if(reqNumber == 4) {
			StudentModel.deleteStudnet("Python");
			
		}else if(reqNumber == 5) {
			EndView.printStudent(StudentModel.updateStudentName("Java", "Java2"));
		}
	}
}
