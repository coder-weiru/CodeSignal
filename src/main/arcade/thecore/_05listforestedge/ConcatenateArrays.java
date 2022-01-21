package arcade.thecore._05listforestedge;

/**
 Given two arrays of integers a and b, obtain the array formed by the elements of a followed by the elements of b.

 Example

 For a = [2, 2, 1] and b = [10, 11], the output should be
 solution(a, b) = [2, 2, 1, 10, 11].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer a

 Guaranteed constraints:
 1 ≤ a.length ≤ 10,
 1 ≤ a[i] ≤ 15.

 [input] array.integer b

 Guaranteed constraints:
 0 ≤ b.length ≤ 10,
 1 ≤ b[i] ≤ 15.

 [output] array.integer
 */
public class ConcatenateArrays {
    int[] solution(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }
}
