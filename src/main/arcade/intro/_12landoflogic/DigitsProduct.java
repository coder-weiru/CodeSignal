package arcade.intro._12landoflogic;

/**
 Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to product. If there is no such integer, return -1 instead.

 Example

 For product = 12, the output should be
 solution(product) = 26;
 For product = 19, the output should be
 solution(product) = -1.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer product

 Guaranteed constraints:
 0 ≤ product ≤ 600.

 [output] integer
 */
public class DigitsProduct {
    int solution(int product) {
        if (product==0) {
            return 10;
        }
        if (product==1) {
            return 1;
        }
        for (int i=1; i<product * product; i++) {
            int a = 1;
            String s = "" + i;
            for (int j=0; j<s.length(); j++) {
                a *= Integer.valueOf(""+s.charAt(j));
                if (a==product) {
                    return i;
                }
            }
        }
        return -1;
    }
}
