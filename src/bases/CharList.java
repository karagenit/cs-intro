package bases;

public class CharList {

	private static char[] charList = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
	};
	
	public static char getChar(int index) {
		if(index >= 0 && index < charList.length) {
			return charList[index];
		} else {
			return '?';
		}
	}
	
	public static int getIndex(char c) {
		for(int i = 0; i < charList.length; i++) {
			if(c == charList[i]) {
				return i;
			}
		}
		
		//we didn't find an instance
		return -1;
	}
}
