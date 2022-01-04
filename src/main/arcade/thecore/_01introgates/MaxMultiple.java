package arcade.thecore._01introgates;

/**
 Given a divisor and a bound, find the largest integer N such that:

 N is divisible by divisor.
 N is less than or equal to bound.
 N is greater than 0.
 It is guaranteed that such a number exists.

 Example

 For divisor = 3 and bound = 10, the output should be
 solution(divisor, bound) = 9.

 The largest integer divisible by 3 and not larger than 10 is 9.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer divisor

 Guaranteed constraints:
 2 ≤ divisor ≤ 10.

 [input] integer bound

 Guaranteed constraints:
 5 ≤ bound ≤ 100.

 [output] integer

 The largest integer not greater than bound that is divisible by divisor.
 */
public class MaxMultiple {
    int solution(int divisor, int bound) {
        int n = 0;
        while (n <= bound - divisor) {
            n += divisor;
        }
        return n;
    }
}
