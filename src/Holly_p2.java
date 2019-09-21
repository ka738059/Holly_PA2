import java.util.Scanner;
import java.lang.Math;

public class Holly_p2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int weight, unitType;
		double height, BMI;
		
		System.out.println("Enter measurement system (0 for metric(kg and meters) or 1 for US Customary(pounds and inches)) :");
		unitType = scnr.nextInt();
		
		System.out.println("Enter weight:");
		weight = scnr.nextInt();
		
		System.out.println("Enter height:");
		height = scnr.nextDouble();
		
		if (unitType == 0)
			BMI = weight / (height * height);
		else
			BMI = 703 * weight / (height * height);
		
		System.out.printf("Your body mass index is : %.2f\n", BMI);
		System.out.println("BMI categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}
}
