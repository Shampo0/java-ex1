package ex;

import java.util.Scanner;

public class bouns1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int sum=0;
		int count=0;
		System.out.print("숫자를 입력해주세요 : ");
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
		System.out.println("홀수의 합 ="+sum);
		System.out.println("홀수의 평균 ="+sum / count);
	}

}
