import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void testcase1(){
        MatrixChanger test=new MatrixChanger();
        int[][] inputMatrix={{1,0},{1,1},{1,1}};
        test.setMatrix(inputMatrix);
        int[][] expectedOutput={{0,0},{1,0},{1,0}};
        test.changeMatrix();
        int [][] actualOutput=test.getMatrix() ;
        Assert.assertArrayEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testcase2(){
        MatrixChanger test=new MatrixChanger();
        int[][] inputMatrix={{1,0,3},{2,6,1},{7,0,1}};
        test.setMatrix(inputMatrix);
        int[][] expectedOutput={{0,0,0},{2,0,1},{0,0,0}};
        test.changeMatrix();
        int [][] actualOutput=test.getMatrix() ;
        Assert.assertArrayEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testcase3(){
        MatrixChanger test=new MatrixChanger();
        int[][] inputMatrix={{1,0,3,4,5,6}};
        test.setMatrix(inputMatrix);
        int[][] expectedOutput={{0,0,0,0,0,0}};
        test.changeMatrix();
        int [][] actualOutput=test.getMatrix() ;
        Assert.assertArrayEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testcase4(){
        MatrixChanger test=new MatrixChanger();
        int[][] inputMatrix={{1},{0},{3},{4},{5},{6}};
        test.setMatrix(inputMatrix);
        int[][] expectedOutput={{0},{0},{0},{0},{0},{0}};
        test.changeMatrix();
        int [][] actualOutput=test.getMatrix() ;
        Assert.assertArrayEquals(expectedOutput,actualOutput);
    }
    @Test
    public void testcase5(){
        MatrixChanger test=new MatrixChanger();
        int[][] inputMatrix={{1,2,3},{3,4,5},{3,6,7}};
        test.setMatrix(inputMatrix);
        int[][] expectedOutput={{1,2,3},{3,4,5},{3,6,7}};
        test.changeMatrix();
        int [][] actualOutput=test.getMatrix() ;
        Assert.assertArrayEquals(expectedOutput,actualOutput);
    }

}
