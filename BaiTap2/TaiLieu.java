package BaiTap2;

/**
 *
 * @author nhvd2
 */
public class TaiLieu {
    private String MaTaiLieu;
    private String NhaXuatBan;
    private int SoBanPhatHanh;

    public TaiLieu(String MaTaiLieu, String NhaXuatBan, int SoBanPhatHanh) {
        this.MaTaiLieu = MaTaiLieu;
        this.NhaXuatBan = NhaXuatBan;
        this.SoBanPhatHanh = SoBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return MaTaiLieu;
    }

    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public void setNhaXuatBan(String NhaXuatBan) {
        this.NhaXuatBan = NhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return SoBanPhatHanh;
    }

    public void setSoBanPhatHanh(int SoBanPhatHanh) {
        this.SoBanPhatHanh = SoBanPhatHanh;
    }

    public void displayInfo() {
        System.out.println("Ma tai lieu: " + MaTaiLieu);
        System.out.println("Nha xuat ban: " + NhaXuatBan);
        System.out.println("So ban phat hanh: " + SoBanPhatHanh);
    }
}
