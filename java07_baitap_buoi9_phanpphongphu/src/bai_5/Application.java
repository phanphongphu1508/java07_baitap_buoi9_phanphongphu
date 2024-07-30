package bai_5;

public class Application {

	public static void main(String[] args) {
		DieuHoa dieuHoa = new DieuHoa();
		MaySay maySay = new MaySay();
		
		dieuHoa.nhapThongTin();
		System.out.println();
		maySay.nhapThongTin();
		System.out.println();
		dieuHoa.xuatThongTin();
		System.out.println();
		maySay.xuatThongTin();

	}

}
