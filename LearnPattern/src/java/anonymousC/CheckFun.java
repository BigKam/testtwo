package anonymousC;

public class CheckFun {

	
	CheckFunHelper checkFunHelper = new  CheckFunHelper();
	
	
	public boolean useCheckIsData(final String s,final DataDao dataDao){
		
		boolean f = this.checkFunHelper.CheckIsData(new Checks<Boolean>() {
			
			public Boolean checkDao(DataDao dataDao) {
				
				boolean checkFlag = false;
				
				dataDao.setS(s);
				if(dataDao.getS()==s){
					checkFlag = true;
				}
	
				return checkFlag;
			}
		}, dataDao);
		
		return f;
		
	}
}
