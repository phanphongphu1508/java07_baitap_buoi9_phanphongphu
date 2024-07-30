package bai_2;

import java.util.Scanner;

public class XeHoi {
	String hangSanXuat;
	String mauSac;
	int namSanXuat;
	
	public void nhap() {
		Scanner banPhim = new Scanner(System.in);
		System.out.println("- Nhập thông tin xe hơi -");
		System.out.print("Hãng sản xuất: ");
		this.hangSanXuat = banPhim.nextLine();
		
		System.out.print("Màu sắc: ");
		this.mauSac = banPhim.nextLine();
		
		do {
			System.out.print("Năm sản xuất: ");
			this.namSanXuat = banPhim.nextInt();
			if(namSanXuat < 1000 || namSanXuat > 2024) {
				System.out.println("Năm sản xuất không hợp lệ!");
			}
		} while(namSanXuat < 1000 || namSanXuat > 2024);
		banPhim.close();
	}
	public void xuat() {
		System.out.println("\nHãng sản xuất: " + hangSanXuat);
		System.out.println("Màu sắc: " + mauSac);
		System.out.println("Năm sản xuất: " + namSanXuat);
	}
}
