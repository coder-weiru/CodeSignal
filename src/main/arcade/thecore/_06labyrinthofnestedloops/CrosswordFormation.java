package arcade.thecore._06labyrinthofnestedloops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 You're a crossword fanatic, and have finally decided to try and create your own. However, you also love symmetry and good design, so you come up with a set of rules they should follow:

 the crossword must contain exactly four words;
 these four words should form four pairwise intersections;
 all words must be written either left-to-right or top-to-bottom;
 the area of the rectangle formed by empty cells inside the intersections isn't equal to zero.
 Given 4 words, find the number of ways to make a crossword following the above-described rules. Note that two crosswords which differ by rotation are considered different.

 Example

 For words = ["crossword", "square", "formation", "something"], the output should be
 solution(words) = 6.

 The six crosswords can be formed as shown below:

 f                         f                             f
 o                     c r o s s w o r d     c r o s s w o r d
 c r o s s w o r d         r   o                   q     r
 m   q                     m   m                   u     m
 a   u            ;  s q u a r e          ;        a     a
 t   a                     t   t                   r     t
 i   r                     i   h             s o m e t h i n g
 s o m e t h i n g         o   i                         o
 n                         n   n                         n
 g

     c         s               s
 f o r m a t i o n       c     q               c         s
     o         m         r     u               r         o
     s q u a r e       f o r m a t i o n       o         m
     s         t    ;    s     r            ;  s q u a r e
     w         h         s o m e t h i n g     s         t
     o         i         w                     w         h
     r         n         o                   f o r m a t i o n
     d         g         r                     r         n
                         d                     d         g
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.string words

 An array of distinct strings, the words you need to use in your crossword.

 Guaranteed constraints:
 words.length = 4,
 3 ≤ words[i].length < 15.

 [output] integer

 The number of ways to make a correct crossword of the desired formation.
 */
public class CrosswordFormation {

    int solution(String[] words) {
        List<Integer> indice = indice(words);
        List<List<Integer>> permutations = permutations(indice);
        int n = 0;
        for (int i = 0; i < permutations.size(); i++) {
            List<String> list = permutations.get(i)
                    .stream().map(e -> words[e])
                    .collect(Collectors.toList());
            List<List<String>> l = fit(list.get(0), list.get(1), list.get(2), list.get(3));
            if (!l.isEmpty()) {
                n += l.size();
            }
        }
        return n;
    }

    List<List<String>> fit(String first, String second, String third, String fourth) {
        List<List<String>> list = new ArrayList<>();
        List<int[]> chars = findCrossChar(first, second);
        for (int[] a : chars) {
            int firstP1 = a[0];
            int secondP1 = a[1];
            if (firstP1 + 2 > first.length()) {
                continue;
            }
            String firstPart = first.substring(firstP1 + 2);

            chars = findCrossChar(firstPart, third);
            for (int[] b : chars) {
                int firstP2 = b[0] + firstP1 + 2;
                int thirdP1 = b[1];
                if (thirdP1 + 2 > third.length()) {
                    continue;
                }
                String thirdPart = third.substring(thirdP1 + 2);

                chars = findCrossChar(thirdPart, fourth);
                for (int[] c : chars) {
                    int thirdP2 = c[0] + thirdP1 + 2;
                    int fourthP2 = c[1];
                    int fourthP1 = fourthP2 - (firstP2 - firstP1);
                    int secondP2 = secondP1 + (thirdP2 - thirdP1);

                    if (fourthP1 >= 0 && secondP2 < second.length() && fourth.charAt(fourthP1) == second.charAt(secondP2)) {
                        firstPart = first.substring(firstP1, firstP2 + 1);
                        String secondPart = second.substring(secondP1, secondP2 + 1);
                        thirdPart = third.substring(thirdP1, thirdP2 + 1);
                        String fourthPart = fourth.substring(fourthP1, fourthP2 + 1);
                        List<String> parts = Arrays.asList(firstPart, secondPart, thirdPart, fourthPart);
                        list.add(parts);
                        //System.out.println("fit -> 1." + first + " 2." + second + " 3." + third + " 4." + fourth + " == " + parts);
                    }
                }
            }
        }
        return list;
    }

    List<int[]> findCrossChar(String wordOne, String wordTwo) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < wordOne.length(); i++) {
            char c = wordOne.charAt(i);
            for (int j = 0; j < wordTwo.length(); j++) {
                char d = wordTwo.charAt(j);
                if (c == d) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = j;
                    list.add(arr);
                }
            }
        }
        return list;
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

    List<Integer> indice(String[] words) {
        List<Integer> l = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            l.add(i);
        }
        return l;
    }
}
