package engine;

public class Timer {
	private double time_left;
	
	public Timer(double initial_time) {
		this.time_left = initial_time;
	}
	
	public double getTime() {
		return Math.round(this.time_left*100.0)/100.0;
	}
	
	public void decremente(double temps) {
		this.time_left = this.time_left - temps;
	}
	
	public void incremente(double temps) {
		this.time_left = this.time_left + temps;
	}
	public String toString() {
		return Double.toString(Math.round(this.time_left*100.0)/100.0);
	}
}