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
		
			
			System.out.print("���ǰ��� �Է��ϼ��� :");
			a = sc.nextInt();
			System.out.print("������ ���� �׼��� �Է��ϼ��� :");
			b = sc.nextInt();
			
			money = (b-a);
			
			if(0 > money) {
				System.out.println(-1*(money)+"���� �����մϴ�");
				break;
			}else {
				
			System.out.println("�Ž����� :"+(money)+"��");
			
			for (int i = 1000; i < (money); i+=1000) {
				num+=1;
			}
			System.out.println("1000�� : " + num + "��");
			money -= num * 1000;
			num = 0;
			
			for (int i = 500; i < (money); i+=500) {
				num+=1;
			}
			System.out.println("500�� : " + num + "��");
			money -= num * 500;
			num = 0;
			for (int i = 100; i < (money); i+=100) {
				num+=1;
			}
			System.out.println("100�� : " + num + "��");
			money -= num * 100;
			num = 0;
			for (int i = 50; i < (money); i+=50) {
				num+=1;
			}
			
			System.out.println("50�� : " + num + "��");
			money -= num * 50;
			num = 0;
			
			for (int i = 10; i <= (money); i+=10) {
				num+=1;
			}
			System.out.println("10�� : " + num + "��");
		}
		}
	}
}