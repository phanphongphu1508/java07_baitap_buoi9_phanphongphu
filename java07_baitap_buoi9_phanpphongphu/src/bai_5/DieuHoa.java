package bai_5;
import java.util.Scanner;
public class DieuHoa extends ThietBiDien {
	private String dieuHoa = "điều hòa";
	private String congSuat;
	private String cheDoHoatDong;
	

	
	public void nhapThongTin() {
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Nhập thông tin " + dieuHoa);
		super.nhapThongTin();
		System.out.print("Nhập công xuất (1hp, 1.5hp, 2hp): ");
		this.congSuat = banPhim.nextLine();
		System.out.print("Nhập chế độ hoạt động (làm nóng, làm lạnh): ");
		this.cheDoHoatDong = banPhim.nextLine();
	}
	public void xuatThongTin() {
		System.out.println("Thông tin " + this.dieuHoa);
		super.xuatThongTin();
		System.out.println("Công suất: " + this.congSuat + "hp");
		System.out.println("Chế độ hoạt động: " + this.cheDoHoatDong);
	}
}
