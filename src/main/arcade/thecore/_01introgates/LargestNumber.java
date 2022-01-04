package arcade.thecore._01introgates;

/**
 Given an integer n, return the largest number that contains exactly n digits.

 Example

 For n = 2, the output should be
 solution(n) = 99.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 Guaranteed constraints:
 1 ≤ n ≤ 9.

 [output] integer

 The largest integer of length n.
 */
public class LargestNumber {
    int solution(int n) {
        String s ="";
        for (int i=0; i<n; i++) {
            s += 9;
        }
        return Integer.valueOf(s);
    }
}
