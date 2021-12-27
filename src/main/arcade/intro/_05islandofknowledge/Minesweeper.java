package arcade.intro._05islandofknowledge;

/**
 In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

 Example

 For

 matrix = [[true, false, false],
 [false, true, false],
 [false, false, false]]
 the output should be

 solution(matrix) = [[1, 2, 1],
 [2, 1, 1],
 [1, 1, 1]]
 Check out the image below for better understanding:



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.array.boolean matrix

 A non-empty rectangular matrix consisting of boolean values - true if the corresponding cell contains a mine, false otherwise.

 Guaranteed constraints:
 2 ≤ matrix.length ≤ 100,
 2 ≤ matrix[0].length ≤ 100.

 [output] array.array.integer

 Rectangular matrix of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells. Two cells are called neighboring if they share at least one corner.
 */
public class Minesweeper {
    int[][] solution(boolean[][] matrix) {
        int[][] a = new int[matrix.length][matrix[0].length];
        for (int j=0; j<matrix.length; j++) {
            for (int k=0; k<matrix[j].length; k++) {
                a[j][k] = check(matrix, j, k);
            }
        }
        return a;
    }

    int check(boolean[][] matrix, int j, int k) {
        int cnt = 0;
        for (int l=j-1; l<j+2; l++) {
            for (int m=k-1; m<k+2; m++) {
                if (l==j && m==k) {
                    continue;
                }
                if (l>=0 && l<matrix.length && m>=0 && m<matrix[0].length) {
                    if (matrix[l][m]) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
