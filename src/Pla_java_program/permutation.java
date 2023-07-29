package Pla_java_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> result = _findSortedUniquePermutations(str);

        System.out.println("Sorted Unique Permutations:");
        for (String permutation : result) {
            System.out.println(permutation);
        }
    }

    public static List<String> _findSortedUniquePermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        _findSortedUniquePermutationsRecursive(chars, new boolean[chars.length], new StringBuilder(), result);

        return result;
    }

    private static void _findSortedUniquePermutationsRecursive(char[] chars, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) {

                continue;
            }

            current.append(chars[i]);
            used[i] = true;
            _findSortedUniquePermutationsRecursive(chars, used, current, result);
            used[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }
}
