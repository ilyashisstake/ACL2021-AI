package engine;

public class Timer {
	private double time_left;
	
	public Timer(double initial_time) {
		this.time_left = initial_time;
	}
	
	public double getTime() {
		return this.time_left;
	}
	
	public void decremente(double temps) {
		this.time_left = this.time_left - temps;
	}
	
	public void incremente(double temps) {
		this.time_left = this.time_left + temps;
	}
}
