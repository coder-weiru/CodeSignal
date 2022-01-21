package arcade.thecore._05listforestedge;

/**
 Remove a part of a given array between given 0-based indexes l and r (inclusive).

 Example

 For inputArray = [2, 3, 2, 3, 4, 5], l = 2, and r = 4, the output should be
 solution(inputArray, l, r) = [2, 3, 5].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Guaranteed constraints:
 2 ≤ inputArray.length ≤ 104,
 -105 ≤ inputArray[i] ≤ 105.

 [input] integer l

 Left index of the part to be removed (0-based).

 Guaranteed constraints:
 0 ≤ l ≤ r.

 [input] integer r

 Right index of the part to be removed (0-based).

 Guaranteed constraints:
 l ≤ r < inputArray.length.

 [output] array.integer
 */
public class RemoveArrayPart {
    int[] solution(int[] inputArray, int l, int r) {
        int[] c = new int[inputArray.length-r+l-1];
        System.arraycopy(inputArray, 0, c, 0, l);
        System.arraycopy(inputArray, r+1, c, l, inputArray.length-r-1);
        return c;
    }
}
