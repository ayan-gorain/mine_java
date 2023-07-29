package Pla_java_program;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        List<List<Integer>> result = findUniqueCombinations(arr);

        System.out.println("Unique 2-element combinations:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
    public static List<List<Integer>> findUniqueCombinations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        if (arr == null || arr.length < 2) {
            return result;
        }

        findUniqueCombinationsRecursive(arr, 0, new ArrayList<>(), result);


        return result;
    }

    private static void findUniqueCombinationsRecursive(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {

        if (current.size() == 2) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            current.add(arr[i]);


            findUniqueCombinationsRecursive(arr, i + 1, current, result);


            current.remove(current.size() - 1);


            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                i++;
            }
        }
    }
}