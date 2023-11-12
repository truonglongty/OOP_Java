package module4.bai01;

import java.util.TreeMap;

public class CauE {
    public static void main(String[] args) {
        TreeMap<Double, String> ds = new TreeMap<>();

        // Mô phỏng việc thêm khách hàng vào danh sách
        ds.put(10000.0, "Nguyễn Văn A");
        ds.put(7500.0, "Trần Thị B");
        ds.put(12000.0, "Lê Hoàng C");
        ds.put(5000.0, "Phạm Thu D");

        // In ra danh sách khách hàng theo thứ tự tăng dần doanh số
        System.out.println("Danh sách khách hàng theo thứ tự tăng dần doanh số:");
        for (Double doanhSo : ds.keySet()) {
            String tenKhachHang = ds.get(doanhSo);
            System.out.println("Tên: " + tenKhachHang + ", Doanh số: " + doanhSo);
        }
    }
}
