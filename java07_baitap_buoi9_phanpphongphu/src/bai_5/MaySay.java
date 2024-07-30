package bai_5;
import java.util.Scanner;
public class MaySay extends ThietBiDien {
	private String maySay = "máy sấy";
	private String congSuat;
	private String dungTich;
	
	public void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Nhập thông tin " + maySay);
		super.nhapThongTin();
		System.out.print("Nhập công xuất (1000w, 1.500w, 2000w): ");
		this.congSuat = banPhim.nextLine();
		System.out.print("Nhập dung tích (200 lít, 300 lít): ");
		this.dungTich = banPhim.nextLine();
	}
	public void xuatThongTin() {
		System.out.println("Thông tin " + this.maySay);
		super.xuatThongTin();
		System.out.println("Công suất: " + this.congSuat + "w");
		System.out.print("Dung Tích: " + this.dungTich + " lít");
	}
}
