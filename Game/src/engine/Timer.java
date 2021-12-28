package engine;

public class Timer {
	private double time_left;
	private double time_invincible;
	
	public Timer(double initial_time) {
		this.time_left = initial_time;
		this.time_invincible=0;
	}
	
	public double getTime() {
		return Math.round(this.time_left*100.0)/100.0;
	}
	public double getTime_invinvible() {
		return Math.round(this.time_invincible*100.0)/100.0;
	}
	public void decremente(double temps) {
		this.time_left = this.time_left - temps;
	}
	public void setTimeInvincible(double temps) {
		this.time_invincible=temps;
	}
	public void incremente(double temps) {
		this.time_left = this.time_left + temps;
	}
	public String toString() {
		return Double.toString(Math.round(this.time_left*100.0)/100.0);
	}
}
