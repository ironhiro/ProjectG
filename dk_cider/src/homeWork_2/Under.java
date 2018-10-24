package homeWork_2;

public class Under extends Student{
	private String 동아리명, 과정;
	public Under() throws MyException
	{
		throw new MyException(-400, "Null Object Error");
	}
	public Under(String 이름, int 학년, String 지도교수명, String 주소, String 동아리명) {
		// TODO Auto-generated constructor stub
		super(이름,학년,지도교수명,주소);
		this.동아리명 = 동아리명;
		과정 = "학부";
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("과정: " + 과정  +", 성명 : " + 이름 +", 학년 : " + 학년 + ", 지도교수 : " + 지도교수명 + ", 주소 : " + 주소 + ", 동아리 : " + 동아리명);
	}

	public void changeCircle(String 동아리명) throws MyException {
		// TODO Auto-generated method stub
		if(동아리명=="")
			throw new MyException(-200,"Circle Name - Empty Error");
		else
			this.동아리명 = 동아리명;
	}

	public void changeAddress(String 주소) {
		// TODO Auto-generated method stub
		this.주소 = 주소;
	}

}
