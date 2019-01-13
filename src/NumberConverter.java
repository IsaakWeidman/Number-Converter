import java.util.*;

public class NumberConverter {

	public static void main(String[] args) {

	 	Scanner reader = new Scanner(System.in);
	 	String input;
	 	String[] numbers;

	 	System.out.print("Please enter the number and base formatted as \'number, base\'\n>");
	 	input = reader.nextLine();

		numbers = input.split(", ");
		
		toDecimal(numbers);
	}



	public static int toDecimal(String[] nums) {
		String number = nums[0];
		int base = Integer.parseInt(nums[1]);
		
		int decVal = 0;
		
		for(int i = number.length() - 1; i >= 0; i--) {
			decVal = 
		}
		
		return 1;
	}
}
