package ex;

import java.util.Scanner;

public class bouns1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int sum=0;
		int count=0;
		System.out.print("���ڸ� �Է����ּ��� : ");
		while (true) {
			number = sc.nextInt();
			if(number == 0) {
				break;
			}
			if(!(number % 2 == 0)) {
				sum += number;
				count++;
			}
		}
		System.out.println("Ȧ���� �� ="+sum);
		System.out.println("Ȧ���� ��� ="+sum / count);
	}

}
