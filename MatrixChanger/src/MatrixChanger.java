import java.util.Scanner;
import java.util.logging.Logger;

public class MatrixChanger {

    static final Logger LOGGER = Logger.getLogger(MatrixChanger.class.getName());
    private int[][] matrix;

    /**
     * This method gets the input from user and returns the matrix array
     *
     * @return
     */
    public static int[][] getMatrixFromUser() {
        Scanner s = new Scanner(System.in);
        LOGGER.info("Enter the number of rows in the matrix");
        int rows = s.nextInt();
        LOGGER.info("Enter the number of columns in the matrix");
        int columns = s.nextInt();
        LOGGER.info("Enter the matrix:");
        int[][] inputMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                inputMatrix[i][j] = s.nextInt();
            }
        }
        return inputMatrix;
    }

    /**
     * Main Method to run the code
     *
     * @param arg
     */
    public static void main(String[] arg) {
        MatrixChanger m = new MatrixChanger();
        m.matrix = getMatrixFromUser();
        m.changeMatrix();
        m.printMatrix();
    }


    /**
     * This method changes the matrix  such that if an element in a matrix is zero, then that entire row and column are set to zero.
     */
    public void changeMatrix() {
        boolean firstRowHasZeros = this.checkRowForZero(0);
        boolean firstColumnHasZeros = this.checkColumnForZero(0);
        this.flagFirstRowAndColumn();
        this.changeRemainingMatrix();
        this.changeFirstRow(firstRowHasZeros);
        this.changeFirstColumn(firstColumnHasZeros);
    }

    /**
     * This method checks if zero is present in a particular row and returns true if zero is present
     *
     * @param row
     * @return
     */
    public boolean checkRowForZero(int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[row][i] == 0) {
                return true;
            }
        }
        return false;
    }


    /**
     * This method checks if zero is present in a particular column and returns true if zero is present
     *
     * @param column
     * @return
     */
    public boolean checkColumnForZero(int column) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][column] == 0) {
                return true;
            }
        }
        return false;
    }


    /**
     * This method uses the first row and column as the flags to mark if zero exist in a particular row and column
     */
    public void flagFirstRowAndColumn() {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
    }


    /**
     * This method changes the matrix and makes the elements zero based on the first row and column (Flags set using setFlagFirstRowAndColumn method)
     */
    public void changeRemainingMatrix() {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    /**
     * This method changes  the First row to zero if rowFlag was true
     *
     * @param rowFlag
     */
    public void changeFirstRow(boolean rowFlag) {
        int columns = matrix[0].length;
        if (rowFlag) {
            for (int i = 0; i < columns; i++) {
                matrix[0][i] = 0;
            }
        }
    }

    /**
     * This method changes the First column to zero if colFlag is true
     *
     * @param colFlag
     */
    public void changeFirstColumn(boolean colFlag) {
        int rows = matrix.length;
        if (colFlag) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    /**
     * This method prints the matrix.
     */
    public void printMatrix() {
        int rows = matrix.length;
        int columns = matrix[0].length;
        String outputMatrix=new String("\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                outputMatrix+=matrix[i][j] + " ";
            }
            outputMatrix+='\n';
        }

        LOGGER.info(outputMatrix);

    }

}

