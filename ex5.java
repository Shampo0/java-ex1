package ex;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int num=0;
		int money;
		
		while (true) {
		
			
			System.out.print("물건값을 입력하세요 :");
			a = sc.nextInt();
			System.out.print("지불한 돈의 액수를 입력하세요 :");
			b = sc.nextInt();
			
			money = (b-a);
			
			if(0 > money) {
				System.out.println(-1*(money)+"원이 부족합니다");
				break;
			}else {
				
			System.out.println("거스름돈 :"+(money)+"원");
			
			for (int i = 1000; i < (money); i+=1000) {
				num+=1;
			}
			System.out.println("1000원 : " + num + "개");
			money -= num * 1000;
			num = 0;
			
			for (int i = 500; i < (money); i+=500) {
				num+=1;
			}
			System.out.println("500원 : " + num + "개");
			money -= num * 500;
			num = 0;
			for (int i = 100; i < (money); i+=100) {
				num+=1;
			}
			System.out.println("100원 : " + num + "개");
			money -= num * 100;
			num = 0;
			for (int i = 50; i < (money); i+=50) {
				num+=1;
			}
			
			System.out.println("50원 : " + num + "개");
			money -= num * 50;
			num = 0;
			
			for (int i = 10; i <= (money); i+=10) {
				num+=1;
			}
			System.out.println("10원 : " + num + "개");
		}
		}
	}
}