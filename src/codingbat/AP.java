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
	
	public boolean scores100(int[] scores) {
		for (int i = 0; i < (scores.length - 1); i++) {
			if(scores[i] == 100 && scores[i+1] == 100) return true;
		}
		  
		return false;
	}
	
	public int wordsCount(String[] words, int len) {
		int count = 0;
		  
		for(String word : words) {
			if(word.length() == len) count++;
		}
		  
		return count;
	}
	
	public int scoresAverage(int[] scores) {
		  int avg1, avg2;
		  
		  avg1 = average(scores, 0, (scores.length / 2));
		  avg2 = average(scores, (scores.length / 2), scores.length);
		  
		  return (avg1 > avg2) ? avg1 : avg2;
		}

		private int average(int[] scores, int start, int end) {
		  int sum = 0; 
		  int count = 0;
		  
		  for(int i = start; i < end; i++) {
		    sum += scores[i];
		    count++;
		  }
		  
		  return (sum/count);
		}
}
