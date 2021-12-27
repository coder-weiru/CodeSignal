package arcade.intro._08divingdeeper;

import java.util.HashSet;
import java.util.Set;

/**
 Given a string, find the number of different characters in it.

 Example

 For s = "cabca", the output should be
 solution(s) = 3.

 There are 3 different characters a, b and c.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string s

 A string of lowercase English letters.

 Guaranteed constraints:
 3 ≤ s.length ≤ 1000.

 [output] integer
 */
public class DifferentSymbolsNaive {
    int solution(String s) {
        Set<Character> charset = new HashSet<>();
        for (int i = 0; i< s.length(); i++) {
            charset.add(s.charAt(i));
        }
        return charset.size();
    }
}
