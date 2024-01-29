package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author nhvd2
 */
public class Main {
    public static void main(String[] args) {
        QuanLySach quanlysach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Them moi tai lieu");
            System.out.println("2. Xoa tai lieu theo ma");
            System.out.println("3. Hien thi thong tin ve tai lieu");
            System.out.println("4. Tim kiem tai lieu theo loai");
            System.out.println("5. Thoat khoi chuong trinh");
            System.out.print("Vui long chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Chon loai tai lieu : ");
                    String loai = scanner.nextLine();
                    System.out.print("Nhap ma tai lieu: ");
                    String MaTaiLieu = scanner.nextLine();
                    System.out.print("Nhap ten nha xuat ban: ");
                    String NhaXuatBan = scanner.nextLine();
                    System.out.print("Nhap so ban phat hanh: ");
                    int SoBanPhatHanh = scanner.nextInt();

                    if (loai.equalsIgnoreCase("Sach")) {
                        scanner.nextLine(); 
                        System.out.print("Nhap ten tac gia: ");
                        String TenTacGia = scanner.nextLine();
                        System.out.print("Nhap so trang: ");
                        int SoTrang = scanner.nextInt();
                        System.out.println("----------------------");
                        quanlysach.ThemTaiLieu(new Sach(MaTaiLieu, NhaXuatBan, SoBanPhatHanh, TenTacGia, SoTrang));
                    } else if (loai.equalsIgnoreCase("TapChi")) {
                        System.out.print("Nhap so phat hanh: ");
                        int SoPhatHanh = scanner.nextInt();
                        System.out.print("Nhap thang phat hanh: ");
                        int ThangPhatHanh = scanner.nextInt();

                        quanlysach.ThemTaiLieu(new TapChi(MaTaiLieu, NhaXuatBan, SoBanPhatHanh, SoPhatHanh, ThangPhatHanh));
                    } else if (loai.equalsIgnoreCase("Bao")) {
                        scanner.nextLine();  
                        System.out.print("Nhap ngay phat hanh: ");
                        String NgayPhatHanh = scanner.nextLine();

                        quanlysach.ThemTaiLieu(new Bao(MaTaiLieu, NhaXuatBan, SoBanPhatHanh, NgayPhatHanh));
                    } else {
                        System.out.println("Loai tai lieu khong hop le.");
                    }
                    break;
                case 2:
                    System.out.print("Nhap ma tai lieu can xoa: ");
                    String MaXoa = scanner.nextLine();
                    quanlysach.XoaTaiLieu(MaXoa);
                    break;
                case 3:
                    System.out.println("----------------------");
                    System.out.println("DANH SACH THONG TIN VE TAI LIEU");
                    quanlysach.HienThiThongTin();
                    break;
                case 4:
                    System.out.println("----------------------");
                    System.out.print("Nhap loai tai lieu can tim kiem : ");
                    String LoaiTimKiem = scanner.nextLine();
                    quanlysach.TimKiemTheoLoai(LoaiTimKiem);
                    break;
                case 5:
                    System.out.println("----------------------");
                    System.out.println("Da thoat khoi chuong trinh.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chuc nang khong hop le.");
            }
        }
    }
}
