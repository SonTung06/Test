package Test;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean isPrime = true;

		if (N < 2) {
			isPrime = false;
		}
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				isPrime = false;
				break;
			}
		}
		int sumDigits = 0;
		int temp = N;
		while (temp > 0) {
			sumDigits += temp % 10;
			temp /= 10;
		}
		boolean isSumPrime = true;
		if (sumDigits < 2) {
			isSumPrime = false;
		}
		for (int i = 2; i <= Math.sqrt(sumDigits); i++) {
			if (sumDigits % i == 0) {
				isSumPrime = false;
				break;
			}
		}
		if (isPrime && isSumPrime) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		int maxPrimeDivisor = 0;
		temp = N;
		for (int i = 2; i <= Math.sqrt(temp); i++) {
			while (temp % i == 0) {
				maxPrimeDivisor = i;
				temp /= i;
			}
		}
		if (temp > 1) {
			maxPrimeDivisor = temp;
		}

		System.out.println(maxPrimeDivisor);
		int sumDiv3 = 0;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				if (i % 3 == 0) {
					sumDiv3 += i;
				}

				int other = N / i;

				if (other != i && other % 3 == 0) {
					sumDiv3 += other;
				}
			}
		}
		System.out.println(sumDiv3);
	}
}