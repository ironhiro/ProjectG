package homeWork_3;

import java.util.*;
import java.io.*;

public class CStudentManager {
	private ArrayList<Student> s = new ArrayList<>(100);
	private int index = 0;

	public void insertStudent(String �й�, String ����, String �̸�, int �г�, String ��������, String �ּ�, double �������, String �о�) {
		if(index==100)
			return;
		if (���� == "���п�") {
			for (int i = 0; i < index; i++) {
				if (s.get(i).get�й�() == �й�) {
					System.out.println("�ߺ��� �й��Դϴ�.");
					break;
				} else {
					if (i == index - 1) {
						s.add(new Graduate(�й�, ����, �̸�, �г�, ��������, �ּ�, �������, �о�));
						
						index++;
						break;
					}

				}
			}
			if (index == 0) {
				s.add(new Graduate(�й�, ����, �̸�, �г�, ��������, �ּ�, �������, �о�));
				
				index++;
			}

		} else {
			for (int i = 0; i < index; i++) {
				if (s.get(i).get�й�() == �й�) {
					System.out.println("�ߺ��� �й��Դϴ�.");
					break;
				} else {
					if (i == index - 1) {
						s.add(new Under(�й�, ����, �̸�, �г�, ��������, �ּ�, �������, �о�));
						
						index++;
						break;
					}

				}
			}
			if (index == 0) {
				s.add(new Under(�й�, ����, �̸�, �г�, ��������, �ּ�, �������, �о�));
				
				index++;
			}

		}

	}

	public void insertStudent(String �й�, String ����, String �̸�, int �г�, String ��������, String �ּ�, double �������) {
		if(index==100)
			return;
		if (���� == "���п�") {
			for (int i = 0; i < index; i++) {
				if (s.get(i).get�й�() == �й�) {
					System.out.println("�ߺ��� �й��Դϴ�.");
					break;
				} else {
					if (i == index - 1) {
						s.add(new Graduate(�й�, ����, �̸�, �г�, ��������, �ּ�, �������));
						
						index++;
						break;
					}

				}
			}
			if (index == 0) {
				s.add(new Graduate(�й�, ����, �̸�, �г�, ��������, �ּ�, �������));
				
				index++;
			}

		} else {
			for (int i = 0; i < index; i++) {
				if (s.get(i).get�й�() == �й�) {
					System.out.println("�ߺ��� �й��Դϴ�.");
					break;
				} else {
					if (i == index - 1) {
						s.add(new Under(�й�, ����, �̸�, �г�, ��������, �ּ�, �������));
						
						index++;
						break;
					}

				}
			}
			if (index == 0) {
				s.add(new Under(�й�, ����, �̸�, �г�, ��������, �ּ�, �������));
				
				index++;
			}

		}

	}

	public void insertStudent(String �й�, String ����, String �̸�, int �г�, String ��������, String �ּ�, double �������, String �о�,
			String ȸ��, String �μ�, String ����) {
		if(index==100)
			return;
		for (int i = 0; i < index; i++) {
			if (s.get(i).get�й�() == �й�) {
				System.out.println("�ߺ��� �й��Դϴ�.");
				break;
			} else {
				if (i == index - 1) {
					s.add(new IndustryGraduate(�й�, ����, �̸�, �г�, ��������, �ּ�, �������, �о�, ȸ��, �μ�, ����));
					
					index++;
					break;
				}
			}
		}
		if (index == 0) {
			s.add(new IndustryGraduate(�й�, ����, �̸�, �г�, ��������, �ּ�, �������, �о�, ȸ��, �μ�, ����));
			
			index++;
		}

	}

	public void insertStudent(String �й�, String ����, String �̸�, int �г�, String ��������, String �ּ�, double �������, String ȸ��,
			String �μ�, String ����) {
		if(index==100)
			return;
		for (int i = 0; i < index; i++) {
			if (s.get(i).get�й�() == �й�) {
				System.out.println("�ߺ��� �й��Դϴ�.");
				break;
			} else {
				if (i == index - 1) {
					s.add(new IndustryGraduate(�й�, ����, �̸�, �г�, ��������, �ּ�, �������, ȸ��, �μ�, ����));
					
					index++;
					break;
				}
			}
		}
		if (index == 0) {
			s.add(new IndustryGraduate(�й�, ����, �̸�, �г�, ��������, �ּ�, �������, ȸ��, �μ�, ����));
			
			index++;
		}

	}

	public void deleteStudent(String �й�) {
		for (int i = 0; i < index; i++) {
			if (s.get(i).get�й�().equals(�й�)) {
				s.remove(i);
				System.out.println("���� �Ϸ�");
				index--;
				break;
			} else {
				if (i == index - 1)
					System.out.println("�������� �ʴ� �й��Դϴ�.");
			}
		}

	}

	public void clearAll() {
		s.clear();
		index=0;
	}

