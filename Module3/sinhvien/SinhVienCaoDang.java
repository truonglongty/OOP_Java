package Module3.sinhvien;

public class SinhVienCaoDang extends SinhVien {
    private String chuyenNganh;

    public SinhVienCaoDang(String mssv, String hoTen, String diaChi, String sdt, String chuyenNganh) {
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

