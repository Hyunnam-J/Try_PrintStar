import java.util.Scanner;

public class Star_Diamond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Enter an odd number : ");
				int var = Integer.parseInt(scanner.nextLine());
				if(var % 2 == 1) {
					int mid = var / 2 + 1;
					for(int i = 1; i <= var; i++) {
						for(int j = 1; j <= var; j++) {
							if(i < mid) {
								if(j < mid && j >= mid - (i - 1)) {
									System.out.print("*");
								}else if (j > mid && j <= mid + (i - 1)){
									System.out.print("*");
								}else if (j == mid){
									System.out.print("*");
								}else {
									System.out.print(" ");
								}
							}else if(i > mid) {
								if(j < mid && j >= mid - (2 * mid - i - 1)) {
									System.out.print("*");
								}else if (j > mid && j <= mid + (2 * mid - i - 1)){
									System.out.print("*");
								}else if(j == mid){
									System.out.print("*");
								}else {
									System.out.print(" ");
								}
							}else {
								System.out.print("*");
							}//if - setting variable i's scope
						}//for j
						System.out.println();
					}//for i
				}else {
					System.out.println("You entered it incorrectly");
					continue;
				}//if(var % 2 == 1)
			} catch (Exception e) {
				System.out.println("You entered it incorrectly");
				continue;
			}//try
			break;
		}//while
		scanner.close();
	}//main
}//class
