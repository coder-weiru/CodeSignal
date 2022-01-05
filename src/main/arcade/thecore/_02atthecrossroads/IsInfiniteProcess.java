package arcade.thecore._02atthecrossroads;

/**
 Given integers a and b, determine whether the following pseudocode results in an infinite loop

 while a is not equal to b do
 increase a by 1
 decrease b by 1
 Assume that the program is executed on a virtual machine which can store arbitrary long numbers and execute forever.

 Example

 For a = 2 and b = 6, the output should be
 solution(a, b) = false;
 For a = 2 and b = 3, the output should be
 solution(a, b) = true.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer a

 Guaranteed constraints:
 0 ≤ a ≤ 20.

 [input] integer b

 Guaranteed constraints:
 0 ≤ b ≤ 20.

 [output] boolean

 true if the pseudocode will never stop, false otherwise.
 */
public class IsInfiniteProcess {
    boolean solution(int a, int b) {
        while (a!=b) {
            a +=1;
            b -=1;
            if (a > b) {
                return true;
            }
        }
        return false;
    }
}
