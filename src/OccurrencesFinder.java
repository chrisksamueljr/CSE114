
import java.util.Arrays;
public class OccurencesFinder {
    public static void main(String [] args) {
        String s = "ab012fda"; 
        int [] ans = OccurencesFinder.count(s);
        for(int i =0; i< ans.length; i++) {
            System.out.println(i + "," + ans[i]);
        }}
        public static int [] count(String s) {
            int [] ans = new int [10];
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    ans[0] += 1;
                } else if (s.charAt(i) == '1') {
                    ans[1] += 1;
                } else if (s.charAt(i) == '2') { ans[2] += 1;
                } else if (s.charAt(i) == '3') {ans[3] += 1;
                } else if (s.charAt(i) == '4') {ans[4] += 1;
                } else if (s.charAt(i) == '5') {ans[5] += 1; 
                } else if (s.charAt(i) == '6') {ans[6] += 1;
                } else if (s.charAt(i) == '7') {ans[7] += 1;
                } else if (s.charAt(i) == '8') {ans[8] += 1; 
                } else if (s.charAt(i) == '9') {ans[9] += 1;
                } } 
                return ans;
            }
            public static String binaryToHex(String binaryValue) {
                int ans = Integer.parseInt(binaryValue, 2);return Integer.toHexString(ans);
            }
         
            public static String sort(String s) {String ans = "";char [] split = s.toCharArray();Arrays.sort(split);for(int i =0; i< s.length();i ++) {ans += split[i];}return ans;}
    }
}
