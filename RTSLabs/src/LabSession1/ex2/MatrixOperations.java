package LabSession1.ex2;

public class MatrixOperations {
    public static void main(String[] args) {
        //defining marix1 and matrix2
        int[][] matrix1 = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};
        int[][] matrix2 = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};

        //printing matrix1 and matrix2 using a custom function made by me
        System.out.println("Matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        //declaring the matrices for addition and multiplication and using custom fucntions to calculte them
        int[][] sum = addMatrices(matrix1, matrix2);
        int[][] product = multiplyMatrices(matrix1, matrix2);

        //printing the results
        System.out.println("\nSum of the matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nProduct of the matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
    //fucntion for the multiplication of the matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { //going through the matrices
                for (int k = 0; k < 3; k++) { //for to calculate the sum between the product of the elements of the current line and column of the matrix
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
    //function for matrix addition
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {   //going through the matrices using two for
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j]; //adding the elements position by position
            }
        }
        return sum;
    }
}
