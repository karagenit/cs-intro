package codingbat;

public class One {
	
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
		if (a > b) {
			if (bounded(a)) {
				return a;
			} else if (bounded(b)) {
				return b;
			}
		}
		
		if (b > a) {
			if (bounded(b)) {
				return b;
			} else if (bounded(a)) {
				return a;
			}
		}
	
		return 0;
	}

	private boolean bounded(int a) {
		return (a >= 10 && a <= 20);
	}
}
