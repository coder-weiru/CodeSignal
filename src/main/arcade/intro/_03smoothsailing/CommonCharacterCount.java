package arcade.intro._03smoothsailing;

import java.util.HashMap;
import java.util.Map;

/**
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (java)

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer
 */
public class CommonCharacterCount {
    int solution(String s1, String s2) {
        Map<Character, Integer> m1 = toMap(s1);
        Map<Character, Integer> m2 = toMap(s2);
        int total = 0;
        for (Character c : m1.keySet()) {
            Integer cnt1 = m1.get(c);
            Integer cnt2 = m2.get(c);
            if (cnt2!=null) {
                if (cnt1<cnt2) {
                    total += cnt1;
                } else {
                    total += cnt2;
                }
            }
        }
        return total;
    }

    Map<Character, Integer> toMap(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if (!m.containsKey(c)) {
                m.put(c, 1);
            }
            else {
                m.put(c, m.get(c) + 1);
            }
        }
        return m;
    }
}
