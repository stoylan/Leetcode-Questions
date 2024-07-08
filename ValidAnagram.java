import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[254];

        for (int i=0;i<s.length();i++) {
            count[s.charAt(i)] += 1;
            count[t.charAt(i)] -= 1;
        }

        for (int x : count) {
            if (x!= 0) {
                return false;
            }
        }

        return true;
    }

}
