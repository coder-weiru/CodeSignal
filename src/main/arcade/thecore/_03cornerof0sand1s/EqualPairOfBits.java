package arcade.thecore._03cornerof0sand1s;

import java.util.stream.IntStream;

/**
 Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
 You're given two integers, n and m. Find position of the rightmost pair of equal bits in their binary representations (it is guaranteed that such a pair exists), counting from right to left.

 Return the value of 2position_of_the_found_pair (0-based).

 Example

 For n = 10 and m = 11, the output should be
 solution(n, m) = 2.

 1010 = 10102, 1110 = 10112, the position of the rightmost pair of equal bits is the bit at position 1 (0-based) from the right in the binary representations.
 So the answer is 21 = 2.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 Guaranteed constraints:
 0 ≤ n ≤ 230.

 [input] integer m

 Guaranteed constraints:
 0 ≤ m ≤ 230.

 [output] integer
 */
public class EqualPairOfBits {
    int solution(int n, int m) {
        return 1 << IntStream.range(0, 32).mapToObj(i -> {
            String sN = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
            String sM = String.format("%32s", Integer.toBinaryString(m)).replace(' ', '0');
            System.out.println("sN ->"  + sN);
            System.out.println("sM ->"  + sM);
            if (sN.charAt(31-i)==sM.charAt(31-i)) {
                return i;
            } else {
                return 32;
            }
        }).reduce(32, (a, b) -> a < b? a:b);
    }
}
