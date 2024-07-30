package bai_1;
import java.util.Scanner;
public class HocSinh {
	String hoTen;
	int tuoi;
	double diemToan, diemLy, diemHoa;
	
	public void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		System.out.println("- Nhập thông tin sinh viên -");
		// Nhập tên
		System.out.print("Nhập tên: ");
		this.hoTen = banPhim.nextLine();
		
		// Nhập tuổi
		do {
			System.out.print("Nhập tuổi: ");
			this.tuoi = Integer.parseInt(banPhim.nextLine());
			if(tuoi < 1 || tuoi > 99) {
				System.out.println("Tuổi không hợp lệ! Vui lòng nhập tuổi từ 1 - 99");
			}
		} while(tuoi < 1 || tuoi > 99);
		
		// Điểm toán
		do {
			System.out.print("Nhập điểm toán: ");
			this.diemToan = Integer.parseInt(banPhim.nextLine());
			if(diemToan < 0 || diemToan > 10) {
				System.out.println("Điểm không hợp lệ! Vui lòng nhập điểm từ 0 - 10");
			}
		} while(diemToan < 0 || diemToan > 10);
		
		// Điểm lý
		do {
			System.out.print("Nhập điểm lý: ");
			this.diemLy = Integer.parseInt(banPhim.nextLine());
			if(diemLy < 0 || diemLy > 10) {
				System.out.println("Điểm không hợp lệ! Vui lòng nhập lại.");
			}
		} while(diemLy < 0 || diemLy > 10);
		
		// Điểm hóa
		do {
			System.out.print("Nhập điểm hóa: ");
			this.diemLy = Integer.parseInt(banPhim.nextLine());
			if(diemHoa< 0 || diemHoa > 10) {
				System.out.println("Điểm không hợp lệ! Vui lòng nhập lại.");
			}
		} while(diemHoa < 0 || diemHoa > 10);
	
		banPhim.close();
	}
	public void diemTrungBinh() {
		double diemTB = (diemToan + diemLy + diemHoa) / 3;
		System.out.printf("Điểm trung bình: %1.1fđ\n", diemTB);
	}
	public void gachNgang() {
		System.out.println("------------------------------");
	}
	public void xuatThongTin() {
		System.out.println("\n----- BẢNG ĐIỂM HỌC SINH -----");
		System.out.println("Tên: " + hoTen );
		gachNgang();
		System.out.println("Tuổi: " + tuoi);
		gachNgang();
		System.out.println("Điểm Toán: " + diemToan + "đ");
		gachNgang();
		System.out.println("Điểm Lý: " + diemLy + "đ");
		gachNgang();
		System.out.println("Điểm Hóa: " + diemHoa + "đ");
		gachNgang();
		diemTrungBinh();
		gachNgang();
	}		
}