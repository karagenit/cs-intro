package bases;

public class Encode extends CharList {
	
	public static String encode(int input, int base) {
		
		int power = 0;
		String output = "";
		
		while(Math.pow(base, power) <= input) power++;
		
		while(power > 0){
			int val = 0;
			power--;
			
			while(input >= Math.pow(base, power)){
				input -= Math.pow(base, power);
				val++;
			}
			output += getChar(val);
		}
		return output;
	}
}