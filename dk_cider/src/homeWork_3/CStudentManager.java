package homeWork_3;

import java.util.*;
import java.io.*;

public class CStudentManager {
	private ArrayList<Student> s = new ArrayList<>(100);
	private int index = 0;

	public void insertStudent(String 학번, String 구분, String 이름, int 학년, String 지도교수, String 주소, double 평점평균, String 분야) {
		if(index==100)
			return;
		if (구분 == "대학원") {
			for (int i = 0; i < index; i++) {
				if (s.get(i).get학번() == 학번) {
					System.out.println("중복된 학번입니다.");
					break;
				} else {
					if (i == index - 1) {
						s.add(new Graduate(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균, 분야));
						
						index++;
						break;
					}

				}
			}
			if (index == 0) {
				s.add(new Graduate(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균, 분야));
				
				index++;
			}

		} else {
			for (int i = 0; i < index; i++) {
				if (s.get(i).get학번() == 학번) {
					System.out.println("중복된 학번입니다.");
					break;
				} else {
					if (i == index - 1) {
						s.add(new Under(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균, 분야));
						
						index++;
						break;
					}

				}
			}
			if (index == 0) {
				s.add(new Under(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균, 분야));
				
				index++;
			}

		}

	}

	public void insertStudent(String 학번, String 구분, String 이름, int 학년, String 지도교수, String 주소, double 평점평균) {
		if(index==100)
			return;
		if (구분 == "대학원") {
			for (int i = 0; i < index; i++) {
				if (s.get(i).get학번() == 학번) {
					System.out.println("중복된 학번입니다.");
					break;
				} else {
					if (i == index - 1) {
						s.add(new Graduate(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균));
						
						index++;
						break;
					}

				}
			}
			if (index == 0) {
				s.add(new Graduate(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균));
				
				index++;
			}

		} else {
			for (int i = 0; i < index; i++) {
				if (s.get(i).get학번() == 학번) {
					System.out.println("중복된 학번입니다.");
					break;
				} else {
					if (i == index - 1) {
						s.add(new Under(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균));
						
						index++;
						break;
					}

				}
			}
			if (index == 0) {
				s.add(new Under(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균));
				
				index++;
			}

		}

	}

	public void insertStudent(String 학번, String 구분, String 이름, int 학년, String 지도교수, String 주소, double 평점평균, String 분야,
			String 회사, String 부서, String 직위) {
		if(index==100)
			return;
		for (int i = 0; i < index; i++) {
			if (s.get(i).get학번() == 학번) {
				System.out.println("중복된 학번입니다.");
				break;
			} else {
				if (i == index - 1) {
					s.add(new IndustryGraduate(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균, 분야, 회사, 부서, 직위));
					
					index++;
					break;
				}
			}
		}
		if (index == 0) {
			s.add(new IndustryGraduate(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균, 분야, 회사, 부서, 직위));
			
			index++;
		}

	}

	public void insertStudent(String 학번, String 구분, String 이름, int 학년, String 지도교수, String 주소, double 평점평균, String 회사,
			String 부서, String 직위) {
		if(index==100)
			return;
		for (int i = 0; i < index; i++) {
			if (s.get(i).get학번() == 학번) {
				System.out.println("중복된 학번입니다.");
				break;
			} else {
				if (i == index - 1) {
					s.add(new IndustryGraduate(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균, 회사, 부서, 직위));
					
					index++;
					break;
				}
			}
		}
		if (index == 0) {
			s.add(new IndustryGraduate(학번, 구분, 이름, 학년, 지도교수, 주소, 평점평균, 회사, 부서, 직위));
			
			index++;
		}

	}

	public void deleteStudent(String 학번) {
		for (int i = 0; i < index; i++) {
			if (s.get(i).get학번().equals(학번)) {
				s.remove(i);
				System.out.println("제거 완료");
				index--;
				break;
			} else {
				if (i == index - 1)
					System.out.println("존재하지 않는 학번입니다.");
			}
		}

	}

	public void clearAll() {
		s.clear();
		index=0;
	}

