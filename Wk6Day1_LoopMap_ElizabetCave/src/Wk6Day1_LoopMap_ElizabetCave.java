import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wk6Day1_LoopMap_ElizabetCave {

	
	public static void getNumbers() {
		System.out.println("Enter 5 numbers, and I will return to you the sum, product, maximum and minimum values");
		List<Integer> numbers = new ArrayList<Integer>();
		Scanner myObject = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a number: ");
			numbers.add(myObject.nextInt());
			System.out.println(numbers);
		}
		myObject.close();
		System.out.println("Here is your array List");
		System.out.println(numbers);
		
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println("Here is the sum of the Array list: " + sum);
		
		int product = 1;
		for (int number : numbers) {
			product = product * number;
		}
		System.out.println("Here is the product of the Array list: " + product);
		
		int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("The minimum value in the array List is: " + min);
        
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
        	if (numbers.get(i) > max) {
        		max = numbers.get(i);
        	}
        }
        System.out.println("The maximum value in the array List is: " + max);
	}

	public static void main(String[] args) {
		getNumbers();

	}
	
}
