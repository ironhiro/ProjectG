package homeWork_2;

public class Employee implements IEmployee{
	private String �̸�, ȸ���, �μ�, ��å;
	public Employee() throws MyException
	{
		throw new MyException(-400, "Null Object Error");
	}
	public Employee(String �̸�, String ȸ���, String �μ�, String ��å)
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
		this.ȸ��� = ȸ���;
		this.�μ� = �μ�;
		this.��å = ��å;
	}
	public void show()
	{
		System.out.println("���� : " + �̸� +", ȸ��� : " + ȸ��� + ", �μ� : " + �μ� + ", ��å : " + ��å);
	}
	public void changePosition(String ��å) throws MyException
	{
		if(��å=="")
			throw new MyException(-300, "Position Name - Empty Error");
		else
			this.��å = ��å;
	}
}
