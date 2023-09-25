package Seminar6home;

import java.util.LinkedHashMap;
import java.util.Map;

public class SearchСonditions {
    Map<Integer, String> search0 = new LinkedHashMap<>();
    public void Search0() {
        Map<Integer, String> search0 = new LinkedHashMap<>();
        search0.put(1, "Brand");
        search0.put(2, "Color");
        search0.put(3, "processor");

        }
    
    public void printSearch0() {
        for (int i = 0; i < search0.size(); i++) {
        System.out.println(search0.get(i));
    }
        
    }
}
