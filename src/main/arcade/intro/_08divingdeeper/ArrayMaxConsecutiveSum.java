package arcade.intro._08divingdeeper;

/**
 Given array of integers, find the maximal possible sum of some of its k consecutive elements.

 Example

 For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
 solution(inputArray, k) = 8.
 All possible sums of 2 consecutive elements are:

 2 + 3 = 5;
 3 + 5 = 8;
 5 + 1 = 6;
 1 + 6 = 7.
 Thus, the answer is 8.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Array of positive integers.

 Guaranteed constraints:
 3 ≤ inputArray.length ≤ 105,
 1 ≤ inputArray[i] ≤ 1000.

 [input] integer k

 An integer (not greater than the length of inputArray).

 Guaranteed constraints:
 1 ≤ k ≤ inputArray.length.

 [output] integer

 The maximal possible sum.
 */
public class ArrayMaxConsecutiveSum {
    int solution(int[] inputArray, int k) {
        int sum = 0;
        for (int j = 0; j<k; j++) {
            sum += inputArray[j];
        }
        int max = sum;
        //System.out.println("sum -> " + sum);
        for (int i=0; i < inputArray.length; i++) {
            int first =  inputArray[i];
            int last = 0;
            if (i+k<inputArray.length) {
                last = inputArray[i+k];
            }
            //System.out.println("first -> " + first + " last ->" + last);
            sum = sum - first + last;
            //System.out.println("sum -> " + sum);
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
