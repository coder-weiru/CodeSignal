package arcade.intro._05islandofknowledge;

/**
 An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

 Given a string, find out if it satisfies the IPv4 address naming rules.

 Example

 For inputString = "172.16.254.1", the output should be
 solution(inputString) = true;

 For inputString = "172.316.254.1", the output should be
 solution(inputString) = false.

 316 is not in range [0, 255].

 For inputString = ".254.255.0", the output should be
 solution(inputString) = false.

 There is no first number.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A string consisting of digits, full stops and lowercase English letters.

 Guaranteed constraints:
 1 ≤ inputString.length ≤ 30.

 [output] boolean

 true if inputString satisfies the IPv4 address naming rules, false otherwise.
 */
public class IsIPv4Address {
    boolean solution(String inputString) {
        String s = inputString.replace(".", ":");
        String[] a = s.split(":");
        if (a.length!=4) {
            return false;
        }
        for (String b : a) {
            System.out.println(" b-> " + b);
            if (b.startsWith("0") && b.length()>1) {
                return false;
            }
            int i = -1;
            try {
                i = Integer.parseInt(b);
            } catch (Exception e) {
                return false;
            }
            if (i>255 || i<0) {
                return false;
            }
        }
        return true;
    }
}
