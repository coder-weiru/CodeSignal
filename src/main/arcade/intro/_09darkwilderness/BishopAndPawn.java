package arcade.intro._09darkwilderness;

import java.util.Arrays;
import java.util.List;

/**
 Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.

 The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move:


 Example

 For bishop = "a1" and pawn = "c3", the output should be
 solution(bishop, pawn) = true.



 For bishop = "h1" and pawn = "h3", the output should be
 solution(bishop, pawn) = false.



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string bishop

 Coordinates of the white bishop in the chess notation.

 Guaranteed constraints:
 bishop.length = 2,
 'a' ≤ bishop[0] ≤ 'h',
 1 ≤ bishop[1] ≤ 8.

 [input] string pawn

 Coordinates of the black pawn in the same notation.

 Guaranteed constraints:
 pawn.length = 2,
 'a' ≤ pawn[0] ≤ 'h',
 1 ≤ pawn[1] ≤ 8.

 [output] boolean

 true if the bishop can capture the pawn, false otherwise.
 */
public class BishopAndPawn {
    boolean solution(String bishop, String pawn) {
        int[] bCord = pos(bishop);
        int[] pCord = pos(pawn);

        return (bCord[0] - pCord[0] == bCord[1] - pCord[1]) ||
                (bCord[0] - pCord[0] == pCord[1] - bCord[1]) ||
                (pCord[0] - bCord[0] == bCord[1] - pCord[1]) ||
                (bCord[0] - pCord[0] == pCord[1] - bCord[1]);
    }

    int[] pos(String p) {
        List apos = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');
        int[] pos = new int[2];
        pos[0] = apos.indexOf(p.charAt(0)) + 1;
        pos[1] = Integer.valueOf("" + p.charAt(1));
        return pos;
    }
}
