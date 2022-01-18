package arcade.thecore._04looptunnel;

/**
 To prepare his students for an upcoming game, the sports coach decides to try some new training drills. To begin with, he lines them up and starts with the following warm-up exercise: when the coach says 'L', he instructs the students to turn to the left. Alternatively, when he says 'R', they should turn to the right. Finally, when the coach says 'A', the students should turn around.

 Unfortunately some students (not all of them, but at least one) can't tell left from right, meaning they always turn right when they hear 'L' and left when they hear 'R'. The coach wants to know how many times the students end up facing the same direction.

 Given the list of commands the coach has given, count the number of such commands after which the students will be facing the same direction.

 Example

 For commands = "LLARL", the output should be
 solution(commands) = 3.

 Let's say that there are 4 students, and the second one can't tell left from right. In this case, only after the second, third and fifth commands will the students face the same direction.



 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string commands

 String consisting of characters 'L', 'R' and 'A' only.

 Guaranteed constraints:
 0 ≤ commands.length ≤ 35.

 [output] integer

 The number of commands after which students face the same direction.
 */
public class Lineup {
    int solution(String commands) {
        int x = 0;
        int y = 0;
        int n = 0;
        for (int i=0; i<commands.length(); i++) {
            char c = commands.charAt(i);
            if ('L'==c) {
                x = x + 1;
                y = y + 3;
            } else if ('R'==c) {
                x = x + 3;
                y = y + 1;
            } else if ('A'==c) {
                x = x + 2;
                y = y + 2;
            }
            if (Math.abs(x-y)%4==0) {
                n++;
            }
        }
        return n;
    }
}
