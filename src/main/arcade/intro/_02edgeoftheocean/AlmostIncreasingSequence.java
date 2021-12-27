package arcade.intro._02edgeoftheocean;

/**
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer sequence

Guaranteed constraints:
2 ≤ sequence.length ≤ 105,
-105 ≤ sequence[i] ≤ 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.
 */
public class AlmostIncreasingSequence {
    boolean solution(int[] sequence) {
        int cnt = 0;
        int prev;
        int val = sequence[0];
        for (int i = 1; i< sequence.length; i++) {
            //System.out.println("index :" + i);
            if (sequence[i] <= val) {
                cnt++;
            }
            if (!canRemovePrev(sequence, i) && !canRemoveSelf(sequence, i)) {
                cnt++;
            }
            //System.out.println("cnt :" + cnt);
            if (cnt>1) {
                break;
            }
            prev = sequence[i-1];
            val = sequence[i];
        }
        return !(cnt>1);
    }

    boolean canRemoveSelf(int[] sequence, int i) {
        boolean b = true;
        if (i>0 && i < sequence.length-1) {
            int prev = sequence[i-1];
            b = sequence[i+1] > prev;

            //System.out.println("canRemoveSelf :" + b);
        }
        return b;
    }

    boolean canRemovePrev(int[] sequence, int i) {
        boolean b = true;
        if (i>1) {
            int prev = sequence[i-2];
            b = sequence[i] > prev;
            //System.out.println("canRemovePrev :" + b);
        }
        return b;
    }
}
