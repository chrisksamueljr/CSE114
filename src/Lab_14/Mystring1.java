
package Lab_14;

public class Mystring1 {
    public static void main(String[] args) {
        char[] hi = new char[] { 'h', 'i', 'h' };
        Mystring1 obj = new Mystring1(hi);
        System.out.println(obj.charAt(0));
        Mystring1 sub = obj.substring(0, 1);
        System.out.println(sub.toString());
        char[] HI = new char[] { 'H', 'I' };
        Mystring1 lower = new Mystring1(HI);
        System.out.println(lower.toString());
        lower = lower.toLowerCase();
        System.out.println(lower.toString());
        Mystring1 obj2 = new Mystring1(hi);
        System.out.println(obj.equals(obj2));
        System.out.println(Mystring1.valueOf(100));
        Mystring1[] objs = obj.split("i");
        System.out.println(objs.length);
    }

    String word = "";
    int length = 0;

    public Mystring1(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            word += chars[i];
            length++;
        }
    }

    public char charAt(int index) {
        char charAt;
        if (index < word.length()) {
            return word.charAt(index);
        } else {
            return 0;
        }
    }

    public int length() {
        return length;
    }

    public Mystring1 substring(int begin, int end) {
        String temp = "";
        for (int i = begin; i <= end; i++) {
            temp += word.charAt(i);
        }
        char[] chars = temp.toCharArray();
        Mystring1 sub = new Mystring1(chars);
        return sub;
    }

    public Mystring1 toLowerCase() {
        String temp = word.toLowerCase();
        Mystring1 lower = new Mystring1(temp.toCharArray());
        return lower;
    }

    public boolean equals(Mystring1 s) {
        if (s.length() != word.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static Mystring1 valueOf(int i) {
        String num = Integer.toString(i);
        Mystring1 number = new Mystring1(num.toCharArray());
        return number;
    }

    public Mystring1[] split(String s) {
        String[] spl = word.split(s);
        Mystring1[] sp = new Mystring1[spl.length];
        for (int i = 0; i < spl.length; i++) {
            Mystring1 letter = new Mystring1(spl[i].toCharArray());
            sp[i] = letter;
        }
        return sp;
    }
    public String toString() {
        return word;
    }


}