package interest;

public class InterestCalculator {

	public static void main(String[] args) {

		double payment = 100, rate = 0.05, dDuration;
		int duration = 1;
		
		//get monthly payment
		//payment  = get_param("Please enter the monthly payment: ", 1, 100000);
		
		//get interest rate
		//rate = get_param("Please enter the interest rate: ", 0, 1);
		
		//continue getting loan duration until user inputs a value such that (% 1 == 0) i.e. non-decimal value
		//do {
		//	dDuration = get_param("Please enter the duration of the loan, in years: ", 1, 100);
		//} while (dDuration % 1 != 0);
		
		//I like this one liner better for the above, but it's "hard to read" smdh
		//while((dDuration = get_param("Please enter the duration of the loan, in years: ", 1, 100)) % 1 != 0);
		
		//cast above double value (that we know has no decimal) into an int
		//duration = (int) dDuration;
		
		//setup for output
		//print_header();
		
		double balance = 0, principal = payment, interest = 0;
		
		for(int month = (duration * 12); month > 0; month--) {
			principal = principal * (1 - (rate / 12));
			balance += principal;
			interest = (payment - principal) / payment * 100;
			
			System.out.println(month + " " + principal + " " + interest + " " + balance);
			//print_monthly_data(month, principal, interest, balance);
		}		
	}
}
