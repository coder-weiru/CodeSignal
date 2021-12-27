package arcade.intro._06rainsofreason;

/**
 Given two cells on the standard chess board, determine whether they have the same color or not.

 Example

 For cell1 = "A1" and cell2 = "C3", the output should be
 solution(cell1, cell2) = true.



 For cell1 = "A1" and cell2 = "H3", the output should be
 solution(cell1, cell2) = false.



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string cell1

 Guaranteed constraints:
 cell1.length = 2,
 'A' ≤ cell1[0] ≤ 'H',
 1 ≤ cell1[1] ≤ 8.

 [input] string cell2

 Guaranteed constraints:
 cell2.length = 2,
 'A' ≤ cell2[0] ≤ 'H',
 1 ≤ cell2[1] ≤ 8.

 [output] boolean

 true if both cells have the same color, false otherwise.
 */
public class ChessBoardCellColor {
    boolean solution(String cell1, String cell2) {
        int[] a = pos(cell1);
        int[] b = pos(cell2);
        return (isDark(a) && isDark(b)) ||
                (!isDark(a) && !isDark(b));
    }

    boolean isDark(int[] a) {
        boolean b;
        int j = a[0];
        int k = a[1];
        if ((j %2==1 && k%2==1) || (j %2==0 && k%2==0)) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    int[] pos(String cell) {
        int[] a = new int[2];
        char c1 = cell.charAt(0);
        char c2 = cell.charAt(1);
        a[1] = Integer.valueOf(""+c2);
        switch(c1) {
            case 'A':
                a[0] = 1;
                break;
            case 'B':
                a[0] = 2;
                break;
            case 'C':
                a[0] = 3;
                break;
            case 'D':
                a[0] = 4;
                break;
            case 'E':
                a[0] = 5;
                break;
            case 'F':
                a[0] = 6;
                break;
            case 'G':
                a[0] = 7;
                break;
            case 'H':
                a[0] = 8;
                break;
        }
        return a;
    }
}
