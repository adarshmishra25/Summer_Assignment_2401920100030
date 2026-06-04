import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minI = 0, minJ = 0;
        int maxI = matrix.length - 1, maxJ = matrix[0].length - 1;

        List<Integer> ans = new ArrayList<>();

        while (minI <= maxI && minJ <= maxJ) {
            record(ans, matrix, minI, maxI, minJ, maxJ);
            minI++;
            maxI--;
            minJ++;
            maxJ--;
        }
        return ans;
    }
    private void record(List<Integer> ans, int[][] matrix,
                        int minI, int maxI, int minJ, int maxJ) {
        for (int j = minJ; j <= maxJ; j++) {
            ans.add(matrix[minI][j]);
        }
        for (int i = minI + 1; i <= maxI; i++) {
            ans.add(matrix[i][maxJ]);
        }
        if (minI < maxI) {
            for (int j = maxJ - 1; j >= minJ; j--) {
                ans.add(matrix[maxI][j]);
            }
        }
        if (minJ < maxJ) {
            for (int i = maxI - 1; i > minI; i--) {
                ans.add(matrix[i][minJ]);
            }
        }
    }
}