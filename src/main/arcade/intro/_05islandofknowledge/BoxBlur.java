package arcade.intro._05islandofknowledge;

/**
 Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.

 The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.

 Return the blurred image as an integer, with the fractions rounded down.

 Example

 For

 image = [[1, 1, 1],
 [1, 7, 1],
 [1, 1, 1]]
 the output should be solution(image) = [[1]].

 To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1. The border pixels are cropped from the final result.

 For

 image = [[7, 4, 0, 1],
 [5, 6, 2, 2],
 [6, 10, 7, 8],
 [1, 4, 2, 0]]
 the output should be

 solution(image) = [[5, 4],
 [4, 4]]
 There are four 3 × 3 squares in the input image, so there should be four integers in the blurred output. To get the first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5. The other three integers are obtained the same way, then the surrounding integers are cropped from the final result.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.array.integer image

 An image, stored as a rectangular matrix of non-negative integers.

 Guaranteed constraints:
 3 ≤ image.length ≤ 100,
 3 ≤ image[0].length ≤ 100,
 0 ≤ image[i][j] ≤ 255.

 [output] array.array.integer

 A blurred image represented as integers, obtained through the process in the description.
 */
public class BoxBlur {
    int[][] solution(int[][] image) {
        int[][][][] l = sub(image);
        int[][] sq;
        int[][] blur = new int[l.length][l[0].length];
        for (int r=0; r<l.length; r++) {
            for (int c=0; c<l[r].length; c++) {
                sq = l[r][c];
                blur[r][c] = (int)avg(sq);
            }
        }
        return blur;
    }

    double avg(int[][] sq) {
        double a = 0.0;
        for (int r=0; r<sq.length; r++) {
            for (int c=0; c<sq.length; c++) {
                a += sq[r][c];
            }
        }
        return Math.floor(a/9);
    }

    int[][][][] sub(int[][] image) {
        int[][][][] l = new int[(image.length-2)][(image[0].length-2)][3][3];
        int[][] sq;
        for (int r=0; r<image.length-2; r++) {
            for (int c=0; c<image[r].length-2; c++) {
                sq = new int[3][3];
                sq[0] = new int[3];
                sq[1] = new int[3];
                sq[2] = new int[3];
                sq[0][0] = image[r][c];
                sq[0][1] = image[r][c + 1];
                sq[0][2] = image[r][c + 2];
                sq[1][0] = image[r + 1][c];
                sq[1][1] = image[r + 1][c + 1];
                sq[1][2] = image[r + 1][c + 2];
                sq[2][0] = image[r + 2][c];
                sq[2][1] = image[r + 2][c + 1];
                sq[2][2] = image[r + 2][c + 2];
                l[r][c] = sq;
            }
        }
        return l;
    }
}
