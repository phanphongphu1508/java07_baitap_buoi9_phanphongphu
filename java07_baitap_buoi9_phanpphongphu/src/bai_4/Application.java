package bai_4;
public class Application {
	public static void main(String[] args) {
		XeHoi xeHoi = new XeHoi();
		XeMay xeMay = new XeMay();
		
		xeHoi.nhapThongTin();
		System.out.println();
		xeMay.nhapThongTin();
		System.out.println();
		xeHoi.hienThiThongTin();
		System.out.println();
		xeMay.hienThiThongTin();
	}
}
