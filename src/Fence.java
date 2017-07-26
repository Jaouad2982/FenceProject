import java.util.Scanner;

public class Fence {
	private static Scanner input = new Scanner(System.in);
	private int width;
	private int length;
	private final int chainFence = 15;
	private final int costWooden = 25;
	private final double permit = 50.00;
	private final double tax = 0.06;
	private final double gatePrice = 150.00;

	public Fence() {
		width = 0;
		length = 0;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int neWidth) {
		width = neWidth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int newLength) {
		length = newLength;
	}

	public double calculatePermiter() {
		double perimiter = 2 * (length + width);
		return perimiter;
	}

	public double costWithoutGateChaine() {
		int perimiter = 2 * (getLength() + getWidth());
		double amount = perimiter * chainFence;
		return amount;
	}

	public double costWithoutGateWooden() {
		int perimiter = 2 * (getLength() + getWidth());
		double amount = perimiter * costWooden;
		return amount;
	}

	public void costWithGateWoodenFence(int gateNumber) {
		double amountwoodenFenceGate;
		String sentence = "the amount with  a wooden fence and with " + gateNumber + " gates is ";
		int perimiter = 2 * (getLength() + getWidth());
		double amount = perimiter * costWooden;
		if (gateNumber == 1) {
			System.out.println(sentence + "$" +(amountwoodenFenceGate = amount + gatePrice));
			double taxeAmount = tax * (amountwoodenFenceGate);
			System.out.println("The final amount is " + "$" +(taxeAmount + amountwoodenFenceGate + permit));
		} else if (gateNumber == 2) {
			System.out.println(sentence + "$" +(amountwoodenFenceGate = amount + (gateNumber * gatePrice)));
			double taxeAmount = tax * (amountwoodenFenceGate);
			System.out.println("The final amount is " + "$" +(taxeAmount + amountwoodenFenceGate + permit));
		} else if (gateNumber == 3) {
			System.out.println(sentence + "$" +(amountwoodenFenceGate = amount + (gateNumber * gatePrice)));
			double taxeAmount = tax * (amountwoodenFenceGate);
			System.out.println("The final amount is " + "$" + (taxeAmount + amountwoodenFenceGate + permit));

		} else {
			System.out.println("Number of gates is invalid,try again, Enter a valid option");
		}
	}

	public void costWithGateChainFence(int gateNumber) {
		double amountwoodenChainGate;
		String sentence = "the amount with a Chain fence and with " + gateNumber + " gates is ";
		int perimiter = 2 * (getLength() + getWidth());
		double amount = perimiter * chainFence;
		if (gateNumber == 1) {
			System.out.println(sentence + "$" + (amountwoodenChainGate = amount + gatePrice));
			double taxeAmount = tax * (amountwoodenChainGate);
			System.out.println("The final amount is " + "$" + (taxeAmount + amountwoodenChainGate + permit));
		} else if (gateNumber == 2) {
			System.out.println(sentence + "$" + (amountwoodenChainGate = amount + (gateNumber * gatePrice)));
			double taxeAmount = tax * (amountwoodenChainGate);
			System.out.println("The final amount is " + "$" + (taxeAmount + amountwoodenChainGate + permit));
		} else if (gateNumber == 3) {
			System.out.println(sentence + "$" +(amountwoodenChainGate = amount + (gateNumber * gatePrice)));
			double taxeAmount = tax * (amountwoodenChainGate);
			System.out.println("The final amount is " + "$" + (taxeAmount + amountwoodenChainGate + permit));

		} else {
			System.out.println("Number of gates is invalid, try again.Enter a valid option");
		}
	}
}
