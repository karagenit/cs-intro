package bases;

public class Decode extends CharList {

	public static int decode(int input, int base) {
		return decode(Integer.toString(input), base);
	}
	
	public static int decode(String input, int base) {
		return decode(input.toCharArray(), base);
	}
	
	public static int decode(char[] input, int base) {
		
		int power = input.length;
		int sum = 0;
				
		for(char c : input) {
			power--;
			sum += getIndex(c) * Math.pow(base, power); 
		}
		
		return sum;
	}
}