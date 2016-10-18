package anonymousC;

public class DoTest {

	public static void main(String[] args) {
		
		String s = "test";
		
		
		DataDao dataDao = new DataDao();
		CheckFun checkFun = new CheckFun();
		
		boolean answer = checkFun.useCheckIsData(s, dataDao);
		
		System.out.println(answer);
	}

}
