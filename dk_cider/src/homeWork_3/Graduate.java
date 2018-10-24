package homeWork_3;

public class Graduate extends Student{
	protected String 연구분야;
	
	
	public Graduate(String 학번,String 과정,String 이름, int 학년, String 지도교수명, String 주소, double 평점평균,String 연구분야) {
		// TODO Auto-generated constructor stub
		super(학번,이름, 학년, 지도교수명, 주소,평점평균);
		this.연구분야 = 연구분야;
		this.과정 = 과정;
	}
	
	public Graduate(String 학번,String 과정,String 이름, int 학년, String 지도교수명, String 주소, double 평점평균) {
		// TODO Auto-generated constructor stub
		super(학번,이름, 학년, 지도교수명, 주소,평점평균);
		연구분야 = "";
		this.과정 = 과정;
	}

	public void show() {
		// TODO Auto-generated method stub
		if(연구분야=="")
			System.out.println(학번 + ", " + 과정 + ", " + 이름 +", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " +평점평균);
		else
			System.out.println(학번 + ", " + 과정 + ", " + 이름 +", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " +평점평균 +", "+ 연구분야);
	}
	public String get연구분야()
	{
		return 연구분야;
	}
	public String get지도교수명()
	{
		return 지도교수명;
	}
	
	

}
