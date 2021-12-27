import arcade.intro._07throughthefog.Permutations;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTest {

    Permutations permutations = new Permutations();

    @Test
    public void testPermutation() {
        List<List<Integer>> results = permutations.permutations(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)));

        System.out.println(results);
    }

}
