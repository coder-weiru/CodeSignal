package arcade.thecore._06labyrinthofnestedloops;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 Let's say that number a feels comfortable with number b if a ≠ b and b lies in the segment [a - s(a), a + s(a)], where s(x) is the sum of x's digits.

 How many pairs (a, b) are there, such that a < b, both a and b lie on the segment [l, r], and each number feels comfortable with the other (so a feels comfortable with b and b feels comfortable with a)?

 Example

 For l = 10 and r = 12, the output should be
 solution(l, r) = 2.

 Here are all values of s(x) to consider:

 s(10) = 1, so 10 is comfortable with 9 and 11;
 s(11) = 2, so 11 is comfortable with 9, 10, 12 and 13;
 s(12) = 3, so 12 is comfortable with 9, 10, 11, 13, 14 and 15.
 Thus, there are 2 pairs of numbers comfortable with each other within the segment [10; 12]: (10, 11) and (11, 12).

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer l

 Guaranteed constraints:
 1 ≤ l ≤ r ≤ 1000.

 [input] integer r

 Guaranteed constraints:
 1 ≤ l ≤ r ≤ 1000.

 [output] integer

 The number of pairs satisfying all the above conditions.
 */
public class ComfortableNumbers {
    int solution(int l, int r) {
        Map<Integer, List<Integer>> map = IntStream.range(l, r + 1).boxed()
                .collect(Collectors.toMap(Function.identity(), i -> comfortable(i, l, r)));

        List<String> pairs = map.entrySet().stream().flatMap(entry -> {
            int a = entry.getKey();
            List<Integer> arr = entry.getValue();
            return arr.stream().filter(k -> map.get(k).contains(a)).map(p -> a + ":" + p);
        }).collect(Collectors.toList());

        return pairs.size() / 2;
    }

    List<Integer> comfortable(int a, int l, int r) {
        String s = ("" + a);
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n += Integer.valueOf(s.charAt(i) + "");
        }
        List<Integer> list = new ArrayList<>();
        for (int j = -n; j <= n; j++) {
            if (j == 0) {
                continue;
            }
            if (a + j >= l && a + j <= r) {
                list.add(a + j);
            }
        }
        return list;
    }
}
