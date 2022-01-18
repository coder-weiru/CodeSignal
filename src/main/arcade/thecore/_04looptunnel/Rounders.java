package arcade.thecore._04looptunnel;

/**
 We want to turn the given integer into a number that has only one non-zero digit using a tail rounding approach. This means that at each step we take the last non 0 digit of the number and round it to 0 or to 10. If it's less than 5 we round it to 0 if it's larger than or equal to 5 we round it to 10 (rounding to 10 means increasing the next significant digit by 1). The process stops immediately once there is only one non-zero digit left.

 Example

 For n = 15, the output should be
 solution(n) = 20;

 For n = 1234, the output should be
 solution(n) = 1000.

 1234 -> 1230 -> 1200 -> 1000.

 For n = 1445, the output should be
 solution(n) = 2000.

 1445 -> 1450 -> 1500 -> 2000.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 A positive integer.

 Guaranteed constraints:
 1 ≤ value ≤ 108.

 [output] integer

 The rounded number.
 */
public class Rounders {
    int solution(int n) {
        int[] a = numbers(n);
        for (int i=0; i<a.length; i++) {
            if (a[i]>=5) {
                if (i<a.length-1) {
                    a[i+1] += 1;
                }
            }
        }
        int val = a[a.length-1];
        for (int j=0; j<a.length-1; j++) {
            val *= 10;
        }
        return val;
    }

    int[] numbers(int n) {
        String s = n+"";
        int len = s.length();
        int[] a = new int[len];
        for (int i=len-1; i>=0; i--) {
            a[len-i-1] = Integer.parseInt(s.charAt(i) + "");
        }
        return a;
    }
}
