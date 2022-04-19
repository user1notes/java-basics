
public class GravityCalculator {

	public static void main(String[] args) {
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;

		// Output of unmodified program
		// The object's position after 10.0 seconds is 0.0 m.

		finalPosition = (0.5 * (gravity) * Math.pow(fallingTime, 2)) + (initialVelocity * fallingTime)
				+ initialPosition;
		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");

	}
}
