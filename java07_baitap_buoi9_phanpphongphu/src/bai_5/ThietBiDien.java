package bai_5;
import java.util.Scanner;
public class ThietBiDien {
	private String hangSanXuat;
	private int namSanXuat;
	private int nguonDien;
	public void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		// Nhập hãng
		System.out.print("Nhập hãng sản xuất: ");
		this.hangSanXuat = banPhim.nextLine();
		// Nhập năm sản xuất
		do {
			System.out.print("Nhập năm sản xuất: ");
			this.namSanXuat = Integer.parseInt(banPhim.nextLine());
			if (namSanXuat < 1000 || namSanXuat > 2024) {
				System.out.println("Năm sản xuất không hợp lệ! Vui lòng thử lại.");
			}
		} while(namSanXuat < 1000 || namSanXuat > 2024);
		// Nhập nguồn điện
		do {
			System.out.print("Nhập nguồn điện sử dụng (110v hoặc 220v): ");
			this.nguonDien = Integer.parseInt(banPhim.nextLine());
			if (nguonDien != 110 && nguonDien != 220) {
				System.out.println("Nguồn điện không hợp lệ! Vui lòng thử lại.");
			}
			} while(nguonDien != 110 && nguonDien != 220);
	}
	public void xuatThongTin() {
		System.out.println("Hãng sản xuất: " + this.hangSanXuat);
		System.out.println("Năm sản xuất: " + this.namSanXuat);
		System.out.println("Nguồn điện: " + this.nguonDien);
		
	}
}
