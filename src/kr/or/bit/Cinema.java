package kr.or.bit;

import java.util.Scanner;

public class Cinema {
	Scanner sc = new Scanner(System.in);
	static String[][] seatArr = new String[4][5];

	// 좌석초기화
	public void Cinema() {
		for (int i = 0; i < seatArr.length; i++) {
			for (int j = 0; j < seatArr[i].length; j++) {
				seatArr[i][j] = i + 1 + "-" + ((int) j + 1);
			}
		}
	}

	public void showSeat() {
		for (int i = 0; i < seatArr.length; i++) {
			for (int j = 0; j < seatArr[i].length; j++) {
				System.out.print("[ " + seatArr[i][j] + " ]");
			}
			System.out.println();
		}
	}

	public void booking() {
		while (true) {
			System.out.print("예매하고자 하는 좌석 번호(행, 열)을 입력하세요...>>");
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			if (seatArr[x][y] == "예매") {
				System.out.println("이미 예매된 자리입니다.");
				return;
			} else {
				System.out.print("예매하시겠습니까? (1)예 (2)다른좌석예매하기 (3)초기화면으로 돌아가기>>");
				int answer = sc.nextInt();

				switch (answer) {
				case 1:
					seatArr[x][y] = "예매";
					System.out.printf("예매가 완료되었습니다... [%d-%d]\n", x + 1, y + 1);
					showSeat();
					return;

				case 2:
					continue;
				case 3:
					return;
				}
			}
		}
	}
}
