package homeWork_3;

public abstract class Student implements Comparable{
	protected String 이름, 지도교수명, 주소,학번,과정;
	protected int 학년;
	protected double 평점평균;
	public Student(String 학번, String 이름, int 학년, String 지도교수명, String 주소, double 평점평균)
	{
		this.학번 = 학번;
		this.이름 = 이름;
		this.학년 = 학년;
		this.지도교수명 = 지도교수명;
		this.주소 = 주소;
		this.평점평균 = 평점평균;
	}
	
	public String get학번()
	{
		return 학번;
	}
	public String get지도교수명()
	{
		return 지도교수명;
	}
	public double get평점평균()
	{
		return 평점평균;
	}
	public String get주소()
	{
		return 주소;
	}
	public String get과정()
	{
		return 과정;
	}
	public int get학년()
	{
		return 학년;
	}
	abstract public void show();
	public String get연구분야()
	{
		throw new UnsupportedOperationException();
	}
	public String get동아리명()
	{
		throw new UnsupportedOperationException();
	}
	public String get회사()
	{
		throw new UnsupportedOperationException();
	}
	public String get부서()
	{
		throw new UnsupportedOperationException();
	}
	public String get직책()
	{
		throw new UnsupportedOperationException();
	}
	public String get이름()
	{
		return 이름;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.평점평균 < ((Student)o).get평점평균())
			return 1;
		else if(this.평점평균 > ((Student)o).get평점평균())
			return -1;
		return 0;
	}
}
