package algorithm;

public class FlippingAnImage {

    public static void main(String... args) {

        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        FlippingAnImage flippingAnImage = new FlippingAnImage();

        int[][] flippedAndInvertedImage = flippingAnImage.flipAndInvertImage(image);
        System.out.println(flippedAndInvertedImage);

    }


    public int[][] flipAndInvertImage(int[][] A) {

        int[][] retVal = new int[A.length][];
        for (int rowIndex = 0; rowIndex < A.length; rowIndex++) {

            int[] flippedRow = new int[A[rowIndex].length];
            for (int i = 0; i < A[rowIndex].length; i++) {
                flippedRow[A[rowIndex].length - 1 - i] = A[rowIndex][i] == 0 ? 1 : 0;
            }
            retVal[rowIndex] = flippedRow;
        }
        return retVal;
    }

}
