package arcade.intro._10eruptionoflight;

/**
 Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

 Example

 For st = "abcdc", the output should be
 solution(st) = "abcdcba".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string st

 A string consisting of lowercase English letters.

 Guaranteed constraints:
 3 ≤ st.length ≤ 10.

 [output] string
 */
public class BuildPalindrome {
    String solution(String st) {
        String a;
        String b;
        for (int i=0; i< st.length(); i++) {
            a = st.substring(0, i);
            b = st.substring(i);
            if (isPalindrome(b)) {
                return a + b + reverse(a);
            }
        }
        return st + reverse(st);
    }

    boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    String reverse(String s) {
        String a = "";
        for (int i=0; i<s.length(); i++) {
            a = s.charAt(i) + a;
        }
        return a;
    }
}
