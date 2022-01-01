package arcade.intro._12landoflogic;

/**
 You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

 Return an array of names that will be given to the files.

 Example

 For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
 solution(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.string names

 Guaranteed constraints:
 5 ≤ names.length ≤ 1000,
 1 ≤ names[i].length ≤ 15.

 [output] array.string
 */
public class FileNaming {
    String[] solution(String[] names) {
        String[] nn = new String[names.length];
        for (int i=0; i<names.length; i++) {
            int c = 0;
            for (int j=0; j<i; j++) {
                if (names[i].equals(nn[j])) {
                    c++;
                }
            }
            if (c==0) {
                nn[i] = names[i];
            } else {
                String a = names[i] + "(" + c + ")";
                while (exists(nn, a)) {
                    a = names[i] + "(" + (++c) + ")";
                }
                nn[i] = a;
            }
        }
        return nn;
    }

    boolean exists(String[] arr, String name) {
        for (int i=0; i<arr.length; i++) {
            if (name.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }
}
