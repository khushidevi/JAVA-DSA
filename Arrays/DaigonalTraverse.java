
/*
 * LeetCode 498: Diagonal Traverse
 *
 * Approach:
 * Traverse the matrix diagonally, alternating between
 * up-right and down-left directions.
 * Use the sum of row and column indices to determine
 * the current direction.
 * Check matrix boundaries before updating row and column
 * indices to avoid going out of bounds.
 *
 * Time Complexity: O(m * n)
 * Space Complexity: O(m * n)
 */


package Arrays;

public class DaigonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int row = 0, col = 0;

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];

            if ((row + col) % 2 == 0) {
                // Move up-right
                if (col == n - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                // Move down-left
                if (row == m - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}