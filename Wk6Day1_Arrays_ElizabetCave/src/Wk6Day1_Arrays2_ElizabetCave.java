
public class Wk6Day1_Arrays2_ElizabetCave {

	public static void main(String[] args) {
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[i] > maximum) {

                  maximum = exampleArray[i];

                  index = i;

             }

        }

        System.out.println(index);
	}
	
	// The System.out.println(index) statement returns the 
	// index of the highest value in exampleArray

}
