package arcade.intro._07throughthefog;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static int step = 0;

    public List<List<Integer>> permutations(List<Integer> original) {
        if (original.isEmpty()) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        Integer first = original.remove(0);
        List<List<Integer>> returnValue = new ArrayList<>();
        List<List<Integer>> permutations = permutations(original);
        for (List<Integer> permutated : permutations) {

            log(++step, "permutated " + permutated);

            for (int index = 0; index <= permutated.size(); index++) {
                List<Integer> temp = new ArrayList<>(permutated);

                log(++step, "Adding " + first + " at index " + index + " to permutated " + temp);

                temp.add(index, first);

                returnValue.add(temp);
            }
        }

        log(++step, returnValue);

        return returnValue;
    }

    private void log(int step, List<List<Integer>> permutations) {
        System.out.println(String.format("(%d) -> %s ", step, permutations));
    }

    private void log(int step, String message) {
        System.out.println(String.format("(%d) -> %s ", step, message));
    }
}
