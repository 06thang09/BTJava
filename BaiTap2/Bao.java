package BaiTap2;

/**
 *
 * @author nhvd2
 */
public class Bao extends TaiLieu {
    private String NgayPhatHanh;

    public Bao(String MaTaiLieu, String NhaXuatBan, int SoBanPhatHanh, String NgayPhatHanh) {
        super(MaTaiLieu, NhaXuatBan, SoBanPhatHanh);
        this.NgayPhatHanh = NgayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(String NgayPhatHanh) {
        this.NgayPhatHanh = NgayPhatHanh;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ngay phat hanh: " + NgayPhatHanh);
    }
}
