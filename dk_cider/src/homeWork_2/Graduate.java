package homeWork_2;

public class Graduate extends Student{
	protected String 연구분야;
	protected String 과정;
	public Graduate() throws MyException
	{
		throw new MyException(-400, "Null Object Error");
	}
	public Graduate(String 이름, int 학년, String 지도교수명, String 주소, String 연구분야) {
		// TODO Auto-generated constructor stub
		super(이름, 학년, 지도교수명, 주소);
		this.연구분야 = 연구분야;
		과정 = "대학원";
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("과정 : " + 과정 +", 성명 : " + 이름 +", 학년 : " + 학년 + ", 지도교수 : " + 지도교수명 + ", 주소 : " + 주소 + ", 연구분야 : " + 연구분야);
	}

	public void changeAddress(String 주소) {
		// TODO Auto-generated method stub
		this.주소 = 주소;
	}

	public void changeMajor(String 연구분야) throws MyException {
		// TODO Auto-generated method stub
		if(연구분야=="")
			throw new MyException(-100,"Major Name - Empty Error");
		else
			this.연구분야 = 연구분야;
	}

}
