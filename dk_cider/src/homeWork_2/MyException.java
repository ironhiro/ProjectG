package homeWork_2;

@SuppressWarnings("serial")
public class MyException extends Exception {
	int �����ڵ�;
	String ��������;
	
	public MyException(int �����ڵ�, String ��������)
	{
		this.�����ڵ� = �����ڵ�;
		this.�������� = ��������;
	}
	public int getCode() {
		// TODO Auto-generated method stub
		return �����ڵ�;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return ��������;
	}

}
