package anonymousC;

public class CheckFunHelper {
	
	public boolean  CheckIsData(Checks<Boolean> checks,DataDao dataDao){
		
		Boolean flag = Boolean.valueOf(true);
		
		flag = Boolean.valueOf((flag.booleanValue())
				&&((Boolean)checks.checkDao(dataDao).booleanValue()));
		
		return flag;
	}

}
