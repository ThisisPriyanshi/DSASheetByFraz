package easy;

import java.util.Arrays;

public class floodFill {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1},
                {1,1,0},
                {1,0,1}};

        int[][] myAns = floodFillFunction(matrix, 1, 1, 2);

        System.out.println(Arrays.deepToString(myAns));
    }

    public static int[][] floodFillFunction(int[][] image, int sr, int sc, int color) {
        // We calculate the original first using the coordinates (sr , sc)

        int originalColor = image[sr][sc];

        // In case the originalColor & given Color is same, we can simply return the Original Image

        if (originalColor == color)
            return image;

        int m = image.length;
        int n = image[0].length;

        flood(sr , sc , image, originalColor, color , m, n);

        // We return the new image[][] matrix after changing all the Neighbouring Cells of (sr , sc) having OldColor to Color

        return image;

    }

    public static void flood(int i, int j, int[][] image, int originalColor, int newColor, int row, int col)
    {

        // If we move out of the Matrix Or originalColor is not equal to newColor, we just return back

        if (i < 0 || j < 0 || i == row || j == col || image[i][j] != originalColor)
            return;

        // We change the color of the Current-Cell to newColor

        image[i][j] = newColor;

        // Recursive call in Downward direction

        flood(i + 1, j, image, originalColor, newColor, row, col);

        // Recursive call in the Upward direction

        flood(i - 1, j, image, originalColor, newColor, row, col);

        // Recursive call in the Right direction

        flood(i, j + 1, image, originalColor, newColor, row, col);

        // Recursive call in the left direction

        flood(i, j - 1, image, originalColor, newColor, row, col);
    }

}
