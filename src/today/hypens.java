package today;

public class hypens {
    public static void main(String[] args) {
        System.out.println("Move Hyphens in the beginning");

        String s = "H-E-L-L-O";
        String[] arrS = s.split("-");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arrS.length-1; i++) {
            result.append("-");
        }

        for (int i = 0; i < arrS.length; i++) {
            result.append(arrS[i]);
        }

        System.out.println(result.toString());
    }
}
