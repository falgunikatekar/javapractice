

import java.util.HashMap;

public class frequentcharacter {
    public static void main(String[] args) {

        String str = "the cat sat on the mat and the cat slept";
        String ans = "";

        String[] arr = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String ch : arr) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }
        }

        for (String ch : map.keySet()) {
            if (map.get(ch) > 1) {
                ans += ch + " ";
            }
        }

        System.out.println(ans);
    }
}