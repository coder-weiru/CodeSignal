package arcade.intro._06rainsofreason;

/**
 Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

 Example

 For inputString = "crazy", the output should be solution(inputString) = "dsbaz".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A non-empty string consisting of lowercase English characters.

 Guaranteed constraints:
 1 ≤ inputString.length ≤ 1000.

 [output] string

 The resulting string after replacing each of its characters.
 */
public class AlphabeticShift {
    String solution(String inputString) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String a = "";
        for (int i=0; i<inputString.length(); i++) {
            char c = inputString.charAt(i);
            int pos = alpha.indexOf(String.valueOf(c).toLowerCase());
            if (pos==alpha.length()-1) {
                pos = 0;
            } else {
                pos += 1;
            }
            a += alpha.charAt(pos);
        }
        return a;
    }
}
