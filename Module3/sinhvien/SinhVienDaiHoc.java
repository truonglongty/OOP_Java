package Module3.sinhvien;

public class SinhVienDaiHoc extends SinhVien {
    private String chuyenNganh;

    public SinhVienDaiHoc(String mssv, String hoTen, String diaChi, String sdt, String chuyenNganh) {
        super(mssv, hoTen, diaChi, sdt);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return super.toString() + ", ChuyenNganh=" + chuyenNganh;
    }
}
