package Test.BaiTap3;
import java.util.*;
public class NhanVienSanXuat extends NhanVien {
	private int soSanPham;
	@Override
	public void nhapTT() {
		super.nhapTT();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số sản phẩm: ");
		soSanPham = sc.nextInt();
	}
	@Override
	public double tinhLuong() {
		return luongCoBan + soSanPham * 25000;		
	}
}
