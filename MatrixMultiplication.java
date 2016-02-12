/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;
/**
 *
 * @author mnouman.bscs13seecs
 */
public class JavaClass {
    public void draw(int mat1[][],int mat2[][],int size) {
       
       System.out.println(mat1[0][size]);
    }
    
    public void initialize(int mat1[][],int mat2[][],int size) {
       Random rand = new Random();
       for (int t=0;t<size;t++)
       {
           for (int i=0;i<size;i++)
           {
               mat1[t][i]= rand.nextInt((10 - 0) + 1) + 0;
               mat2[t][i]= rand.nextInt((10 - 0) + 1) + 0;
           }
       }
    }
    
    public void printmat(int mat1[][],int size) {
        for (int t=0;t<size;t++)
       {
           for (int i=0;i<size;i++)
           {
               System.out.print(mat1[t][i]+"  ");
           }
           System.out.print("\n");
       }
    }
    
    public int[][] add(int mat1[][],int mat2[][],int mat1Endi, int mat1Starti,int mat2Starti, int mat2Endi,int mat1Endj, int mat1Startj,int mat2Startj, int mat2Endj) {
         int[][] ans = new int[mat1Endi][mat1Endj];
         int i1=0;
         int i2=0;
         int a1=mat1Starti;
         int a2= mat1Startj;
         int b1=mat2Starti;
         int b2= mat2Startj;
        for (int t=0;t<mat1Endi;t++)
       {
           for (int j=0;j<mat1Endi;j++)
           {
               System.out.print("\nahahahahaha\n");
               System.out.print("  Mat1 "+mat1[a1][a2]+" a1 and a2 "+a1+"  "+a2+" b1 and b2 "+b1+"  "+b2+"   Mat2 "+mat2[b1][b2]);
               ans[i1][i2]=mat1[a1][a2]+mat2[b1][b2];
               i2++;a2++;b2++;
               System.out.print("\n assal value=   "+mat1[0][0]);
           }
           i1++;a1++;b1++;
       }
        System.out.print("\n haahah\n");
        return ans;
    }
    
    public int[][] matMultiply(int mat1[][],int mat2[][],int size) {
        
        int[][] ans = new int[size][size];
       for (int t = 0 ; t < size ; t++ )
         {
            for ( int j = 0 ; j < size ; j++ )
            {   
               for (int k = 0 ; k < size ; k++ )
               {
                  ans[t][j] = ans[t][j] + mat1[t][k]*mat2[k][j];
               }
            }
         }
       return ans;
    }
    
    public int[][] AlgoMul(int mat1[][],int mat2[][],int sizeOriginal) {
        int size=sizeOriginal/2;
        int M1;
        int[][] ans = new int[sizeOriginal][sizeOriginal];
        // mat1Endi, mat1Starti, mat2Starti, mat2Endi, mat1Endj, mat1Startj, mat2Startj, mat2Endj) {
        /* temp1=add(mat1,mat1,size,0,0,size,size,0,size,sizeOriginal);
         temp2=add(mat2,mat2,size,0,0,size,size,0,size,sizeOriginal);
         M1=matMultiply(temp1,temp2,size);
         temp1=add(mat1,mat1,size,sizeOriginal,0,size,size,0,size,sizeOriginal);
         temp2=add(mat2,mat2,size,0,0,size,size,0,size,sizeOriginal);
         M2=matMultiply(temp1,temp2,size);*/
         M1=(mat1[0][0]+mat1[0][1])*(mat1[0][0]+mat1[0][1]);
         int M2=(mat1[1][1]+mat1[1][1])*(mat2[0][0]);
         int M3=mat1[0][0]*(mat2[0][1]-mat2[1][1]);
         int M4=mat1[1][1]*(mat2[1][0]-mat2[0][0]);
         int M5=(mat1[0][0]+mat1[0][1])*mat2[1][1];
         int M6= (mat1[1][0]-mat1[0][0])*(mat2[0][0]+mat2[0][1]);
         int M7= (mat1[0][1]-mat1[1][1])*(mat2[1][0]+mat2[1][1]);
         ans[0][0]=M1+M4-M5+M7;
         ans[0][1]=M3+M5;
         ans[1][0]=M2+M4;
         ans[1][1]=M1-M2+M3+M6;
       return ans;
    }
    
    
    
}
