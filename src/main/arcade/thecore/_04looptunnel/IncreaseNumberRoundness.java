package arcade.thecore._04looptunnel;

/**
 Define an integer's roundness as the number of trailing zeroes in it.

 Given an integer n, check if it's possible to increase n's roundness by swapping some pair of its digits.

 Example

 For n = 902200100, the output should be
 solution(n) = true.

 One of the possible ways to increase roundness of n is to swap digit 1 with digit 0 preceding it: roundness of 902201000 is 3, and roundness of n is 2.

 For instance, one may swap the leftmost 0 with 1.

 For n = 11000, the output should be
 solution(n) = false.

 Roundness of n is 3, and there is no way to increase it.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 A positive integer.

 Guaranteed constraints:
 100 ≤ n ≤ 109.

 [output] boolean

 true if it's possible to increase n's roundness, false otherwise.
 */
public class IncreaseNumberRoundness {
    boolean solution(int n) {
        String s = n+"";
        int m = 0;
        int k = 0;
        for (int i=s.length()-1; i>=0; i--) {
            int a = Integer.parseInt(s.charAt(i) + "");
            if (a>0 && k==0) {
                k = 1;
            } else if (a==0 && k==1) {
                m++;
            }
        }
        return m > 0;
    }
}
