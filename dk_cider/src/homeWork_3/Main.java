package homeWork_3;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		CStudentManager manager = new CStudentManager();
		manager.loadStudentFile("student.csv");
		manager.printStudent();
		manager.insertStudent("20091003", "���п�", "������", 2, "���ؿ�", "���׽�", 4.1, "����ó��");
		manager.insertStudent("20091004", "���п�", "�̸�ȯ", 2, "�躴��", "�ȵ���", 4.05);
		manager.insertStudent("20100003", "�к�", "���뼮", 2, "�輱��", "�뱸��", 3.8);
		manager.insertStudent("20100019", "�к�", "Ƽ�Ĵ�", 2, "�躴��", "����Ư����", 4.35, "��Ʋ��");
		System.out.println("- Print Students ----------------------------------------------");
		manager.printStudent();
		System.out.println("- Sort By Advisor ---------------------------------------------");
		manager.sortByGPA();
		manager.printStudent();
		System.out.println("- Search By Advisor ------------------------------------------");
		manager.searchByAdvisor("���ؿ�");
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
