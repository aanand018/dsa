package Array_coding_for_interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedWords {
    public static void main(String[] args) {


        String words = "shdgysfdf";
        // { "anna" , "sjhdg" , "khdff, }
        int count = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < words.length(); i++) {
            char word = words.charAt(i);
            if(!map.containsKey(word)) {
                map.put(word, 1);
            }
            else {
                map.put(word, map.get(word) + 1);

            }

        }

        for(Map.Entry<Character,Integer> m : map.entrySet() ){
            System.out.println(m.getKey() + "=" + m.getValue());
        }
    }
}
