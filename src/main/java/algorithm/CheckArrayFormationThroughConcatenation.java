package algorithm;

public class CheckArrayFormationThroughConcatenation {

    public static void main(String... args) {

//        int[] arr = {15, 88};
//        int[][] pieces = {{88}, {15}};

//        int[] arr = {91, 4, 64, 78};
//        int[][] pieces = {{78}, {4, 64}, {91}};

        int[] arr = {49, 18, 16};
        int[][] pieces = {{16, 18, 49}};

        CheckArrayFormationThroughConcatenation checkArrayFormationThroughConcatenation = new CheckArrayFormationThroughConcatenation();
        boolean result = checkArrayFormationThroughConcatenation.canFormArray(arr, pieces);
        System.out.println("result is " + result);
    }

    public boolean canFormArray(int[] arr, int[][] pieces) {

        boolean flag = false;
        int arrIndex = 0;
        while (true) {

            for (int[] piece : pieces) {
                int pieceIndex = 0;
                if (arr[arrIndex] != piece[pieceIndex++]) {
                    flag = false;
                    continue;
                } else {
                    flag = true;
                    for (; pieceIndex < piece.length; pieceIndex++) {
                        if (arr[++arrIndex] != piece[pieceIndex]) {
                            return false;
                        }
                    }
                    break;
                }
            }

            if (!flag) return false;
            if (++arrIndex >= arr.length) return true;
        }
    }
}
