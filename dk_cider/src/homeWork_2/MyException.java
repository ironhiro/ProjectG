package homeWork_2;

@SuppressWarnings("serial")
public class MyException extends Exception {
	int 오류코드;
	String 오류내용;
	
	public MyException(int 오류코드, String 오류내용)
	{
		this.오류코드 = 오류코드;
		this.오류내용 = 오류내용;
	}
	public int getCode() {
		// TODO Auto-generated method stub
		return 오류코드;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return 오류내용;
	}

}
