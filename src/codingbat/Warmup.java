package codingbat;

public class Warmup {
	
	public int close10(int a, int b) {
		int distA = Math.abs(10 - a);
		int distB = Math.abs(10 - b);
		  
		if (distA < distB) {
			return a;
		} else if (distB < distA) {
			return b;
		} else {
			return 0;
		}
	}
	
	public boolean in3050(int a, int b) {
		  return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40) || 
				  (a >= 40 && a <= 50) && (b >= 40 && b <= 50));
	}

	public int max1020(int a, int b) {
		if (b > a) {
			int tmp = b;
			b = a;
			a = tmp; //b's old val
		}
			  
		if(bounded(a)) return a;
		if(bounded(b)) return b;
		return 0;
	}

	private boolean bounded(int a) {
		return (a >= 10 && a <= 20);
	}
	
	public int sumDouble(int a, int b) {
		return (a == b) ? 2 * (a + b) : (a + b);
	}
	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile == bSmile;
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
	
	public boolean posNeg(int a, int b, boolean negative) {
		return negative ? (a < 0) && (b < 0) : (a < 0) != (b < 0);
	}
}
