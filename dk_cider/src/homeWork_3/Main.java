package homeWork_3;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		CStudentManager manager = new CStudentManager();
		manager.loadStudentFile("student.csv");
		manager.printStudent();
		manager.insertStudent("20091003", "대학원", "조현우", 2, "이해연", "포항시", 4.1, "영상처리");
		manager.insertStudent("20091004", "대학원", "이명환", 2, "김병만", "안동시", 4.05);
		manager.insertStudent("20100003", "학부", "오대석", 2, "김선명", "대구시", 3.8);
		manager.insertStudent("20100019", "학부", "티파니", 2, "김병만", "서울특별시", 4.35, "셈틀꾼");
		System.out.println("- Print Students ----------------------------------------------");
		manager.printStudent();
		System.out.println("- Sort By Advisor ---------------------------------------------");
		manager.sortByGPA();
		manager.printStudent();
		System.out.println("- Search By Advisor ------------------------------------------");
		manager.searchByAdvisor("이해연");
		manager.deleteStudent("20100002");
		manager.deleteStudent("20100019");
		manager.printStudent();
		manager.saveStudentFile("student_modify1.csv");
		manager.clearAll();
		System.out.println("---------------------------------------------------------");
		manager.loadStudentFile("student_modify1.csv");
		manager.printStudent();
		
	}

}
