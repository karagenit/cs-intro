package codingbat;

public class AP {

	public boolean scoresIncreasing(int[] scores) {
		  int previous = scores[0];
		  
		  for (int i : scores) {
			  if(i < previous) return false;
			  previous = i;
		  }
		  
		  return true;
	}
}
