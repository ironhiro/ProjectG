package homeWork_2;

public class Under extends Student{
	private String ���Ƹ���, ����;
	public Under() throws MyException
	{
		throw new MyException(-400, "Null Object Error");
	}
	public Under(String �̸�, int �г�, String ����������, String �ּ�, String ���Ƹ���) {
		// TODO Auto-generated constructor stub
		super(�̸�,�г�,����������,�ּ�);
		this.���Ƹ��� = ���Ƹ���;
		���� = "�к�";
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("����: " + ����  +", ���� : " + �̸� +", �г� : " + �г� + ", �������� : " + ���������� + ", �ּ� : " + �ּ� + ", ���Ƹ� : " + ���Ƹ���);
	}

	public void changeCircle(String ���Ƹ���) throws MyException {
		// TODO Auto-generated method stub
		if(���Ƹ���=="")
			throw new MyException(-200,"Circle Name - Empty Error");
		else
			this.���Ƹ��� = ���Ƹ���;
	}

	public void changeAddress(String �ּ�) {
		// TODO Auto-generated method stub
		this.�ּ� = �ּ�;
	}

}
