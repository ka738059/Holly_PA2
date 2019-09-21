import java.util.Scanner;

public class Holly_p3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] topics = {"food", "fitness", "social life", "work", "leisure"};
		int[][] responses = new int[5][10];
		int[] sums	= new int[5];
		int i, j, nextUser = 1, temp, count = 0, index;
		
		while (nextUser != -1) {
			System.out.println("Enter a value 1-10 to rate the inportance (1 = least important, 10 = most important) of the following topics in your life: ");
			for (i = 0; i < 5; i++) {
				System.out.print("" + topics[i] + ": ");
				temp = scnr.nextInt();
				
				if (temp < 1 || temp > 10) {
					System.out.println("Please enter a valid entry between 1 and 10.");
					i--;
					continue;
				}
				
				responses[i][temp-1]++;
				
				if (i == 4) {
					System.out.print("If you are the final user enter -1, otherwise enter another integer. ");
					nextUser = scnr.nextInt();
				}
			}
			count++;
		}
		
		System.out.println("Topics         1   2   3   4   5   6   7   8   9   10   Avg");
		System.out.println("------------------------------------------------------------");
		for (i = 0; i < 5; i++) {
			System.out.format("%-12s", topics[i]);
			for (j = 0; j < 10; j++) {
				System.out.format("%4d", responses[i][j]);
				sums[i] = sums[i] + (responses[i][j] * (j + 1));
				if (j == 9)
					System.out.format("%5d", (sums[i]/count));
			}
			System.out.println("");
		}
		
		temp = sums[0];
		index = 0;
		for (i = 1; i < 5; i++) {
			if (sums[i] > temp) {
				temp = sums[i];
				index = i;
			}
		}
		
		System.out.printf("The topic with the most importance is %s, with a total rating of %d.\n", topics[index], temp);
		
		temp = sums[0];
		index = 0;
		for (i = 1; i < 5; i++) {
			if (sums[i] < temp) {
				temp = sums[i];
				index = i;
			}
		}
		
		System.out.printf("The topic with the least importance is %s, with a total rating of %d.\n", topics[index], temp);
		
	}
}
