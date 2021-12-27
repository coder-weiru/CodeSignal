package arcade.intro._07throughthefog;

import java.util.ArrayList;
import java.util.List;

/**
 Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements in such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible, and false if not.

 Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

 Example

 For inputArray = ["aba", "bbb", "bab"], the output should be
 solution(inputArray) = false.

 There are 6 possible arrangements for these strings:

 ["aba", "bbb", "bab"]
 ["aba", "bab", "bbb"]
 ["bbb", "aba", "bab"]
 ["bbb", "bab", "aba"]
 ["bab", "bbb", "aba"]
 ["bab", "aba", "bbb"]
 None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

 For inputArray = ["ab", "bb", "aa"], the output should be
 solution(inputArray) = true.

 It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.string inputArray

 A non-empty array of strings of lowercase letters.

 Guaranteed constraints:
 2 ≤ inputArray.length ≤ 10,
 1 ≤ inputArray[i].length ≤ 15.

 [output] boolean

 Return true if the strings can be reordered in such a way that each neighbouring pair of strings differ by exactly one character (false otherwise).
 */
public class StringsRearrangement {

    boolean solution(String[] inputArray) {
        List<Integer> indice = indice(inputArray);
        List<List<Integer>> permutations = permutations(indice);

        System.out.println(permutations);
        for (int i=0; i<permutations.size(); i++) {
            List<Integer> perm = permutations.get(i);
            boolean result = check(perm, inputArray);
            System.out.println("checking -> " + perm + " result -> " + result);
            if (result) {
                return true;
            }
        }
        return false;
    }

    List<List<Integer>> permutations(List<Integer> original) {
        if (original.isEmpty()) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        Integer first = original.remove(0);
        List<List<Integer>> returnValue = new ArrayList<>();
        List<List<Integer>> permutations = permutations(original);
        for (List<Integer> permutated : permutations) {
            for (int index = 0; index <= permutated.size(); index++) {
                List<Integer> temp = new ArrayList<>(permutated);
                temp.add(index, first);
                returnValue.add(temp);
            }
        }
        return returnValue;
    }

    List<Integer> indice(String[] inputArray) {
        List<Integer> l = new ArrayList();
        for (int i=0; i<inputArray.length; i++) {
            l.add(i);
        }
        return l;
    }

    boolean check(List<Integer> indice, String[] inputArray) {
        for (int i=0; i<indice.size()-1; i++) {
            String a = inputArray[indice.get(i)];
            String b = inputArray[indice.get(i+1)];
            if (!check(a, b)) {

                return false;
            }
        }
        return true;
    }

    boolean check(String a, String b) {
        if (a==null || b==null) {
            return false;
        }
        int n = 0;
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                n++;
            }
        }
        return n==1;
    }

}
