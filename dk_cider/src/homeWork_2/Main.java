package homeWork_2;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Under underObj = new Under("���ڱ�콺 �θ�����Ƽ", 2, "������", "�湫��", "����");

			underObj.show();
			underObj.changeAddress("�����");
			underObj.changeCircle("�׷�"); 
			// underObj.changeCircle("");��
			// �ٲپ�������Ŀ��ܹ߻�Ȯ�ο�
			underObj.show();
			
			Graduate graduateObj = new Graduate("����", 1, "���³�", "Ȳ�ص�", "AI");
			graduateObj.show();
			graduateObj.changeAddress("�����");
			graduateObj.changeMajor("PL"); //  graduateObj.changeMajor("");�� 
						// �ٲپ�������Ŀ��ܹ߻�Ȯ�ο�
			graduateObj.show();


			IndustryGraduate industryGraduateObj = new IndustryGraduate("ȫ�浿", 1, "���ο�", "���̽�", "AI", "�Ｚ", "�ű��", "å��");
				  
			industryGraduateObj.show();
			industryGraduateObj.changeAddress("�����");
			industryGraduateObj.changeMajor("PL");
			industryGraduateObj.changePosition("�̻�");
					//industryGraduateObj.changePosition("");��
					//�ٲپ�������Ŀ��ܹ߻�Ȯ�ο�
			industryGraduateObj.show();
			
			
			

		} catch (MyException e) {
			System.out.println("������ȣ: " + e.getCode());
			System.out.println("��������: " + e.getDescription());
		}
	}

}
