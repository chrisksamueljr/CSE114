// Lab 15 
import java.util.Arrays;
public class OccurrencesFinder {
    public static void main(String [] args) {
        String s = "ab012fda"; 
        int [] ans = OccurrencesFinder.count(s);
        for(int i =0; i< ans.length; i++) {
            System.out.println(i + "," + ans[i]);
        }}
        public static int [] count(String s) {
            int[] counts = new int[10];
            char c;
            for(int i =0; i < s.length(); i++) {
                c = s.charAt(i);
                if(c >= '0' && c <= '9') {
                    int num = (int) (c -'0');
                    counts[num]++;
                }
            }
                return counts;
            }
            public static String binaryToHex(String binaryValue) {
                int ans = Integer.parseInt(binaryValue, 2);return Integer.toHexString(ans);
            }
         
        public static String sort(String s) {
            String ans = "";
            char [] split = s.toCharArray();
            Arrays.sort(split);
            for(int i =0; i< s.length(); i ++) {
            ans += split[i];
        } return ans;
        }
    };