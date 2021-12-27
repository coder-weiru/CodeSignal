package arcade.intro._05islandofknowledge;

/**
 Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

 Example

 For inputArray = [2, 4, 1, 0], the output should be
 solution(inputArray) = 3.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Guaranteed constraints:
 3 ≤ inputArray.length ≤ 10,
 -15 ≤ inputArray[i] ≤ 15.

 [output] integer

 The maximal absolute difference.
 */
public class ArrayMaximalAdjacentDifference {
    int solution(int[] inputArray) {
        int val = 0;
        for (int i=1; i<inputArray.length; i++) {
            int v = Math.abs(inputArray[i]-inputArray[i-1]);
            if (val<v) {
                val = v;
            }
        }
        return val;
    }
}
