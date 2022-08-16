import java.util.Arrays;
import java.lang.Math;

public class Wk6Day1_Arrays3_ElizabetCave {

	public static void main(String[] args) {
		toPower(4,3);
	}
	public static void toPower(int size, int power) {
		int[] myArray = new int[size];
		for (int i=0; i<size; i++) {
			myArray[i] = (int)Math.pow(i, power);
		}
		System.out.println(Arrays.toString(myArray));
	}
	
	

}
