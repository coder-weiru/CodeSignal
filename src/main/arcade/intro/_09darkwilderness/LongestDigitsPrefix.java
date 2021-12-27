package arcade.intro._09darkwilderness;

/**
 Given a string, output its longest prefix which contains only digits.

 Example

 For inputString = "123aa1", the output should be
 solution(inputString) = "123".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 Guaranteed constraints:
 3 ≤ inputString.length ≤ 100.

 [output] string
 */
public class LongestDigitsPrefix {
    String solution(String inputString) {
        String prefix = "";
        int n = 0;
        char a;
        while (n < inputString.length()) {
            a = inputString.charAt(n);
            if (Character.isDigit(a)) {
                prefix += a;
                n++;
            }
            else {
                break;
            }
        }
        return prefix;
    }
}
