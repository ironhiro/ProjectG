package homeWork_2;

public class Student {
	protected String 이름, 지도교수명, 주소;
	protected int 학년;
	public Student() throws MyException
	{
		throw new MyException(-400, "Null Object Error");
	}
	public Student(String 이름, int 학년, String 지도교수명, String 주소)
	{
		String 수정된이름;
		if(이름.length() > 10)
		{
			System.out.println("Warning: 이름이 10자를 초과하였습니다. 강제로 10자로 조정됩니다.");
			수정된이름 = 이름.substring(0, 이름.length()-(이름.length()%10));
			this.이름 = 수정된이름;
		}
		else
			this.이름 = 이름;
		this.학년 = 학년;
		this.지도교수명 = 지도교수명;
		this.주소 = 주소;
	}
	
	public void changeAddress(String 주소)
	{
		this.주소 = 주소;
	}
	
	public void show()
	{
		System.out.println("성명 : " + 이름 +", 학년 : " + 학년 + ", 지도교수 : " + 지도교수명 + ", 주소 : " + 주소);
	}
}
