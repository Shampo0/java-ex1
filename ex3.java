package ex;

import java.util.Scanner;

public class ex3 {
	public static void arithmetic() {

	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
	a = sc.nextInt();
	System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
	b = sc.nextInt();
	System.out.println("���� ��� =>" + a+b);
	System.out.println("���� ��� =>" + (a-b));
	System.out.println("���� ��� =>" + a*b);
	System.out.println("������ ��� =>"+ a/b);
	System.out.println("������ ������ ��� =>"+ a%b);
	};

	public static void main(String[] args) {
		arithmetic();

	}
}
