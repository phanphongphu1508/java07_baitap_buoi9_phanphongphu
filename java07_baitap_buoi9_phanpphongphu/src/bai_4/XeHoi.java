package bai_4;

import java.util.Scanner;

public class XeHoi extends PhuongTienGiaoThong {
	private String xeHoi = "xe hơi";
	private String nhienLieu;
	private String loaiHopSo;
	private int soChoNgoi;
	
	@Override
	public void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Nhập thông tin " + xeHoi);
		super.nhapThongTin();
		System.out.print("Nhiên liệu (xăng, dầu diesel, điện): ");
		this.nhienLieu = banPhim.nextLine();
		System.out.print("Loại hộp số (số sàn, số tự động): ");
		this.loaiHopSo = banPhim.nextLine();
		do {
		System.out.print("Số chỗ ngồi: ");
		this.soChoNgoi = Integer.parseInt(banPhim.nextLine());
		if (soChoNgoi < 2 || soChoNgoi > 7) {
			System.out.println("vui lòng nhập số chỗ ngồi từ 2 - 7 chỗ");
		}
		} while (soChoNgoi < 2 || soChoNgoi > 7);
	}
	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin " + this.xeHoi);
		super.hienThiThongTin();
		System.out.println("Nhiên liệu: " + this.nhienLieu);
		System.out.println("Loại hộp số: " + this.loaiHopSo);
		System.out.println("Số chỗ ngồi: " + this.soChoNgoi + " chỗ");

	}
}