import java.util.Scanner;

public class Holly_p1_encrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input, digit1, digit2, digit3, digit4;
		
		System.out.println("Enter value to encrypt: ");
		input = scnr.nextInt();
		
		digit4 = input % 10;
		input /= 10;
		
		digit3 = input % 10;
		input /= 10;
		
		digit2 = input % 10;
		input /= 10;
		
		digit1 = input % 10;
		
		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		digit4 = (digit4 + 7) % 10;
		
		System.out.println("" + digit3 + digit4 + digit1 + digit2);
	}
}
