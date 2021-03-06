package lab3;	
		import java.util.Date;
		import java.time.Month;
		import java.time.LocalDate;
		public class Exercise9 {	
			public static void
			getDayMonthYear(String date)
			{
				// Get an instance of LocalTime
				// from date
				LocalDate currentDate
					= LocalDate.parse(date);
				// Get day from date
				int day = currentDate.getDayOfMonth();
				// Get month from date
				Month month = currentDate.getMonth();
				// Get year from date
				int year = currentDate.getYear();
				// Print the day, month, and year
				System.out.println("Day: " + day);
				System.out.println("Month: " + month);
				System.out.println("Year: " + year);
			}
			// Driver Code
			public static void main(String args[])
			{
				// Given Date
				String date = "2020-07-18";
				// Function Call
				getDayMonthYear(date);
			}
		}