	public void saveStudentFile(String 파일이름) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(파일이름));
		for(int i=0;i<index;i++)
		{
			if(s.get(i) instanceof Under)
			{
				String 학번 = s.get(i).get학번();
				String 과정 = s.get(i).get과정();
				String 지도교수명 = s.get(i).get지도교수명();
				String 주소 = s.get(i).get주소();
				String 이름 = s.get(i).get이름();
				String 동아리명 = s.get(i).get동아리명();
				int 학년 = s.get(i).get학년();
				double 평균평점 = s.get(i).get평점평균();
				if(동아리명=="")
					bw.write(학번 + ", " + 과정 + ", " + 이름 + ", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " + 평균평점);
				else
					bw.write(학번 + ", " + 과정 + ", " + 이름 + ", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " + 평균평점 + ", " +동아리명);
				bw.newLine();
				
			}
			else if(s.get(i) instanceof IndustryGraduate)
			{
				String 학번 = s.get(i).get학번();
				String 과정 = s.get(i).get과정();
				String 지도교수명 = s.get(i).get지도교수명();
				String 주소 = s.get(i).get주소();
				String 이름 = s.get(i).get이름();
				String 연구분야 = s.get(i).get연구분야();
				String 직장 = s.get(i).get회사();
				String 직위 = s.get(i).get직책();
				String 부서 = s.get(i).get부서();
				int 학년 = s.get(i).get학년();
				double 평균평점 = s.get(i).get평점평균();
				bw.write(학번 + ", " + 과정 + ", " + 이름 + ", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " + 평균평점 + ", " +연구분야 + ", " + 직장 + ", " + 부서 + ", " + 직위);
				bw.newLine();
			}
			else if(s.get(i) instanceof Graduate)
			{
				String 학번 = s.get(i).get학번();
				String 과정 = s.get(i).get과정();
				String 지도교수명 = s.get(i).get지도교수명();
				String 주소 = s.get(i).get주소();
				String 이름 = s.get(i).get이름();
				String 연구분야 = s.get(i).get연구분야();
				int 학년 = s.get(i).get학년();
				double 평균평점 = s.get(i).get평점평균();
				if(연구분야=="")
					bw.write(학번 + ", " + 과정 + ", " + 이름 + ", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " + 평균평점);
				else
					bw.write(학번 + ", " + 과정 + ", " + 이름 + ", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " + 평균평점 + ", " +연구분야);
				bw.newLine();
			}
			
			
			
		}
		bw.close();
	}

	public void loadStudentFile(String 파일이름) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(파일이름));
		System.out.println("파일로드");
		String data;
		while((data=br.readLine())!=null)
		{
			
			String[] result = data.split(", ");
			
			if(result[1].equals("학부"))
			{
				if(result.length==7)
				{
					String 학번 = result[0];
					String 과정 = result[1];
					String 이름 = result[2];
					int 학년 = Integer.parseInt(result[3]);
					String 지도교수명 = result[4];
					String 주소 = result[5];
					double 학점 = Double.parseDouble(result[6]);
					insertStudent(학번,과정,이름,학년,지도교수명,주소,학점);
				}
				else
				{
					String 학번 = result[0];
					String 과정 = result[1];
					String 이름 = result[2];
					int 학년 = Integer.parseInt(result[3]);
					String 지도교수명 = result[4];
					String 주소 = result[5];
					double 학점 = Double.parseDouble(result[6]);
					String 동아리명 = result[7];
					insertStudent(학번,과정,이름,학년,지도교수명,주소,학점,동아리명);
				}
			}
			else if(result[1].equals("대학원"))
			{
				if(result.length==7)
				{
					String 학번 = result[0];
					String 과정 = result[1];
					String 이름 = result[2];
					int 학년 = Integer.parseInt(result[3]);
					String 지도교수명 = result[4];
					String 주소 = result[5];
					double 학점 = Double.parseDouble(result[6]);
					insertStudent(학번,과정,이름,학년,지도교수명,주소,학점);
				}
				else
				{
					String 학번 = result[0];
					String 과정 = result[1];
					String 이름 = result[2];
					int 학년 = Integer.parseInt(result[3]);
					String 지도교수명 = result[4];
					String 주소 = result[5];
					double 학점 = Double.parseDouble(result[6]);
					String 연구분야 = result[7];
					insertStudent(학번,과정,이름,학년,지도교수명,주소,학점,연구분야);
				}
			}
			else if(result[1].equals("산업대학원"))
			{
				if(result[6]=="")
				{
					String 학번 = result[0];
					String 과정 = result[1];
					String 이름 = result[2];
					int 학년 = Integer.parseInt(result[3]);
					String 지도교수명 = result[4];
					String 주소 = result[5];
					double 학점 = Double.parseDouble(result[6]);
					String 직장 = result[8];
					String 부서 = result[9];
					String 직위 = result[10];
					insertStudent(학번,과정,이름,학년,지도교수명,주소,학점,직장,부서,직위);
				}
				else
				{
					String 학번 = result[0];
					String 과정 = result[1];
					String 이름 = result[2];
					int 학년 = Integer.parseInt(result[3]);
					String 지도교수명 = result[4];
					String 주소 = result[5];
					double 학점 = Double.parseDouble(result[6]);
					String 연구분야 = result[7];
					String 직장 = result[8];
					String 부서 = result[9];
					String 직위 = result[10];
					insertStudent(학번,과정,이름,학년,지도교수명,주소,학점,연구분야,직장,부서,직위);
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

	public void searchByAdvisor(String 이름) {
		for (int i = 0; i < index; i++) {
			if (s.get(i).get지도교수명().equals(이름)) {
				s.get(i).show();	
			}
		}
	}

}
