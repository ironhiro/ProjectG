package homeWork_3;

public class Graduate extends Student{
	protected String �����о�;
	
	
	public Graduate(String �й�,String ����,String �̸�, int �г�, String ����������, String �ּ�, double �������,String �����о�) {
		// TODO Auto-generated constructor stub
		super(�й�,�̸�, �г�, ����������, �ּ�,�������);
		this.�����о� = �����о�;
		this.���� = ����;
	}
	
	public Graduate(String �й�,String ����,String �̸�, int �г�, String ����������, String �ּ�, double �������) {
		// TODO Auto-generated constructor stub
		super(�й�,�̸�, �г�, ����������, �ּ�,�������);
		�����о� = "";
		this.���� = ����;
	}

	public void show() {
		// TODO Auto-generated method stub
		if(�����о�=="")
			System.out.println(�й� + ", " + ���� + ", " + �̸� +", " + �г� + ", " + ���������� + ", " + �ּ� + ", " +�������);
		else
			System.out.println(�й� + ", " + ���� + ", " + �̸� +", " + �г� + ", " + ���������� + ", " + �ּ� + ", " +������� +", "+ �����о�);
	}
	public String get�����о�()
	{
		return �����о�;
	}
	public String get����������()
	{
		return ����������;
	}
	
	

}
