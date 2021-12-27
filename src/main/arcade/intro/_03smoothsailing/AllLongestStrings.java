package arcade.intro._03smoothsailing;

import java.util.ArrayList;
import java.util.List;

/**
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.
 */
public class AllLongestStrings {
    String[] solution(String[] inputArray) {
        List<String> list = new ArrayList();
        int len = 0;
        for (int i=0; i< inputArray.length; i++) {
            if (inputArray[i].length()>len) {
                len = inputArray[i].length();
                list.clear();
            }
            if (len==inputArray[i].length()) {
                list.add(inputArray[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
