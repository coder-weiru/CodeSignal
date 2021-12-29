package arcade.intro._11rainbowofclarity;

/**
 Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

 Example

 For n = 152, the output should be
 solution(n) = 52;
 For n = 1001, the output should be
 solution(n) = 101.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 Guaranteed constraints:
 10 ≤ n ≤ 106.

 [output] integer
 */
public class DeleteDigit {
    int solution(int n) {
        String s = "" + n;
        int a = 0;
        for (int i=0; i<s.length(); i++) {
            int b = Integer.valueOf(s.substring(0, i) + s.substring(i+1));
            if (a<b) {
                a = b;
            }
        }
        return a;
    }
}
