package arcade.intro._05islandofknowledge;

import java.util.Arrays;

/**
 You are given an array of integers representing coordinates of obstacles situated on a straight line.

 Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

 Find the minimal length of the jump enough to avoid all the obstacles.

 Example

 For inputArray = [5, 3, 6, 7, 9], the output should be
 solution(inputArray) = 4.

 Check out the image below for better understanding:



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Non-empty array of positive integers.

 Guaranteed constraints:
 2 ≤ inputArray.length ≤ 1000,
 1 ≤ inputArray[i] ≤ 1000.

 [output] integer

 The desired length.
 */
public class AvoidObstacles {
    int solution(int[] inputArray) {
        int[] a = inputArray;
        Arrays.sort(a);
        for (int i=2; i<=a[a.length-1]; i++) {
            if (!hits(a, i)) {
                return i;
            }
        }
        return a[a.length-1] + 1;
    }

    boolean hits(int[] a, int val) {
        for (int i=0; i<a.length; i++) {
            if (hits(a[i], val)) {
                return true;
            }
        }
        return false;
    }

    boolean hits(int target, int val) {
        int t = val;
        while (t<=target) {
            if (t==target) {
                return true;
            }
            t += val;
        }
        return false;
    }
}
