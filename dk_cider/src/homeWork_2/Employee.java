package homeWork_2;

public class Employee implements IEmployee{
	private String 이름, 회사명, 부서, 직책;
	public Employee() throws MyException
	{
		throw new MyException(-400, "Null Object Error");
	}
	public Employee(String 이름, String 회사명, String 부서, String 직책)
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
		this.회사명 = 회사명;
		this.부서 = 부서;
		this.직책 = 직책;
	}
	public void show()
	{
		System.out.println("성명 : " + 이름 +", 회사명 : " + 회사명 + ", 부서 : " + 부서 + ", 직책 : " + 직책);
	}
	public void changePosition(String 직책) throws MyException
	{
		if(직책=="")
			throw new MyException(-300, "Position Name - Empty Error");
		else
			this.직책 = 직책;
	}
}
