
public class FooCorporation {

	public static void calculatePay(int hours, double basePay) {
		if (hours > 60 || basePay < 8.00) {
			if (hours > 60) {
				System.out.println("Working hours cannot be greater than 60");
			}
			if (basePay < 8.00) {
				System.out.println("Minimum Base Pay should be 8.00");
			}
		} else {
			double pay = 0.0;
			int overtimeHours = 0;
			double overtimePay = 0.0;
			if (hours > 40) {
				overtimeHours = hours - 40;
				overtimePay = overtimeHours * 1.5 * basePay;
			}
			pay = (40 * basePay) + overtimePay;
			System.out.println(pay);
		}
	}

	public static void main(String[] args) {
		System.out.print("Employee 1: ");
		calculatePay(35, 7.5);
		System.out.print("Employee 2: ");
		calculatePay(47, 8.2);
		System.out.print("Employee 3: ");
		calculatePay(73, 10.00);
	}
}
