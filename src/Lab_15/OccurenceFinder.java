package Lab_15;


import java.util.Arrays;

public class OccurenceFinder {
	
    public static void main(String [] args) {
        String s = "hello world"; 
        int [] ans = OccurenceFinder.count(s);
        System.out.println(OccurenceFinder.sort(s));
        // for(int i =0; i< ans.length; i++) {
        //     System.out.println(i + "," + ans[i]);
        // }
    //    System.out.println(OccurenceFinder.binaryToHex("1111"));
    
    }
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
                } 
                } 
                return ans;
            }
            public static String binaryToHex(String binaryValue) {
                int ans = Integer.parseInt(binaryValue, 2);
                
                
                return Integer.toHexString(ans);
            }
         
			public static String sort(String s) {
				String ans = "";
				char [] split = s.toCharArray();
                // Arrays.sort(split);
				for(int i = 0; i < s.length(); i++) {
					for(int k = i+1; k < s.length(); k++) {
						if(split[k] > split[k+1]) {
							char temp = split[k];
							split[k] = split[k+1];
							split[k+1] = temp;
						}
					}
				}
				for(int i =0; i < s.length(); i++) {
					ans += split[i];
				}
				return ans;
				}
			}
    


