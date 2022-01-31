package arcade.thecore._06labyrinthofnestedloops;

/**
 A rectangle with sides equal to even integers a and b is drawn on the Cartesian plane. Its center (the intersection point of its diagonals) coincides with the point (0, 0), but the sides of the rectangle are not parallel to the axes; instead, they are forming 45 degree angles with the axes.

 How many points with integer coordinates are located inside the given rectangle (including on its sides)?

 Example

 For a = 6 and b = 4, the output should be
 solution(a, b) = 23.

 The following picture illustrates the example, and the 23 points are marked green.



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer a

 A positive even integer.

 Guaranteed constraints:
 2 ≤ a ≤ 50.

 [input] integer b

 A positive even integer.

 Guaranteed constraints:
 2 ≤ b ≤ 50.

 [output] integer

 The number of inner points with integer coordinates.
 */
public class RectangleRotation {
    int solution(int a, int b) {
        int c = 0;
        for (int x= -(a+50); x<a+50; x++) {
            for (int y=-(b+50); y<b+50; y++) {
                double rX = rotateX(x, y);
                double rY = rotateY(x, y);
                if (rX <= a/2.0 && rX >= -a/2.0 && rY <= b/2.0 && rY >= -b/2.0) {
                    c ++;
                }
            }
        }
        return c;
    }

    double rotateX(int x, int y) {
        return x * Math.cos((45 * Math.PI)/180) - y * Math.sin((45 * Math.PI)/180);
    }

    double rotateY(int x, int y) {
        return x * Math.sin((45 * Math.PI)/180) + y * Math.sin((45 * Math.PI)/180);
    }
}
