
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

	public void setDate(int tmpDay, int tmpMonth, int tmpYear) {

		if (tmpYear < 1900 || tmpYear > 3000)
			year = 2022;

		else
			year = tmpYear;
		{

			if (tmpMonth < 1 || tmpMonth > 12)
				month = 1;
			else
				month = tmpMonth;

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (tmpDay < 1 || tmpDay > 31)
					day = 1;

				else
					day = tmpDay;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (tmpDay < 1 || tmpDay > 30)
					day = 1;
				else {
					day = tmpDay;
				}

			} else if (month == 2) {
				if (tmpDay < 1 || tmpDay > 28) {
					day = 1;
				} else
					day = tmpDay;

			}

		}
		if (year % 4 == 0 && year % 100 == 0) {
			if (tmpDay < 1 || tmpDay > 29) {
				day = 1;
			} else
				day = tmpDay;
		}

	}

	public int addDays(int noOfDays) {
		
				
		return day;
		

	}

	public void addMonths(int noOfMonths) {
		
	}

	public int addYears(int noOfYears) {
		
		return year=year+noOfYears;
		

	}

}