package Test.BaiTap3;
import java.util.*;
public class NhanVienVanPhong extends NhanVien {
	private int soNgayCong;

	@Override
	public void nhapTT() {
		super.nhapTT();

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số ngày công: ");
		soNgayCong = sc.nextInt();
	}

	@Override
	public double tinhLuong() {
		return luongCoBan + soNgayCong * 180000;
	}

}
