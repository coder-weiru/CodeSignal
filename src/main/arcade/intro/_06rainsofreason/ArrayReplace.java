package arcade.intro._06rainsofreason;

/**
 Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.

 Example

 For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the output should be
 solution(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Guaranteed constraints:
 0 ≤ inputArray.length ≤ 104,
 0 ≤ inputArray[i] ≤ 109.

 [input] integer elemToReplace

 Guaranteed constraints:
 0 ≤ elemToReplace ≤ 109.

 [input] integer substitutionElem

 Guaranteed constraints:
 0 ≤ substitutionElem ≤ 109.

 [output] array.integer
 */
public class ArrayReplace {
    int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        int[] a = new int[inputArray.length];
        for (int i=0; i<a.length; i++) {
            if (inputArray[i]!=elemToReplace) {
                a[i] = inputArray[i];
            } else {
                a[i] = substitutionElem;
            }
        }
        return a;
    }
}
