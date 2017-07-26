import java.util.Scanner;
public class FenceDemo {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int option;
		Fence fence = new Fence();
		getFenceDetail(fence);
		options();
		do {
			option = input.nextInt();
			if (option == 1) {
				System.out.println("the perimiter of the yard is " + fence.calculatePermiter() + " square feet");
			} else if (option == 2) {
				System.out.println("the cost of the fence without the gate if you choose chain fence is " + "$"
						+ fence.costWithoutGateChaine());
			} else if (option == 3) {
				System.out.println("the cost of the fence without the gate if you choose wooden fence is " + "$"
						+ fence.costWithoutGateWooden());
			} else if (option == 4) {
				System.out.println("Enter the number of gates ");
				int numberOfGate = input.nextInt();
				fence.costWithGateWoodenFence(numberOfGate);
			} else if (option == 5) {
				System.out.println("Enter the number of gates");
				int numberOfGate = input.nextInt();
				fence.costWithGateChainFence(numberOfGate);
			}
			if (option==6){
				System.out.println("Thank you for using our program, Bye bye");
			}
		} while (option!=6);
	}

	public static Fence getFenceDetail(Fence f) {
		System.out.println("Enter the length of the yard ");
		int length = input.nextInt();
		f.setLength(length);
		System.out.println("Enter the width of the rectangle");
		int width = input.nextInt();
		f.setWidth(width);
		return f;
	}

	public static void options() {
		System.out.println("Enter 1 to check the perimiter of the yard");
		System.out.println("Enter 2 to get the cost of the fence without the gate if you choose chain fence");
		System.out.println("Enter 3 to get the cost of the fence without the gate if you choose wooden fence");
		System.out.println("Enter 4 to check the final amount for the fence if you choose wooden fence ");
		System.out.println("Enter 5 to check the final amount for the fence if you choose chain fence ");
		System.out.println("Enter 6 to quit");
	}

}