package Date;

public class Date {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDate(int tmpDay, int tmpMonth, int tmpYear) 
	{
	
		if(tmpYear < 1900 || tmpYear>3000)
			year = 2022;
		      
		else 
			year = tmpYear;
		
		if(tmpMonth<1||tmpMonth>12)
			month = 1;
		else
			month = tmpMonth;
		
		if(month == 1||month == 3 || month == 5 ) 
		{
			if(tmpDay<1 || tmpDay>31)
		day=1;
			else 
				day=tmpDay;
	}
	else if(month==4 || month==6 || month==9 || month==11 ) {
		if(tmpDay<1||tmpDay>30)
			day=1;
		else 
			day=tmpDay;
	}
	
		if (tmpYear%4==0 && tmpYear%100==0) {
			if(tmpDay<1||tmpDay>29) {
				day=1;
			}
			
				
		}
		else 
			day=tmpDay;
		
	}

	public void addDays(int noOfDays) {
		
	}
	
	
	
}