	public void saveStudentFile(String �����̸�) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(�����̸�));
		for(int i=0;i<index;i++)
		{
			if(s.get(i) instanceof Under)
			{
				String �й� = s.get(i).get�й�();
				String ���� = s.get(i).get����();
				String ���������� = s.get(i).get����������();
				String �ּ� = s.get(i).get�ּ�();
				String �̸� = s.get(i).get�̸�();
				String ���Ƹ��� = s.get(i).get���Ƹ���();
				int �г� = s.get(i).get�г�();
				double ������� = s.get(i).get�������();
				if(���Ƹ���=="")
					bw.write(�й� + ", " + ���� + ", " + �̸� + ", " + �г� + ", " + ���������� + ", " + �ּ� + ", " + �������);
				else
					bw.write(�й� + ", " + ���� + ", " + �̸� + ", " + �г� + ", " + ���������� + ", " + �ּ� + ", " + ������� + ", " +���Ƹ���);
				bw.newLine();
				
			}
			else if(s.get(i) instanceof IndustryGraduate)
			{
				String �й� = s.get(i).get�й�();
				String ���� = s.get(i).get����();
				String ���������� = s.get(i).get����������();
				String �ּ� = s.get(i).get�ּ�();
				String �̸� = s.get(i).get�̸�();
				String �����о� = s.get(i).get�����о�();
				String ���� = s.get(i).getȸ��();
				String ���� = s.get(i).get��å();
				String �μ� = s.get(i).get�μ�();
				int �г� = s.get(i).get�г�();
				double ������� = s.get(i).get�������();
				bw.write(�й� + ", " + ���� + ", " + �̸� + ", " + �г� + ", " + ���������� + ", " + �ּ� + ", " + ������� + ", " +�����о� + ", " + ���� + ", " + �μ� + ", " + ����);
				bw.newLine();
			}
			else if(s.get(i) instanceof Graduate)
			{
				String �й� = s.get(i).get�й�();
				String ���� = s.get(i).get����();
				String ���������� = s.get(i).get����������();
				String �ּ� = s.get(i).get�ּ�();
				String �̸� = s.get(i).get�̸�();
				String �����о� = s.get(i).get�����о�();
				int �г� = s.get(i).get�г�();
				double ������� = s.get(i).get�������();
				if(�����о�=="")
					bw.write(�й� + ", " + ���� + ", " + �̸� + ", " + �г� + ", " + ���������� + ", " + �ּ� + ", " + �������);
				else
					bw.write(�й� + ", " + ���� + ", " + �̸� + ", " + �г� + ", " + ���������� + ", " + �ּ� + ", " + ������� + ", " +�����о�);
				bw.newLine();
			}
			
			
			
		}
		bw.close();
	}

	public void loadStudentFile(String �����̸�) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(�����̸�));
		System.out.println("���Ϸε�");
		String data;
		while((data=br.readLine())!=null)
		{
			
			String[] result = data.split(", ");
			
			if(result[1].equals("�к�"))
			{
				if(result.length==7)
				{
					String �й� = result[0];
					String ���� = result[1];
					String �̸� = result[2];
					int �г� = Integer.parseInt(result[3]);
					String ���������� = result[4];
					String �ּ� = result[5];
					double ���� = Double.parseDouble(result[6]);
					insertStudent(�й�,����,�̸�,�г�,����������,�ּ�,����);
				}
				else
				{
					String �й� = result[0];
					String ���� = result[1];
					String �̸� = result[2];
					int �г� = Integer.parseInt(result[3]);
					String ���������� = result[4];
					String �ּ� = result[5];
					double ���� = Double.parseDouble(result[6]);
					String ���Ƹ��� = result[7];
					insertStudent(�й�,����,�̸�,�г�,����������,�ּ�,����,���Ƹ���);
				}
			}
			else if(result[1].equals("���п�"))
			{
				if(result.length==7)
				{
					String �й� = result[0];
					String ���� = result[1];
					String �̸� = result[2];
					int �г� = Integer.parseInt(result[3]);
					String ���������� = result[4];
					String �ּ� = result[5];
					double ���� = Double.parseDouble(result[6]);
					insertStudent(�й�,����,�̸�,�г�,����������,�ּ�,����);
				}
				else
				{
					String �й� = result[0];
					String ���� = result[1];
					String �̸� = result[2];
					int �г� = Integer.parseInt(result[3]);
					String ���������� = result[4];
					String �ּ� = result[5];
					double ���� = Double.parseDouble(result[6]);
					String �����о� = result[7];
					insertStudent(�й�,����,�̸�,�г�,����������,�ּ�,����,�����о�);
				}
			}
			else if(result[1].equals("������п�"))
			{
				if(result[6]=="")
				{
					String �й� = result[0];
					String ���� = result[1];
					String �̸� = result[2];
					int �г� = Integer.parseInt(result[3]);
					String ���������� = result[4];
					String �ּ� = result[5];
					double ���� = Double.parseDouble(result[6]);
					String ���� = result[8];
					String �μ� = result[9];
					String ���� = result[10];
					insertStudent(�й�,����,�̸�,�г�,����������,�ּ�,����,����,�μ�,����);
				}
				else
				{
					String �й� = result[0];
					String ���� = result[1];
					String �̸� = result[2];
					int �г� = Integer.parseInt(result[3]);
					String ���������� = result[4];
					String �ּ� = result[5];
					double ���� = Double.parseDouble(result[6]);
					String �����о� = result[7];
					String ���� = result[8];
					String �μ� = result[9];
					String ���� = result[10];
					insertStudent(�й�,����,�̸�,�г�,����������,�ּ�,����,�����о�,����,�μ�,����);
				}
			}
		}
		br.close();
	}

	public void printStudent() {
		for (int i = 0; i < index; i++) {
			s.get(i).show();
		}
	}

	@SuppressWarnings("unchecked")
	public void sortByGPA() {
		Collections.sort(s);
	}

	public void searchByAdvisor(String �̸�) {
		for (int i = 0; i < index; i++) {
			if (s.get(i).get����������().equals(�̸�)) {
				s.get(i).show();	
			}
		}
	}

}
