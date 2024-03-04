package LabSession1.ex2;

public class MatrixOperations {
    public static void main(String[] args) {
        //defining marix1 and matrix2
        int[][] matrix1 = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};
        int[][] matrix2 = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};

        //printing matrix1 and matrix2 using a custom function made by me
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        //declaring the matrices for addition and multiplication and using custom fucntions to calculte them
        int[][] sum = addMatrices(matrix1, matrix2);
        int[][] product = multiplyMatrices(matrix1, matrix2);

        //printing the results
        System.out.println("\nSum of the matrices:");
        printMatrix(sum);
        System.out.println("\nProduct of the matrices:");
        printMatrix(product);
    }
    //function for matrix addition
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {   //going through the matrices
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j]; //adding the elements position by position
            }
        }
        return sum;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
