import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

class AsciiChars 
{
  public static void printNumbers()
  {
  	System.out.println("Valid numeric input: ");
    for (char character = 48; character < 58; character++) {
    	System.out.print(character + " ");
    }
  }

  public static void printLowerCase()
  {
    System.out.println("\nValid lowercase input: ");
    for(char character = 97; character <= 122; character++) {
    	System.out.print(character + " ");
    }
  }

  public static void printUpperCase()
  {
    System.out.println("\nValid uppercase input: ");
    for(char character = 65; character <= 90; character++) {
    	System.out.print(character + " ");
    }
  }
} 


public class Wk6Day3_ControlFlowHW_ElizabetCave {

	public static void main(String[] args) {
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		System.out.println("\nHello World");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println("Do you want to continue to the interactive portion?");
		String response = scanner.nextLine();
		String car, favoritePetName, actor, quarterBack, newSet, lottoNum;
		int favoritePetAge, luckyNumber, modelNumber, randomNumber, jerseyNumber, magicBall;
		jerseyNumber = 0;
		
		boolean prompt = true;
		if(response.toLowerCase().equals("yes") || response.toLowerCase().equals("y")) {
			do {
				// Asking the user questions
				System.out.println("Do you have a red car? (yes/no)");
				car = scanner.next();
				System.out.println("What is the name of your favorite pet?");
				favoritePetName = scanner.next();
				System.out.println("What is the age of your favorite pet?");
				favoritePetAge = scanner.nextInt();
				System.out.println("What is your lucky number?");
				luckyNumber = scanner.nextInt();
				System.out.println("Do you have a favorite quarterback? (yes/out)");
				quarterBack = scanner.next();
				if(quarterBack.equals("yes")) {
					System.out.println("What is their jersey number?");
					jerseyNumber = scanner.nextInt();
				}
				System.out.println("What is the two-digit model year of your car?");
				modelNumber = scanner.nextInt();
				System.out.println("What is the first name of your favorite actor?");
				actor = scanner.next();
				System.out.println("Enter a random 1 and 50?");
				randomNumber = scanner.nextInt();
				// Random value
				Random rand = new Random();
				// 3 Random Numbers
				int random1 = rand.nextInt(50);
				int random2 = rand.nextInt(50);
				int random3 = rand.nextInt(50);
				// if statement to determine magicBall number based on jersey number existence
				if(jerseyNumber == 0) {
					magicBall = Math.abs(luckyNumber * random3);
				}
				else {
					magicBall = Math.abs(jerseyNumber * random2);
				}
				// Making sure magic ball is less than than 75
				while (magicBall > 75) {
					magicBall = magicBall - 75;
				}
				// declaring lottery numbers
				int num1, num2, num3, num4, num5;
				num1 = 42;
				num2 = Math.abs(modelNumber + luckyNumber);
				num3 = Math.abs((int)actor.charAt(0));
				num4 = Math.abs(random1 - random2);
				num5 = Math.abs(jerseyNumber + favoritePetAge + luckyNumber);
				//while loop to keep nums below 65
				while (num1 > 65) {
					num1 = num1 - 65;
				}
				while (num2 > 65) {
					num2 = num2 - 65;
				}
				while (num3 > 65) {
					num3 = num3 - 65;
				}
				while (num4 > 65) {
					num4 = num4 - 65;
				}
				while (num5 > 65) {
					num5 = num5 - 65;
				}
				//print numbers
				System.out.println("Lottery Numbers: " + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + " and the Magic ball is: " + magicBall);
				System.out.println("Do you want to generate a new set of numbers? ");
				newSet = scanner.next();
			} while (newSet.equals("yes"));
			System.out.println("Hope you had fun!");
		}
	
	}

}


