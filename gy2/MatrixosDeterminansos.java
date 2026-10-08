package gy2;

public class MatrixosDeterminansos {
    public static void main(String[] args) {

        double[][] matrix = {{3, 3, 7},{2, 8, 4},{1, -4, 4}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("[%d, %d] = %.2f\n", i, j, matrix[i][j]);
                double determinant = matrix[0][0] * matrix[1][1] * matrix[2][2] +
                                     matrix[0][1] * matrix[1][2] * matrix[2][0] +
                                     matrix[0][2] * matrix[1][0] * matrix[2][1] -
                                     matrix[2][0] * matrix[1][1] * matrix[0][2] -
                                     matrix[2][1] * matrix[1][2] * matrix[0][0] -
                                     matrix[2][2] * matrix[1][0] * matrix[0][1];

                System.out.println(determinant);
            }
        }
    }
}
