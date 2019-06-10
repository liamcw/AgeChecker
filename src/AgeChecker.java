import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age;
		age = scanner1.nextInt();

		scanner1.close();

		if (age < 18) { // Code in here executed when condition1 has become true
			System.out.println(
					"You are a CHILD, therefore under the taxable age. Count yourself goddamn lucky, small one.");
		}

		else if (age > 65) { // Condition is checked only if condition1 is false
			System.out.println("You are TOO OLD to pay taxes. Congrats on surviving so long I guess.");
		}

		else {// Code in here executed when all conditions above have become false
			System.out.println("You are juuuuust right - time to pay those taxes, son.");
		}

	}
}
