package arcade.thecore._01introgates;

/**
 You are given a two-digit integer n. Return the sum of its digits.

 Example

 For n = 29, the output should be
 solution(n) = 11.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 A positive two-digit integer.

 Guaranteed constraints:
 10 ≤ n ≤ 99.

 [output] integer

 The sum of the first and second digits of the input number.
 */
public class AddTwoDigits {
    int solution(int n) {
        String s = ""+n;
        return Integer.valueOf(s.charAt(0)+"") + Integer.valueOf(s.charAt(1)+"");
    }
}
