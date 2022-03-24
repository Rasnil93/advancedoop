import java.util.Arrays;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] elements;

    public Matrix (int rows , int cols){
        this.rows = rows;
        this.cols = cols;
        this.elements = new double[rows][cols];
    }

    public boolean setElement (int row, int col, double input){
        if(row <= rows && col <= cols) {
            elements[row-1][col-1] = input;
            return true;
        }
        return false;
    }

    public double getElement(int row, int col){
        if(row <= rows && col <= cols) {
            return elements[row-1][col-1];
        }
        return 0;
    }

    public int getRows() {
        return this.rows;
    }

    public int getCols() {
        return this.cols;
    }

    public static void printMatrix(Matrix matrix){
        for (int i = 1; i <= matrix.rows; i++)
        {
            if(i != 1){
                System.out.println("\n");
            }
            for (int j = 1; j <= matrix.cols; j++)
                System.out.print(matrix.getElement(i,j) + " ");
        }
        System.out.println("\n ----------------");
    }

    public static Matrix multiMatrix(Matrix matrix1, Matrix matrix2) {
        Matrix tempMatrix = new Matrix(matrix1.getRows(), matrix2.getCols());

        double mulVal = 0;
        for(int i = 1; i <= matrix1.getRows();i++) {
            for(int k=1; k<= matrix2.getCols();k++){
                mulVal = 0;
                for(int j = 1; j <= matrix2.getRows();j++){
                    mulVal += matrix1.getElement(i,j)*matrix2.getElement(j,k);
                }
                tempMatrix.setElement(i,k, mulVal);
            }
        }
        return tempMatrix;
    }
    public static Matrix addMatrix(Matrix matrix1 , Matrix matrix2){
        Matrix addMatrix = new Matrix(matrix1.getRows(),matrix1.getCols());
        for (int i = 1; i<=addMatrix.getRows();i++){
            for (int j = 1; j<=addMatrix.getCols();j++){
                addMatrix.setElement(i,j, matrix1.getElement(i,j)+matrix2.getElement(i,j));
            }
        }
        return addMatrix;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,2);
        Matrix matrixTwo = new Matrix(2,4);
        matrix.setElement(1,1,1);
        matrix.setElement(1,2,2);
        matrix.setElement(2,1,1);
        matrix.setElement(2,2,2);
        matrix.setElement(3,1,1);
        matrix.setElement(3,2,2);

        matrixTwo.setElement(1,1,1);
        matrixTwo.setElement(1,2,2);
        matrixTwo.setElement(1,3,3);
        matrixTwo.setElement(1,4,4);
        matrixTwo.setElement(2,1,1);
        matrixTwo.setElement(2,2,2);
        matrixTwo.setElement(2,3,3);
        matrixTwo.setElement(2,4,4);
       /* printMatrix(matrix);
        printMatrix(matrixTwo);
        printMatrix(multiMatrix(matrix, matrixTwo));
        */
        Matrix matrixAddOne = new Matrix(2,2);
        matrixAddOne.setElement(1,1,1);
        matrixAddOne.setElement(1,2,2);
        matrixAddOne.setElement(2,1,3);
        matrixAddOne.setElement(2,2,4);
        Matrix matrixAddTwo = new Matrix(2,2);
        matrixAddTwo.setElement(1,1,1);
        matrixAddTwo.setElement(1,2,2);
        matrixAddTwo.setElement(2,1,3);
        matrixAddTwo.setElement(2,2,4);

        printMatrix(matrixAddOne);
        printMatrix(matrixAddTwo);
        printMatrix(addMatrix(matrixAddOne,matrixAddTwo));


    }
}

/*
public class TestClass{
    public static void main(String[] args) {
        Matrix matrix = new Matrix(1,2);
    }

}
*/