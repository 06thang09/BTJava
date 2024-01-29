package BaiTap2;

/**
 *
 * @author nhvd2
 */
public class Sach extends TaiLieu {
    private String TenTacGia;
    private int SoTrang;

    public Sach(String MaTaiLieu, String NhaXuatBan, int SoBanPhatHanh, String TenTacGia, int SoTrang) {
        super(MaTaiLieu, NhaXuatBan, SoBanPhatHanh);
        this.TenTacGia = TenTacGia;
        this.SoTrang = SoTrang;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ten tac gia: " + TenTacGia);
        System.out.println("So trang: " + SoTrang);
    }
}
