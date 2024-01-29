package BaiTap2;

/**
 *
 * @author nhvd2
 */
public class TapChi extends TaiLieu {
    private int SoPhatHanh;
    private int ThangPhatHanh;

    public TapChi(String MaTaiLieu, String NhaXuatBan, int SoBanPhatHanh, int SoPhatHanh, int ThangPhatHanh) {
        super(MaTaiLieu, NhaXuatBan, SoBanPhatHanh);
        this.SoPhatHanh = SoPhatHanh;
        this.ThangPhatHanh = ThangPhatHanh;
    }

    public int getSoPhatHanh() {
        return SoPhatHanh;
    }

    public void setSoPhatHanh(int SoPhatHanh) {
        this.SoPhatHanh = SoPhatHanh;
    }

    public int getThangPhatHanh() {
        return ThangPhatHanh;
    }

    public void setThangPhatHanh(int ThangPhatHanh) {
        this.ThangPhatHanh = ThangPhatHanh;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("So phat hanh: " + SoPhatHanh);
        System.out.println("Thang phat hanh: " + ThangPhatHanh);
    }
}
