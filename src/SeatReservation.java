package kr.or.bit;

import java.util.Scanner;

public class SeatReservation {
	static Scanner scanner = new Scanner(System.in); 
	
	//��� ����
	void reservation () {
		System.out.println("�����ϱ�");
	}
	
	void checkReservation () {
		System.out.println("������ȸ");
	}
	
	void cancelReservation () {
		System.out.println("�������");
	}
	
	int displayMenu (){
		System.out.println("*****************************");
		System.out.println("******* ��ȭ ���� �ý��� *******");
		System.out.println("*****************************");
		System.out.println("******* �޴��� �����ϼ��� *******");
		System.out.println("*****************************");
		System.out.println("1. �����ϱ�");
		System.out.println();
		System.out.println("2. ������ȸ");
		System.out.println();
		System.out.println("3. �������");
		System.out.println();
		int input = 0; 
			
			do {
					try {
						System.out.println("*****************************");
						System.out.println("******* ��ȭ ���� �ý��� *******");
						System.out.println("*****************************");
						System.out.println("******* �޴��� �����ϼ��� *******");
						System.out.println("*****************************");
						System.out.println("1. �����ϱ�");
						System.out.println();
						System.out.println("2. ������ȸ");
						System.out.println();
						System.out.println("3. �������");
						System.out.println();
						
						input = Integer.parseInt(scanner.nextLine()); // ���ϴ� �޴���ȣ �Է�
						if (input >=1 && input <=3) //�Է��� �� input �� 1�� 6������ ���̸�
							{break; //do~while�� Ż��
					}
					else { //input�� 1�� 6������ ���� �ƴϸ�
						throw new Exception("�޴� ���� ��ȣ�� �߸��Ǿ����ϴ�"); // ���� ó�� Ŭ���� Exception
					}// else �� ��
					} // try �� ��
					catch (Exception e) { // try �ȿ��� ������ ����(������ ���� ��Ȳ: input �� 1~6 ������ int�� �ƴ� ���) �����߻� ������ �ּҸ� parameter 'e'�� ������
						System.out.println("���� �߻� ����: " + e.getMessage()); // e.getMessage() : 
						System.out.println("1~3������ �޴� ��ȣ �� �ϳ��� �Է��� �ּ���");
	
					}
	
			} // do �� ��
			while(true);
			
	// 1~3�� �ϳ��� �����ߴٸ�
	 return input; 
	 
	}

	
	void start() {
		switch (displayMenu ()) {
			case 1: reservation ();
			break;
			case 2: checkReservation ();
			break;
			case 3: cancelReservation ();
			break;

		}
	}
	
	
//Conducting////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		SeatReservation seatReservation = new SeatReservation();
		
		seatReservation.start();
		
		

	}

}
