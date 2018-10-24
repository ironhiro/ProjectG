package homeWork_3;

public class IndustryGraduate extends Graduate{
	private String 회사, 부서, 직책;
	public IndustryGraduate(String 학번, String 과정,String 이름, int 학년, String 지도교수명, String 주소, double 평점평균, String 연구분야, String 회사, String 부서, String 직책) {
		// TODO Auto-generated constructor stub
		super(학번, 과정,이름,학년,지도교수명,주소, 평점평균, 연구분야);
		this.회사 = 회사;
		this.부서 = 부서;
		this.직책 = 직책;
	}
	public IndustryGraduate(String 학번, String 과정,String 이름, int 학년, String 지도교수명, String 주소, double 평점평균,String 회사, String 부서, String 직책) {
		// TODO Auto-generated constructor stub
		super(학번,과정,이름,학년,지도교수명,주소,평점평균);
		연구분야 = "";
		this.회사 = 회사;
		this.부서 = 부서;
		this.직책 = 직책;
	}
	public String get회사()
	{
		return 회사;
	}
	public String get부서()
	{
		return 부서;
	}
	public String get직책()
	{
		return 직책;
	}
	public String get지도교수명()
	{
		return 지도교수명;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(학번 + ", " + 과정 + ", " + 이름 +", " + 학년 + ", " + 지도교수명 + ", " + 주소 + ", " + 평점평균 + ", "+연구분야 + ", " + 회사 + ", " + 부서 + ", " + 직책);
	}
	
	

}
