package arcade.intro._04exploringthewaters;

import java.util.HashMap;
import java.util.Map;

/**
 Given a string, find out if its characters can be rearranged to form a palindrome.

 Example

 For inputString = "aabb", the output should be
 solution(inputString) = true.

 We can rearrange "aabb" to make "abba", which is a palindrome.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A string consisting of lowercase English letters.

 Guaranteed constraints:
 1 ≤ inputString.length ≤ 50.

 [output] boolean

 true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
 */
public class PalindromeRearranging {
    boolean solution(String inputString) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i=0; i<inputString.length(); i++) {
            Character c = inputString.charAt(i);
            if (m.get(c)==null) {
                m.put(c, 1);
            } else {
                m.put(c, m.get(c) + 1);
            }
        }
        int cnt = 0;
        for (Integer a : m.values()) {
            if (a % 2==1) {
                cnt ++;
            }
        }
        return cnt <= 1;
    }
}
