package arcade.thecore._05listforestedge;

/**
 Given an integer size, return array of length size filled with 1s.

 Example

 For size = 4, the output should be
 solution(size) = [1, 1, 1, 1].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer size

 A positive integer.

 Guaranteed constraints:
 1 ≤ size ≤ 1000.

 [output] array.integer
 */
public class CreateArray {
    int[] solution(int size) {
        int[] a = new int[size];
        for (int i=0; i<size; i++) {
            a[i] = 1;
        }
        return a;
    }
}
