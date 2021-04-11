package Exam06;

public abstract class Car {
	private int speed;

	public Car(int speed) {
		super();
		this.speed = speed;

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public abstract void speedUp();

}
