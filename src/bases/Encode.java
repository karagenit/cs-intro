package bases;

public class Encode {
	
	static char[] charList = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
	};
	
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
			output += getCharMap(val);
		}
		return output;
	}
	
	public static char getCharMap(int input) {
		if(input >= 0 && input < charList.length) {
			return charList[input];
		} else {
			return '?';
		}
	}
}