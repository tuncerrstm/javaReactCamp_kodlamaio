package core.concretes;

import core.abstracts.VerificationService;
import entities.concretes.User;
import java.util.Random;
import java.util.Scanner;

public class EmailVerificationManager implements VerificationService {

	@Override
	public boolean verificate(User user) {
		Scanner scanner = new Scanner(System.in);
		char chosenValue = 'n';
		System.out.println(user.getEmail()
				+ " we sent a verification code to. Do you want to confirm your account? (Y/N)");
		chosenValue = scanner.next().charAt(0);

		if (chosenValue == 'y' || chosenValue == 'Y') {
			Random random = new Random();
			int randomInteger, enteredNumber, count = 0;

			do {
				randomInteger = random.nextInt(999999 - 100000 + 1) + 100000;

				System.out.println(
						"Enter the 6-digit number sent to your email to verify the account. :\n--> " + randomInteger);
				enteredNumber = scanner.nextInt();
				count++;
				if (count == 4) {
					System.out.println(
							"You made too many incorrect attempts, so the account could not be verified. \nLütfen daha sonra tekrar deneyiniz..");
					scanner.close();
					return false;
				}
			} while (!(enteredNumber == randomInteger) && count < 4);
			System.out.println("Congratulations, your account has been verified.");
			
			scanner.close();
			return true;

		}
		scanner.close();
		return false;

	}
}