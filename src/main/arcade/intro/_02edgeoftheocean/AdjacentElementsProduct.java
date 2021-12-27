package arcade.intro._02edgeoftheocean;

/**
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The largest product of adjacent elements.
 */
public class AdjacentElementsProduct {
    int solution(int[] inputArray) {
        int a = inputArray[0];
        int b = inputArray[1];
        int prod = Math.multiplyExact(a, b);
        for (int i = 0; i<inputArray.length-1; i++) {
            a = inputArray[i];
            b = inputArray[i + 1];
            int val = Math.multiplyExact(a, b);
            if (val > prod) {
                prod = val;
            }
        }
        return prod;
    }
}
