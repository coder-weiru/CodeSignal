package arcade.thecore._06labyrinthofnestedloops;

/**
 Determine if the given number is a power of some non-negative integer.

 Example

 For n = 125, the output should be
 solution(n) = true;
 For n = 72, the output should be
 solution(n) = false.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 A positive integer.

 Guaranteed constraints:
 1 ≤ n ≤ 400.

 [output] boolean

 true if n can be represented in the form ab (a to the power of b) where a and b are some non-negative integers and b ≥ 2, false otherwise.
 */
public class IsPower {
    boolean solution(int n) {
        for (double i=1; i<=n; i++) {
            for (double j=2; j<10; j++) {
                if (Math.pow(i, j)==n) {
                    return true;
                }
            }
        }
        return false;
    }
}
