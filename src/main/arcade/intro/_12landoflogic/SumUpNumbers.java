package arcade.intro._12landoflogic;

import java.util.ArrayList;
import java.util.List;

/**
 CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

 Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.

 Example

 For inputString = "2 apples, 12 oranges", the output should be
 solution(inputString) = 14.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 Guaranteed constraints:
 0 ≤ inputString.length ≤ 105.

 [output] integer
 */
public class SumUpNumbers {
    int solution(String inputString) {
        List<String> l = new ArrayList<>();
        String n = "";
        for (int i=0; i< inputString.length(); i++) {
            char a = inputString.charAt(i);
            if (Character.isDigit(a)) {
                n += a;
            } else {
                if (n.length()>0) {
                    l.add(n);
                    n = "";
                }
            }
        }
        if (n.length()>0) {
            l.add(n);
        }
        int total = 0;
        for (String s : l) {
            total += Integer.valueOf(s);
        }
        return total;
    }
}
