import java.io.Serializable;

public class SinhVien implements Serializable {
private String maSinhVien;
private String hoTen;
private int tuoi;
private String gioiTinh;
private String diaChi;
private double dienTrungBinh;

    public SinhVien()
    {
    }

    public SinhVien(String maSinhVien, String hoTen, int tuoi, String gioiTinh, String diaChi, double dienTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.dienTrungBinh = dienTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDienTrungBinh() {
        return dienTrungBinh;
    }

    public void setDienTrungBinh(double dienTrungBinh) {
        this.dienTrungBinh = dienTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dienTrungBinh=" + dienTrungBinh +
                '}';
    }
}
