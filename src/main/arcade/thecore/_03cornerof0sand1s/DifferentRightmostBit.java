package arcade.thecore._03cornerof0sand1s;

import java.util.stream.IntStream;

/**
 Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
 You're given two integers, n and m. Find position of the rightmost bit in which they differ in their binary representations (it is guaranteed that such a bit exists), counting from right to left.

 Return the value of 2position_of_the_found_bit (0-based).

 Example

 For n = 11 and m = 13, the output should be
 solution(n, m) = 2.

 1110 = 10112, 1310 = 11012, the rightmost bit in which they differ is the bit at position 1 (0-based) from the right in the binary representations.
 So the answer is 21 = 2.

 For n = 7 and m = 23, the output should be
 solution(n, m) = 16.

 710 = 1112, 2310 = 101112, i.e.

 00111
 10111
 So the answer is 24 = 16.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 Guaranteed constraints:
 0 ≤ n ≤ 230.

 [input] integer m

 Guaranteed constraints:
 0 ≤ m ≤ 230,
 n ≠ m.

 [output] integer
 */

public class DifferentRightmostBit {
    int solution(int n, int m) {
        return 1 << IntStream.range(0, 32).mapToObj(i -> {
            String sN = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
            String sM = String.format("%32s", Integer.toBinaryString(m)).replace(' ', '0');
            if (sN.charAt(31-i)!=sM.charAt(31-i)) {
                return i;
            } else {
                return 32;
            }
        }).reduce(32, (a, b) -> a < b? a:b);
    }
}
