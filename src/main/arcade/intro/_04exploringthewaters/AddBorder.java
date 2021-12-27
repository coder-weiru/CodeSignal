package arcade.intro._04exploringthewaters;

import java.util.ArrayList;
import java.util.List;

/**
 Given a rectangular matrix of characters, add a border of asterisks(*) to it.

 Example

 For

 picture = ["abc",
 "ded"]
 the output should be

 solution(picture) = ["*****",
 "*abc*",
 "*ded*",
 "*****"]
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.string picture

 A non-empty array of non-empty equal-length strings.

 Guaranteed constraints:
 1 ≤ picture.length ≤ 100,
 1 ≤ picture[i].length ≤ 100.

 [output] array.string

 The same matrix of characters, framed with a border of asterisks of width 1.
 */
public class AddBorder {
    String[] solution(String[] picture) {
        List<String> r = new ArrayList();
        for (String s : picture) {
            r.add("*" + s + "*");
        }
        String a = "";
        for (int i =0; i< picture[0].length()+2; i++) {
            a += "*";
        }
        r.add(0, a);
        r.add(a);
        return r.toArray(new String[r.size()]);
    }
}
