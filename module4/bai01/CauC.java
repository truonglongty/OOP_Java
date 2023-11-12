package module4.bai01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CauC {
    public static void main(String[] args) {
        ArrayList<String> tenNV = new ArrayList<String>();
        Collections.addAll(tenNV, "A", "B", "C", "A", "B", "C", "A", "D");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (String name : tenNV) {
            if (hm.containsKey(name)) {
                int count = hm.get(name);
                hm.put(name, count + 1);
            } 
            else 
                hm.put(name, 1);
        }
        System.out.println("Tên sản phẩm: " + timTenPhoBien(hm));
    }

    public static String timTenPhoBien(HashMap<String, Integer> nameCount) {
        String ten = "";
        int maxCount = 0;

        for (HashMap.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                ten = entry.getKey();
            }
        }

        return ten;
    }
}
