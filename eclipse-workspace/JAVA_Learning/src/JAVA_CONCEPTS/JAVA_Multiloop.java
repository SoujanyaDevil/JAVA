package JAVA_CONCEPTS;

import java.util.Scanner;

public class JAVA_Multiloop {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("the given No.is:" + "\n");

		int Num1 = Sc.nextInt();
		int Num2 = Sc.nextInt();
		int Num3 = Sc.nextInt();

		while (Num1 < 100) {
//			System.out.println("the gvn num:" + Num1);
			Num1++;

			if (Num1 % 2 == 0) {
				System.out.println("Even numbers are:" + Num1);
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");

		while (Num2 < 100) {
//			System.out.println("the gvn num:" + Num2);
			Num2++;

			if (Num2 % 2 != 0) {
				System.out.println("Odd numbers are:" + Num2);
			}
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------------------------------------");

		while (Num3 < 100) {
//			System.out.println("the gvn num:" + Num3);
			Num3++;

			if (Num3 % 5 == 0) {
				System.out.println("Divisible by 5 are:" + Num3);
			}

		}
		System.out.println("--------------------------------------------------");
		System.out.println("-------------------------------------------------------");

	}
}
