package arcade.intro._12landoflogic;

/**
 Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.

 Example

 For n = 3, the output should be

 solution(n) = [[1, 2, 3],
 [8, 9, 4],
 [7, 6, 5]]
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 Matrix size, a positive integer.

 Guaranteed constraints:
 3 ≤ n ≤ 100.

 [output] array.array.integer
 */
public class SpiralNumbers {
    int[][] solution(int n) {
        int[][] poses = new int[n*n][2];
        int x = 0;
        int y = 0;
        int d = 0;
        int m = n-1;
        int c = n;
        int[][] pos = walk(x, y, d, m);
        System.arraycopy(pos, 0, poses, 1, m);
        x = poses[c-1][0];
        y = poses[c-1][1];
        d++;
        while (m>0) {
            pos = walk(x, y, d, m);
            System.arraycopy(pos, 0, poses, c, m);
            c += m;
            x = poses[c-1][0];
            y = poses[c-1][1];
            d++;
            pos = walk(x, y, d, m);
            System.arraycopy(pos, 0, poses, c, m);
            c += m;
            x = poses[c-1][0];
            y = poses[c-1][1];
            d++;
            m--;
        }
        int[][] matrix = new int[n][n];
        assign(matrix, poses);
        return matrix;
    }

    void assign(int[][] matrix, int[][] poses) {
        int v = 1;
        for (int i=0; i<poses.length; i++) {
            matrix[poses[i][0]][poses[i][1]] = v;
            v ++;
        }
    }

    int[][] walk(int x, int y, int d, int count) {
        int[][] pos = new int[count][2];
        int a = x;
        int b = y;
        for (int i=0; i<count; i++) {
            pos[i] = walk(a, b, d);
            a = pos[i][0];
            b = pos[i][1];
        }
        return pos;
    }

    int[] walk(int x, int y, int d) {
        int[] dir = dir(d);
        int[] pos = new int[2];
        pos[0] = x + dir[0];
        pos[1] = y + dir[1];
        return pos;
    }

    int[] dir(int d) {
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        return dirs[d>=4?d%4:d];
    }
}
