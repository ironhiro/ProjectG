package homeWork_2;

public class Student {
	protected String �̸�, ����������, �ּ�;
	protected int �г�;
	public Student() throws MyException
	{
		throw new MyException(-400, "Null Object Error");
	}
	public Student(String �̸�, int �г�, String ����������, String �ּ�)
	{
		String �������̸�;
		if(�̸�.length() > 10)
		{
			System.out.println("Warning: �̸��� 10�ڸ� �ʰ��Ͽ����ϴ�. ������ 10�ڷ� �����˴ϴ�.");
			�������̸� = �̸�.substring(0, �̸�.length()-(�̸�.length()%10));
			this.�̸� = �������̸�;
		}
		else
			this.�̸� = �̸�;
		this.�г� = �г�;
		this.���������� = ����������;
		this.�ּ� = �ּ�;
	}
	
	public void changeAddress(String �ּ�)
	{
		this.�ּ� = �ּ�;
	}
	
	public void show()
	{
		System.out.println("���� : " + �̸� +", �г� : " + �г� + ", �������� : " + ���������� + ", �ּ� : " + �ּ�);
	}
}
