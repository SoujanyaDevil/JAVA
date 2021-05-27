package JAVA_CONCEPTS;

import java.sql.Array;
import java.util.Scanner;

public class JAVA_Numbers {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("the given number is:" + "\n");
		int Num1 = Sc.nextInt();

		while (Num1 < 100) {
			System.out.println("the gvn num:" + Num1);
			Num1++;

			if (Num1 % 2 == 0) {
				System.out.println("Even are:" + Num1);
			} else if (Num1 % 2 != 0) {
				System.out.println("odd are:" + Num1);
			}
			if (Num1 % 5 == 0) {
				System.out.println("Divisible by 5 are:" + Num1);

			}
		}
	}


		
}
