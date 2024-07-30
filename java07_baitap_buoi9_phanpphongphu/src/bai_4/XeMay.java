package bai_4;
import java.util.Scanner;
public class XeMay extends PhuongTienGiaoThong {
	private String xeMay = "xe máy";
	private String dungTichXiLanh;
	private String loaiDongCo;
	
	@Override
	public void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Nhập thông tin " + xeMay);
		super.nhapThongTin();
		System.out.print("Loại động (2 thì, 4 thì): ");
		this.loaiDongCo = banPhim.nextLine();
		System.out.print("Dung tích xi-lanh (50cc - 175cc): ");
		this.dungTichXiLanh = banPhim.nextLine();
	}
	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin " + this.xeMay);
		super.hienThiThongTin();
		System.out.println("Loại động cơ: " + this.loaiDongCo);
		System.out.println("Dung tích xi-lanh: " + this.dungTichXiLanh + "cc");
	}
}
