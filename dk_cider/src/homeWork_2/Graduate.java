package homeWork_2;

public class Graduate extends Student{
	protected String �����о�;
	protected String ����;
	public Graduate() throws MyException
	{
		throw new MyException(-400, "Null Object Error");
	}
	public Graduate(String �̸�, int �г�, String ����������, String �ּ�, String �����о�) {
		// TODO Auto-generated constructor stub
		super(�̸�, �г�, ����������, �ּ�);
		this.�����о� = �����о�;
		���� = "���п�";
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("���� : " + ���� +", ���� : " + �̸� +", �г� : " + �г� + ", �������� : " + ���������� + ", �ּ� : " + �ּ� + ", �����о� : " + �����о�);
	}

	public void changeAddress(String �ּ�) {
		// TODO Auto-generated method stub
		this.�ּ� = �ּ�;
	}

	public void changeMajor(String �����о�) throws MyException {
		// TODO Auto-generated method stub
		if(�����о�=="")
			throw new MyException(-100,"Major Name - Empty Error");
		else
			this.�����о� = �����о�;
	}

}
