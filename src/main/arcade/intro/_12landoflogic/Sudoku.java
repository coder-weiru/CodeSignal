package arcade.intro._12landoflogic;

import java.util.HashSet;
import java.util.Set;

/**
 Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

 This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.

 Example

 For
 grid = [[1, 3, 2, 5, 4, 6, 9, 8, 7],
 [4, 6, 5, 8, 7, 9, 3, 2, 1],
 [7, 9, 8, 2, 1, 3, 6, 5, 4],
 [9, 2, 1, 4, 3, 5, 8, 7, 6],
 [3, 5, 4, 7, 6, 8, 2, 1, 9],
 [6, 8, 7, 1, 9, 2, 5, 4, 3],
 [5, 7, 6, 9, 8, 1, 4, 3, 2],
 [2, 4, 3, 6, 5, 7, 1, 9, 8],
 [8, 1, 9, 3, 2, 4, 7, 6, 5]]
 the output should be
 solution(grid) = true;

 For
 grid = [[1, 3, 2, 5, 4, 6, 9, 2, 7],
 [4, 6, 5, 8, 7, 9, 3, 8, 1],
 [7, 9, 8, 2, 1, 3, 6, 5, 4],
 [9, 2, 1, 4, 3, 5, 8, 7, 6],
 [3, 5, 4, 7, 6, 8, 2, 1, 9],
 [6, 8, 7, 1, 9, 2, 5, 4, 3],
 [5, 7, 6, 9, 8, 1, 4, 3, 2],
 [2, 4, 3, 6, 5, 7, 1, 9, 8],
 [8, 1, 9, 3, 2, 4, 7, 6, 5]]
 the output should be
 solution(grid) = false.

 The output should be false: each of the nine 3 × 3 sub-grids should contain all of the digits from 1 to 9.
 These examples are represented on the image below.



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.array.integer grid

 A matrix representing 9 × 9 grid already filled with numbers from 1 to 9.

 Guaranteed constraints:
 grid.length = 9,
 grid[i].length = 9,
 1 ≤ grid[i][j] ≤ 9.

 [output] boolean

 true if the given grid represents a correct solution to Sudoku, false otherwise.
 */
public class Sudoku {
    boolean solution(int[][] grid) {
        boolean b = true;
        int[][][] subs = getSubGrids(grid);
        for (int i=0; i<subs.length; i++) {
            int[][] sub = subs[i];
            b &= checkSubGrids(sub);
            if (!b) {
                return b;
            }
        }
        b &= checkRows(grid);
        b &= checkCols(grid);

        return b;
    }

    boolean checkRows(int[][] grid) {
        Set<Integer> s = new HashSet();
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                s.add(grid[i][j]);
            }
            if (s.size()!=9) {
                return false;
            } else {
                s.clear();
            }
        }
        return true;
    }

    boolean checkCols(int[][] grid) {
        Set<Integer> s = new HashSet();
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                s.add(grid[j][i]);
            }
            if (s.size()!=9) {
                return false;
            } else {
                s.clear();
            }
        }
        return true;
    }

    int[][][] getSubGrids(int[][] grid) {
        int[][][] subs = new int[9][3][3];
        int n = 0;
        for (int i=0; i<grid.length; i=i+3) {
            for (int j=0; j<grid[i].length; j=j+3) {
                subs[n][0][0] = grid[i][j];
                subs[n][0][1] = grid[i][j+1];
                subs[n][0][2] = grid[i][j+2];
                subs[n][1][0] = grid[i+1][j];
                subs[n][1][1] = grid[i+1][j+1];
                subs[n][1][2] = grid[i+1][j+2];
                subs[n][2][0] = grid[i+2][j];
                subs[n][2][1] = grid[i+2][j+1];
                subs[n][2][2] = grid[i+2][j+2];
                n++;
            }
        }
        return subs;
    }

    void print(int[][] grid) {
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                System.out.print(" " + grid[i][j]);
            }
            System.out.println();
        }

    }

    boolean checkSubGrids(int[][] grid) {
        print(grid);
        Set<Integer> s = new HashSet();
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                s.add(grid[i][j]);
            }
        }
        return s.size()==9;
    }

}
