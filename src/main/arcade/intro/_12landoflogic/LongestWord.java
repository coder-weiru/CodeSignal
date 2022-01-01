package arcade.intro._12landoflogic;

/**
 Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

 Example

 For text = "Ready, steady, go!", the output should be
 solution(text) = "steady".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string text

 Guaranteed constraints:
 4 ≤ text.length ≤ 50.

 [output] string

 The longest word from text. It's guaranteed that there is a unique output.
 */
public class LongestWord {
    String solution(String text) {
        String w = "";
        String max = "";
        for (int i=0; i< text.length(); i++) {
            char a = text.charAt(i);
            if (Character.isAlphabetic(a)) {
                w += a;
            } else {
                w = "";
            }
            int n = w.length();
            if (n>max.length()) {
                max = w;
            }
        }
        return max;
    }
}
