package ex;

import java.util.Scanner;

public class bouns2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		boolean break1 = false;
		while (true) {
			System.out.println("1. �Է��ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. ������");
			System.out.print("�۾��� ��ȣ�� �����ϼ���.");
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("�Է��ϱ⸦ �����ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("����ϱ⸦ �����ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("�����ϱ⸦ �����ϼ̽��ϴ�.");
				break;
			case 4:
				System.out.println("�����⸦ �����ϼ̽��ϴ�.");
				break1 = true;
				break;
			default:
				System.out.println("�߸������ϼ̽��ϴ�.");
				break;
			}
			if (break1) {
				break;
			}

		}
	}

}
