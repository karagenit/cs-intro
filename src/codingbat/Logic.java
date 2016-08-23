package codingbat;

public class Logic {

	public boolean cigarParty(int cigars, boolean isWeekend) {
		  return isWeekend ? (cigars >= 40) : ((cigars >= 40) && (cigars <= 60));
		}

	public int dateFashion(int you, int date) {
		  if(you <= 2 || date <= 2) return 0;
		  if(you >= 8 || date >= 8) return 2;
		  return 1;
		}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		  return (temp >= 60) && (isSummer ? (temp <= 100) :  (temp <= 90));
		}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		  if(isBirthday) {
		    if(speed <= 65) return 0;
		    if(speed >= 86) return 2;
		    return 1;
		  } else {
		    if(speed <= 60) return 0;
		    if(speed >= 81) return 2;
		    return 1;
		  }
		}

	public int sortaSum(int a, int b) {
		  return (a + b >= 10 && a + b <= 19) ? 20 : (a + b);
		}

	public String alarmClock(int day, boolean vacation) {
		  boolean weekend = day == 0 || day == 6;
		  
		  if(vacation) {
		    if(weekend) {
		      return "off";
		    } else {
		      return "10:00";
		    }
		  } else {
		    if(weekend) {
		      return "10:00";
		    } else {
		      return "7:00";
		    }
		  }
		}

}
