package bai_4;
import java.util.Scanner;
public class PhuongTienGiaoThong {
	String hangSanXuat;
	String mauSac;
	int namSanXuat;
	// Nhập thông tin xe
	public void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		System.out.print("Hãng sản xuất: ");
		this.hangSanXuat = banPhim.nextLine();
		System.out.print("Màu sắc: ");
		this.mauSac = banPhim.nextLine();
		do {
			System.out.print("Năm sản xuất: ");
			this.namSanXuat = Integer.parseInt(banPhim.nextLine());
			if(namSanXuat < 1000 || namSanXuat > 2024) {
				System.out.println("Năm sản xuất không hợp lệ!");
			}
		} while(namSanXuat < 1000 || namSanXuat > 2024);
	}
	// Hiển thị thông tin xe
	public void hienThiThongTin() {
		System.out.println("Hãng sản xuất: " + this.hangSanXuat);
		System.out.println("Màu sắc: " + this.mauSac);
		System.out.println("Năm sản xuất: " + this.namSanXuat);
	}
}
