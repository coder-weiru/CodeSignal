package arcade.thecore._03cornerof0sand1s;

/**
 Reverse the order of the bits in a given integer.

 Example

 For a = 97, the output should be
 solution(a) = 67.

 97 equals to 1100001 in binary, which is 1000011 after mirroring, and that is 67 in base 10.

 For a = 8, the output should be
 solution(a) = 1.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer a

 Guaranteed constraints:
 5 ≤ a ≤ 105.

 [output] integer
 */
public class MirrorBits {
    int solution(int a) {
        String s = Integer.toBinaryString(a);
        String r = "";
        for (int i=0; i<s.length(); i++) {
            r = s.charAt(i) + r;
        }
        return Integer.parseInt(r, 2);
    }
}
