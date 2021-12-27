package arcade.intro._06rainsofreason;

/**
 Check if all digits of the given integer are even.

 Example

 For n = 248622, the output should be
 solution(n) = true;
 For n = 642386, the output should be
 solution(n) = false.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 Guaranteed constraints:
 1 ≤ n ≤ 109.

 [output] boolean

 true if all digits of n are even, false otherwise.
 */
public class EvenDigitsOnly {
    boolean solution(int n) {
        String s = "" + n;
        boolean b = true;
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            int a = Integer.valueOf(c).intValue();
            if (a % 2==1) {
                b = false;
                break;
            }
        }
        return b;
    }
}
