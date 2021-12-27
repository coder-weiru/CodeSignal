package arcade.intro._02edgeoftheocean;

/**
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.



Example

For n = 2, the output should be
solution(n) = 5;
For n = 3, the output should be
solution(n) = 13.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

Guaranteed constraints:
1 ≤ n < 104.

[output] integer

The area of the n-interesting polygon.
 */
public class ShapeArea {
    int solution(int n) {
        if (n<1) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return solution(n-1) + rim (n -1);
    }

    int rim(int n) {
        if (n==0) {
            return 0;
        }
        return len(n)* 2 - 2;
    }

    int len(int n) {
        if (n==0) {
            return 1;
        }
        return len(n-1) + 2;
    }
}
