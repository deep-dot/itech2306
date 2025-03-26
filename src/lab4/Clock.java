package lab4;

public class Clock {
	int hours;
	int minutes;
	int seconds;
	
	public Clock(int newHours, int newMinutes, int newSeconds) {
		setHours(newHours);
		setMinutes(newMinutes);
		setSeconds(newSeconds);
	}
	
	public String tick() {
		if (seconds == 59) {
			seconds = 0;
			if(minutes == 59) {
				minutes = 0;
				if(hours == 12) {
					hours = 1;
					minutes = 0;
					seconds = 0;
				} else {
					hours += 1;
				}
			} else {
				minutes += 1;
			}
		} else {
			seconds += 1;
		}	
		return hours + ":" + minutes + ":" + seconds; 
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int clockHours) {
		
		if(clockHours >= 1 && clockHours <= 12) {
			hours = clockHours;
		} else {
			hours = 1;
		}
	}
	
	public int getMinutes() {
		return minutes;
	}
	 
	public void setMinutes(int clockMinutes) {
		if(clockMinutes >= 0 && clockMinutes <= 59) {
			minutes = clockMinutes;	
		} else {
			minutes = 0;
		}
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int clockSeconds) {
		if(clockSeconds >= 0 && clockSeconds <= 59) {
			seconds = clockSeconds;
		} else {
			seconds = 0;
		}
	}
	
	public String toString() {
		return "Time is: " + hours + ":" + minutes + ":" + seconds;
	}
}
