package homeWork_3;

public abstract class Student implements Comparable{
	protected String �̸�, ����������, �ּ�,�й�,����;
	protected int �г�;
	protected double �������;
	public Student(String �й�, String �̸�, int �г�, String ����������, String �ּ�, double �������)
	{
		this.�й� = �й�;
		this.�̸� = �̸�;
		this.�г� = �г�;
		this.���������� = ����������;
		this.�ּ� = �ּ�;
		this.������� = �������;
	}
	
	public String get�й�()
	{
		return �й�;
	}
	public String get����������()
	{
		return ����������;
	}
	public double get�������()
	{
		return �������;
	}
	public String get�ּ�()
	{
		return �ּ�;
	}
	public String get����()
	{
		return ����;
	}
	public int get�г�()
	{
		return �г�;
	}
	abstract public void show();
	public String get�����о�()
	{
		throw new UnsupportedOperationException();
	}
	public String get���Ƹ���()
	{
		throw new UnsupportedOperationException();
	}
	public String getȸ��()
	{
		throw new UnsupportedOperationException();
	}
	public String get�μ�()
	{
		throw new UnsupportedOperationException();
	}
	public String get��å()
	{
		throw new UnsupportedOperationException();
	}
	public String get�̸�()
	{
		return �̸�;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.������� < ((Student)o).get�������())
			return 1;
		else if(this.������� > ((Student)o).get�������())
			return -1;
		return 0;
	}
}
