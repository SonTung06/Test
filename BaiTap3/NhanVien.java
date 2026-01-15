package Test.BaiTap3;

import java.util.*;

public class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected double luongCoBan;
	protected static int tongSoNhanVien = 1;

	public NhanVien() {
		this.maNV = String.format("NV%03d", tongSoNhanVien++);
	}

	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập lương cơ bản: ");
		luongCoBan = sc.nextDouble();
	}

	public void xuatTT() {
		System.out.println(toString());
	}

	public double tinhLuong() {
		return luongCoBan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}

	public String getMaNV() {
		return maNV;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public static int getTongSoNhanVien() {
		return tongSoNhanVien;
	}
	

}
