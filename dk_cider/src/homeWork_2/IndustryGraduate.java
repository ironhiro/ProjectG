package homeWork_2;

public class IndustryGraduate extends Graduate implements IEmployee{
	private String ȸ��, �μ�, ��å;
	public IndustryGraduate(String �̸�, int �г�, String ����������, String �ּ�, String �����о�, String ȸ��, String �μ�, String ��å) {
		// TODO Auto-generated constructor stub
		super(�̸�,�г�,����������,�ּ�, �����о�);
		this.ȸ�� = ȸ��;
		this.�μ� = �μ�;
		this.��å = ��å;
	}

	public IndustryGraduate() throws MyException{
		// TODO Auto-generated constructor stub
		throw new MyException(-400, "Null Object Error");
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("����: " + ���� + ", ���� : " + �̸� +", �г� : " + �г� + ", �������� : " + ���������� + ", �ּ� : " + �ּ� + ", �����о�: " + �����о� + ", ȸ��: " + ȸ�� + ", �μ�: " + �μ� + ", ��å: " + ��å);
	}

	public void changeAddress(String �ּ�) {
		// TODO Auto-generated method stub
		this.�ּ� = �ּ�;
	}

	public void changeMajor(String �����о�) {
		// TODO Auto-generated method stub
		this.�����о� = �����о�;
	}

	public void changePosition(String ��å) throws MyException{
		// TODO Auto-generated method stub
		if(��å=="")
			throw new MyException(-300, "Position Name - Empty Error");
		this.��å = ��å;
	}

}
