
public class Program {

	public static void main(String[] args) {
		System.out.println("Enter Todays Date in fiven format DD/MM/YYYY");
		System.out.println("Enter the Day");
		int day = ConsoleInput.getInteger();

		System.out.println("Enter the Month");
		int month = ConsoleInput.getInteger();

		System.out.println("Enter the Year");
		int year = ConsoleInput.getInteger();
		Date date = new Date();
		date.setDate(day, month, year);
		int choice = 0;
		while (choice <= 5) {
			
		System.out.println("-------Calender------");
		System.out.println("--Enter your Choice--");
		System.out.println("1.Show Entered Date\n2.Add Day\n3.Add Month\n4.Add Year\n5.Exit");
		choice = ConsoleInput.getInteger();
			switch (choice) {

			case 1:
				System.out.println("Todays date you entered is "+date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
				break;

			case 2:
				System.out.println("Enter number of years you want to add");
				int days = ConsoleInput.getInteger();
				date.addDays(days);
				System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
				break;

			case 3:
				System.out.println("Enter number of months you want to add");
				int months = ConsoleInput.getInteger();
				date.addMonths(months);
				System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
				break;

			case 4:
				System.out.println("Enter number of years you want to add");
				int years = ConsoleInput.getInteger();
				date.addYears(years);
				System.out.println("Date after adding "+years+" years will be");
				System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
				break;

			case 5:
				System.out.println("Keep Hustling Good bye!!");
				System.exit(0);
				break;

			default:
				System.out.println("Oops! Invalid choice");
				break;

			}
		}

	}

}
