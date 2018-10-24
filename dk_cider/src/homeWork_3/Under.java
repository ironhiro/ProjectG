package homeWork_3;

public class Under extends Student{
	private String 동아리명;
	
	public Under(String 학번, String 과정, String 이름, int 학년, String 지도교수명, String 주소, double 평점평균) {
		// TODO Auto-generated constructor stub
		super(학번,이름,학년,지도교수명,주소,평점평균);
		동아리명 = "";
		this.과정 = 과정;
	}
	
	public Under(String 학번, String 과정,String 이름, int 학년, String 지도교수명, String 주소, double 평점평균, String 동아리명) {
		// TODO Auto-generated constructor stub
		super(학번, 이름,학년,지도교수명,주소,평점평균);
		this.동아리명 = 동아리명;
		this.과정 = 과정;
	}
	public String get동아리명()
	{
		return 동아리명;
	}
	public String get지도교수명()
	{
		return 지도교수명;
	}

	public void show() {
		// TODO Auto-generated method stub
		if(동아리명=="")
			System.out.println(학번 + ", " + 과정 + ", " + 이름 +", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " +평점평균);
		else
			System.out.println(학번 + ", " + 과정 + ", " + 이름 +", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " +평점평균 +", "+ 동아리명);
	}

	public void changeCircle(String 동아리명){
		// TODO Auto-generated method stub
		
			this.동아리명 = 동아리명;
	}

	
	public void changeAddress(String 주소) {
		// TODO Auto-generated method stub
		this.주소 = 주소;
	}

}
