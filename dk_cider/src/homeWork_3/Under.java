package homeWork_3;

public class Under extends Student{
	private String ���Ƹ���;
	
	public Under(String �й�, String ����, String �̸�, int �г�, String ����������, String �ּ�, double �������) {
		// TODO Auto-generated constructor stub
		super(�й�,�̸�,�г�,����������,�ּ�,�������);
		���Ƹ��� = "";
		this.���� = ����;
	}
	
	public Under(String �й�, String ����,String �̸�, int �г�, String ����������, String �ּ�, double �������, String ���Ƹ���) {
		// TODO Auto-generated constructor stub
		super(�й�, �̸�,�г�,����������,�ּ�,�������);
		this.���Ƹ��� = ���Ƹ���;
		this.���� = ����;
	}
	public String get���Ƹ���()
	{
		return ���Ƹ���;
	}
	public String get����������()
	{
		return ����������;
	}

	public void show() {
		// TODO Auto-generated method stub
		if(���Ƹ���=="")
			System.out.println(�й� + ", " + ���� + ", " + �̸� +", " + �г� + ", " + ���������� + ", " + �ּ� + ", " +�������);
		else
			System.out.println(�й� + ", " + ���� + ", " + �̸� +", " + �г� + ", " + ���������� + ", " + �ּ� + ", " +������� +", "+ ���Ƹ���);
	}

	public void changeCircle(String ���Ƹ���){
		// TODO Auto-generated method stub
		
			this.���Ƹ��� = ���Ƹ���;
	}

	
	public void changeAddress(String �ּ�) {
		// TODO Auto-generated method stub
		this.�ּ� = �ּ�;
	}

}
