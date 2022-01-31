package arcade.thecore._06labyrinthofnestedloops;

/**
 Find the number of ways to express n as sum of some (at least two) consecutive positive integers.

 Example

 For n = 9, the output should be
 solution(n) = 2.

 There are two ways to represent n = 9: 2 + 3 + 4 = 9 and 4 + 5 = 9.

 For n = 8, the output should be
 solution(n) = 0.

 There are no ways to represent n = 8.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 A positive integer.

 Guaranteed constraints:
 1 ≤ n ≤ 104.

 [output] integer
 */
public class IsSumOfConsecutive {
    int solution(int n) {
        int c = 0;
        for (int i=1; i<n; i++) {
            int k = i;
            for (int j=1; j<n-i; j++) {
                k += i + j;
                if (n==k) {
                    c++;
                    break;
                } else if (k>n) {
                    break;
                }
            }
        }
        return c;
    }
}
