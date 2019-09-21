import java.util.Scanner;

public class Holly_p1_decrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input, digit1, digit2, digit3, digit4;
		
		System.out.println("Enter value to decrypt: ");
		input = scnr.nextInt();
		
		digit4 = input % 10;
		input /= 10;
		
		digit3 = input % 10;
		input /= 10;
		
		digit2 = input % 10;
		input /= 10;
		
		digit1 = input % 10;
		
		digit1 = (digit1 + 3) % 10;
		digit2 = (digit2 + 3) % 10;
		digit3 = (digit3 + 3) % 10;
		digit4 = (digit4 + 3) % 10;
		
		System.out.println("" + digit3 + digit4 + digit1 + digit2);
	}

}
