package homeWork_3;

public class IndustryGraduate extends Graduate{
	private String ȸ��, �μ�, ��å;
	public IndustryGraduate(String �й�, String ����,String �̸�, int �г�, String ����������, String �ּ�, double �������, String �����о�, String ȸ��, String �μ�, String ��å) {
		// TODO Auto-generated constructor stub
		super(�й�, ����,�̸�,�г�,����������,�ּ�, �������, �����о�);
		this.ȸ�� = ȸ��;
		this.�μ� = �μ�;
		this.��å = ��å;
	}
	public IndustryGraduate(String �й�, String ����,String �̸�, int �г�, String ����������, String �ּ�, double �������,String ȸ��, String �μ�, String ��å) {
		// TODO Auto-generated constructor stub
		super(�й�,����,�̸�,�г�,����������,�ּ�,�������);
		�����о� = "";
		this.ȸ�� = ȸ��;
		this.�μ� = �μ�;
		this.��å = ��å;
	}
	public String getȸ��()
	{
		return ȸ��;
	}
	public String get�μ�()
	{
		return �μ�;
	}
	public String get��å()
	{
		return ��å;
	}
	public String get����������()
	{
		return ����������;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(�й� + ", " + ���� + ", " + �̸� +", " + �г� + ", " + ���������� + ", " + �ּ� + ", " + ������� + ", "+�����о� + ", " + ȸ�� + ", " + �μ� + ", " + ��å);
	}
	
	

}
