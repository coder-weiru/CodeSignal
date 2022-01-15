package arcade.thecore._03cornerof0sand1s;

/**
 You are given two numbers a and b where 0 ≤ a ≤ b. Imagine you construct an array of all the integers from a to b inclusive. You need to count the number of 1s in the binary representations of all the numbers in the array.

 Example

 For a = 2 and b = 7, the output should be
 solution(a, b) = 11.

 Given a = 2 and b = 7 the array is: [2, 3, 4, 5, 6, 7]. Converting the numbers to binary, we get [10, 11, 100, 101, 110, 111], which contains 1 + 2 + 1 + 2 + 2 + 3 = 11 1s.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer a

 Guaranteed constraints:
 0 ≤ a ≤ b.

 [input] integer b

 Guaranteed constraints:
 a ≤ b ≤ 10.

 [output] integer
 */
public class RangeBitCount {
    int solution(int a, int b) {
        String s = "";
        int ones = 0;
        for (int i=a; i<b+1; i++) {
            s = Integer.toBinaryString(i);
            for (int j=0; j<s.length(); j++) {
                if (s.charAt(j)=='1') {
                    ones ++;
                }
            }
        }
        return ones;
    }
}
