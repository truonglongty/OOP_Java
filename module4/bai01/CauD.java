package module4.bai01;

import java.util.ArrayList;
import java.util.Collections;

public class CauD {
    public static void main(String[] args) {
        ArrayList<String> ds = new ArrayList<>();
        Collections.addAll(ds, "Nguyễn Văn A", "Trần Thị B", "Lê Hoàng C", "Phạm Thu D");
        for(int i=0; i < ds.size(); i++) {
        	System.out.println("Ưu tiên "+(i+1)+" nhân viên "+ds.get(i));
        }
    }
}

