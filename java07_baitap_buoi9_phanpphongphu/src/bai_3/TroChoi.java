package bai_3;

import java.util.Scanner;

public class TroChoi {
	String tenTroChoi;
	int soLuotChoi;
	
	public void batDau() {
		Scanner banPhim = new Scanner(System.in);
		System.out.print("Nhập tên trò chơi: ");
		this.tenTroChoi = banPhim.nextLine();
		do {
			System.out.print("Nhập số lượt chơi: ");
			this.soLuotChoi = banPhim.nextInt();
			if (soLuotChoi < 1) {
				System.out.println("Số lượt chơi không hợp lệ!");
			}
		} while (soLuotChoi < 1);
		banPhim.close();
		System.out.printf("Trò chơi %s đã bắt đầu\n" , tenTroChoi);
		System.out.println();
	}
	public void ketThuc() {
		System.out.printf("Trò chơi %s đã kết thúc\n" , tenTroChoi);
		System.out.printf("Số lượt chơi là %d", soLuotChoi);
	}
}
