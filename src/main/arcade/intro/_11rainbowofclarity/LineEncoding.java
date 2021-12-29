package arcade.intro._11rainbowofclarity;

/**
 Given a string, return its encoding defined as follows:

 First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
 for example, "aabbbc" is divided into ["aa", "bbb", "c"]
 Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
 for example, substring "bbb" is replaced by "3b"
 Finally, all the new strings are concatenated together in the same order and a new string is returned.
 Example

 For s = "aabbbc", the output should be
 solution(s) = "2a3bc".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string s

 String consisting of lowercase English letters.

 Guaranteed constraints:
 4 ≤ s.length ≤ 15.

 [output] string

 Encoded version of s.
 */
public class LineEncoding {
    String solution(String s) {
        String r = "";
        char c = s.charAt(0);
        int n = 1;
        for (int i=1; i<s.length(); i++) {
            if (c==s.charAt(i)) {
                n ++;
            } else {
                r += n>1? (n + "" + c):"" + c;
                c = s.charAt(i);
                n = 1;
            }
        }
        r += n>1? (n + "" + c):"" + c;
        return r;
    }
}
