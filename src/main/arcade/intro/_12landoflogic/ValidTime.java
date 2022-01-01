package arcade.intro._12landoflogic;

/**
 Check if the given string is a correct time representation of the 24-hour clock.

 Example

 For time = "13:58", the output should be
 solution(time) = true;
 For time = "25:51", the output should be
 solution(time) = false;
 For time = "02:76", the output should be
 solution(time) = false.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string time

 A string representing time in HH:MM format. It is guaranteed that the first two characters, as well as the last two characters, are digits.

 [output] boolean

 true if the given representation is correct, false otherwise.
 */
public class ValidTime {
    boolean solution(String time) {
        if (time.length()==5 && Character.valueOf(':').equals(time.charAt(2))) {
            try {
                String hh = time.substring(0, 2);
                String mm = time.substring(3);
                int h = Integer.valueOf(hh).intValue();
                int m = Integer.valueOf(mm).intValue();
                return h >=0 && h < 24 && m >=0 && m < 60;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
}
