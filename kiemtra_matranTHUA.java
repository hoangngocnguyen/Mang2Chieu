/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class kiemtra_matranTHUA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        do{
        System.out.println("");
            System.out.println("nhập số dòng của mảng: ");
            m = scanner.nextInt();
            System.out.println("nhập số cột của mảng: ");
            n = scanner.nextInt();
            
        } while ( m<1 || n<1) ;
        
        int A[][] = new int [m][n];
        for(int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("A[" + i + "]" + "[" + j + "]=");
                A[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for(int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
             if (A[i][j]==0) {
                 count++;
             }   
            }
        }
        
        if (count > (n*m)/2 ) {
            System.out.println("ma trận vừa nhập là một ma trận thưa! " + count +"/"+ m*n +" số 0");
            
        } else {
            System.out.println("ma trận vừa nhập là ma trận không thưa! " + count +"/"+ m*n+ " số 0");  
          }
    }
}