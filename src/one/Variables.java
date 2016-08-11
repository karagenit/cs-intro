package one;

public class Variables {

	public static void main (String[] args) throws Exception {
		
		int sum = 0;
		
		int a = 3;
		a *= 2;
		
		for(int i = 0; i <= a; i++) {
			sum += i;
		}
		
		System.out.print("SUM IS: " + sum);
	}
}