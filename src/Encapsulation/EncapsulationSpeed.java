package Encapsulation;

public class EncapsulationSpeed {

	static class SpeedoMeter {
		private int speed;

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			if (speed < 0 || speed > 100) {
				System.out.println("Invalid Speed");
				return;
			}
			this.speed = speed;
		}

		public void increaseSpeed(int speedUnits) {
			if (speed + speedUnits >= 100) {
				System.out.println("Over Speeding!");
				return;
			}
			speed += speedUnits;

		}

		public void decreaseSpeed(int speedUnits) {
			if (speed - speedUnits < 0) {
				System.out.println("Speed cannot be Negative");
				return;
			}
			speed -= speedUnits;

		}

	}

	public static void main(String[] args) {
		SpeedoMeter speedoMeter = new SpeedoMeter();
		speedoMeter.setSpeed(100);
		speedoMeter.decreaseSpeed(110);

	}

}
