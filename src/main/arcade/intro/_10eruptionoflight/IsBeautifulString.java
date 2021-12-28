package arcade.intro._10eruptionoflight;

/**
 A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string; ie: b occurs no more times than a; c occurs no more times than b; etc. Note that letter a has no previous letter.

 Given a string, check whether it is beautiful.

 Example

 For inputString = "bbbaacdafe", the output should be solution(inputString) = true.

 This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other letter), so since there aren't any letters that appear more frequently than the previous letter, this string qualifies as beautiful.

 For inputString = "aabbb", the output should be solution(inputString) = false.

 Since there are more bs than as, this string is not beautiful.

 For inputString = "bbc", the output should be solution(inputString) = false.

 Although there are more bs than cs, this string is not beautiful because there are no as, so therefore there are more bs than as.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A string of lowercase English letters.

 Guaranteed constraints:
 3 ≤ inputString.length ≤ 50.

 [output] boolean

 Return true if the string is beautiful, false otherwise.
 */
public class IsBeautifulString {
    boolean solution(String inputString) {
        char[] alphabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i=1; i<alphabet.length; i++) {
            int curr = 0;
            int prev = 0;
            char a = '0';
            for (int j=0; j<inputString.length(); j++) {
                a = inputString.charAt(j);
                if (alphabet[i]==a) {
                    curr ++;
                }
                else if (alphabet[i-1]==a) {
                    prev ++;
                }
            }
            //System.out.println("a -> " + a + " curr -> " + curr + " prev -> " + prev);
            if (curr > prev) {
                return false;
            }
        }
        return true;
    }
}
