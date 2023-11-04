package Module3.sinhvien;

public class SinhVienLienKet extends SinhVien {
    private String quocTich;

    public SinhVienLienKet(String mssv, String hoTen, String diaChi, String sdt, String quocTich) {
        super(mssv, hoTen, diaChi, sdt);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return super.toString() + ", QuocTich=" + quocTich;
    }
}
