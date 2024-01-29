package BaiTap2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nhvd2
 */
public class QuanLySach {
    public List<TaiLieu> DanhSachTaiLieu = new ArrayList<>();

    public void ThemTaiLieu(TaiLieu tailieu) {
        DanhSachTaiLieu.add(tailieu);
        System.out.println("Da them moi tai lieu.");
        System.out.println("----------------------");
    }

    public void XoaTaiLieu(String MaTaiLieu) {
        Iterator<TaiLieu> iterator = DanhSachTaiLieu.iterator();
        while (iterator.hasNext()) {
            TaiLieu tailieu = iterator.next();
            if (tailieu.getMaTaiLieu().equals(MaTaiLieu)) {
                iterator.remove();
                System.out.println("Da xoa tai lieu co ma: " + MaTaiLieu);
                System.out.println("----------------------");
                return;
            }
        }
        System.out.println("Khong tim thay tai lieu co ma: " + MaTaiLieu);
    }

    public void HienThiThongTin() {
        for (TaiLieu tailieu : DanhSachTaiLieu) {
            tailieu.displayInfo();
            System.out.println("-------------------------");
        }
    }

    public void TimKiemTheoLoai(String loai) {
        for (TaiLieu tailieu : DanhSachTaiLieu) {
            if (tailieu instanceof Sach && loai.equalsIgnoreCase("Sach")) {
                tailieu.displayInfo();
                System.out.println("-------------------------");
            } else if (tailieu instanceof TapChi && loai.equalsIgnoreCase("TapChi")) {
                tailieu.displayInfo();
                System.out.println("-------------------------");
            } else if (tailieu instanceof Bao && loai.equalsIgnoreCase("Bao")) {
                tailieu.displayInfo();
                System.out.println("-------------------------");
            }
        }
    }
}
