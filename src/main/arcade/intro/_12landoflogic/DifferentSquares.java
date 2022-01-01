package arcade.intro._12landoflogic;

import java.util.HashSet;
import java.util.Set;

/**
 Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

 Example

 For

 matrix = [[1, 2, 1],
 [2, 2, 2],
 [2, 2, 2],
 [1, 2, 3],
 [2, 2, 1]]
 the output should be
 solution(matrix) = 6.

 Here are all 6 different 2 × 2 squares:

 1 2
 2 2
 2 1
 2 2
 2 2
 2 2
 2 2
 1 2
 2 2
 2 3
 2 3
 2 1
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.array.integer matrix

 Guaranteed constraints:
 1 ≤ matrix.length ≤ 100,
 1 ≤ matrix[i].length ≤ 100,
 0 ≤ matrix[i][j] ≤ 9.

 [output] integer

 The number of different 2 × 2 squares in matrix.
 */
public class DifferentSquares {
    int solution(int[][] matrix) {
        Set<String> set = new HashSet();
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[i].length; j++) {
                set.add("" + matrix[i-1][j-1] + matrix[i-1][j] + matrix[i][j-1] + matrix[i][j]);
            }
        }
        return set.size();
    }
}
