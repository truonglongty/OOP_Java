package module4.bai01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CauB {
    public static void main(String[] args) {
        ArrayList<String> tenNV = new ArrayList<>();
        Collections.addAll(tenNV, "A","B","C","A");
        HashSet<String> tenSP = new HashSet<>(tenNV);
        for(String x : tenSP) {
        	System.out.println("Tên sản phẩm: "+x);
        }
    }
}
