package arcade.intro._03smoothsailing;

import java.util.Stack;

/**
 Write a function that reverses characters in (possibly nested) parentheses in the input string.

 Input strings will always be well-formed with matching ()s.

 Example

 For inputString = "(bar)", the output should be
 solution(inputString) = "rab";
 For inputString = "foo(bar)baz", the output should be
 solution(inputString) = "foorabbaz";
 For inputString = "foo(bar)baz(blim)", the output should be
 solution(inputString) = "foorabbazmilb";
 For inputString = "foo(bar(baz))blim", the output should be
 solution(inputString) = "foobazrabblim".
 Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in inputString form a regular bracket sequence.

 Guaranteed constraints:
 0 ≤ inputString.length ≤ 50.

 [output] string

 Return inputString, with all the characters that were in parentheses reversed.
 */
public class ReverseInParentheses {
    String solution(String inputString) {
        Stack<Integer> stack = new Stack<>();
        String s = inputString;

        System.out.println(" inputString : " + s);

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='(') {
                System.out.println(" pushing : " + i);
                stack.push(i);
            }
            else if (s.charAt(i)==')') {
                System.out.println(" stack-> : " + stack);

                int start = stack.peek();
                String a = s.substring(start, i+1);
                String b = reverse(a);

                System.out.println(" b-> : " + b);

                s = s.substring(0, start) + b + s.substring(i+1);

                System.out.println(" s-> : " + s);

                System.out.println(" popping ! " + stack);
                stack.pop();
            }
        }
        return cleanup(s);
    }

    String cleanup(String s) {
        String a = s.replace(")", "");
        a = a.replace("(", "");
        return a;
    }

    String reverse(String s) {
        if (s==null) {
            return s;
        }
        String b = "";
        for (int i=s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            if (c=='(') {
                c = ')';
            } else if (c== ')'){
                c = '(';
            }
            b += c;
        }
        return b;
    }
}
