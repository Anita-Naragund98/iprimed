import java.util.Scanner;

public class Space {

	public static void main(String[] args) {
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name to be displayed");
		name = sc.next();
		int num;
		num = name.length();
		int val = num + 3;
		int n = 22 - val;
		for (int i = 9; i > 0; i--) {
			if (i == 1 || i == 9) {
				System.out.println("+------------------+");
			} else {
				for (int j = 1; j < 23; j++) {
					if (j == 1 || j == 22) {
						System.out.print("|");
					} else {

						if (i == 3 && j == n + 1) {
							System.out.print(name + "  " + "|");
							break;
						} else {

							System.out.print(" ");
						}

					}

				}
				System.out.println();
			}
		}

	}

}