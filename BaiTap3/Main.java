package Test.BaiTap3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		NhanVien[] ds = null;
		int n = 0;
		int choice;

		do {
			System.out.println("========== MENU ==========");
			System.out.println("1. Thêm nhân viên");
			System.out.println("2. Hiển thị danh sách nhân viên");
			System.out.println("3. Tính tổng lương công ty");
			System.out.println("4. Tìm nhân viên có lương cao nhất");
			System.out.println("5. Hiển thị tổng số nhân viên");
			System.out.println("0. Thoát");
			System.out.println("==========================");
			System.out.print("Chọn chức năng: ");
			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {

			case 1:
				System.out.print("Nhập số nhân viên: ");
				n = Integer.parseInt(sc.nextLine());
				ds = new NhanVien[n];

				for (int i = 0; i < n; i++) {
					System.out.print("Chọn loại: 1-Văn phòng or 2-Sản xuất: ");
					int loai = Integer.parseInt(sc.nextLine());

					if (loai == 1)
						ds[i] = new NhanVienVanPhong();
					else
						ds[i] = new NhanVienSanXuat();

					ds[i].nhapTT();
				}
				break;

			case 2:
				for (int i = 0; i < n; i++) {
					ds[i].xuatTT();
				}
				break;
			case 3:
				if (ds == null)
					break;
				double tongLuong = 0;
				for (int i = 0; i < n; i++) {
					tongLuong += ds[i].tinhLuong();
				}
				System.out.println("Tổng lương công ty: " + tongLuong);
				break;

			case 4:
				if (ds == null)
					break;
				int max = 0;
				for (int i = 1; i < n; i++) {
					if (ds[i].tinhLuong() > ds[max].tinhLuong()) {
						max = i;
					}
				}
				System.out.println("Nhân viên có lương cao nhất:");
				ds[max].xuatTT();
				break;

			case 5:
				System.out.println("Tổng số nhân viên: " + NhanVien.getTongSoNhanVien());
				break;

			case 0:
				System.out.println("Thoát chương trình");
				break;

			default:
				System.out.println("Chọn sai");
			}

		} while (choice != 0);
	}
}
