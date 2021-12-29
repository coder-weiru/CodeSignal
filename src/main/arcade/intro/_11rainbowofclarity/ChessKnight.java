package arcade.intro._11rainbowofclarity;

import java.util.Arrays;
import java.util.List;

/**
 Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

 The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.



 Example

 For cell = "a1", the output should be
 solution(cell) = 2.



 For cell = "c2", the output should be
 solution(cell) = 6.



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string cell

 String consisting of 2 letters - coordinates of the knight on an 8 × 8 chessboard in chess notation.

 Guaranteed constraints:
 cell.length = 2,
 'a' ≤ cell[0] ≤ 'h',
 1 ≤ cell[1] ≤ 8.

 [output] integer
 */
public class ChessKnight {
    int solution(String cell) {
        int[] pos = pos(cell);
        int[] dirX = new int[] {2, 2, 1, -1, -2, -2, 1, -1};
        int[] dirY = new int[] {1, -1, -2, -2, 1, -1, 2, 2};
        int n = 0;
        for (int i=0; i<dirX.length; i++) {
            //System.out.println("i-> " + i + " pos[0]->" + pos[0] + " pos[1]-> " + pos[1]);
            if (pos[0] + dirX[i] < 9 && pos[0] + dirX[i] > 0 && pos[1] + dirY[i] < 9 && pos[1] + dirY[i] > 0) {
                n++;
            }
        }
        return n;
    }

    int[] pos(String cell) {
        List<Character> ca = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');
        int[] pos = new int[2];
        pos[0] = ca.indexOf(cell.charAt(0)) + 1;
        pos[1] = Integer.valueOf(""+cell.charAt(1));
        return pos;
    }
}
