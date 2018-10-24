package homeWork_2;

public class IndustryGraduate extends Graduate implements IEmployee{
	private String 회사, 부서, 직책;
	public IndustryGraduate(String 이름, int 학년, String 지도교수명, String 주소, String 연구분야, String 회사, String 부서, String 직책) {
		// TODO Auto-generated constructor stub
		super(이름,학년,지도교수명,주소, 연구분야);
		this.회사 = 회사;
		this.부서 = 부서;
		this.직책 = 직책;
	}

	public IndustryGraduate() throws MyException{
		// TODO Auto-generated constructor stub
		throw new MyException(-400, "Null Object Error");
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("과정: " + 과정 + ", 성명 : " + 이름 +", 학년 : " + 학년 + ", 지도교수 : " + 지도교수명 + ", 주소 : " + 주소 + ", 연구분야: " + 연구분야 + ", 회사: " + 회사 + ", 부서: " + 부서 + ", 직책: " + 직책);
	}

	public void changeAddress(String 주소) {
		// TODO Auto-generated method stub
		this.주소 = 주소;
	}

	public void changeMajor(String 연구분야) {
		// TODO Auto-generated method stub
		this.연구분야 = 연구분야;
	}

	public void changePosition(String 직책) throws MyException{
		// TODO Auto-generated method stub
		if(직책=="")
			throw new MyException(-300, "Position Name - Empty Error");
		this.직책 = 직책;
	}

}
