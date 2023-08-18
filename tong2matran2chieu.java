/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
/*
Ví dụ 1
Viết chương trình thực hiện các công việc sau:

Nhập m, n là số dòng và 2 số cột của 2 ma trận 2 chiều A và B từ bàn phím.
Nhập giá trị cho các phần tử cho 2 ma trận này.
Tính và in ra màn hình ma trận C là tổng của 2 ma trận này.
Yêu cầu kỹ thuật: Kiểm tra số dòng, số cột nhập vào không được nhỏ hơn 1.*/
import java.util.Scanner;
public class tong2matran2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        
        do {
            System.out.println("nhập vào số dòng của hai ma trận: ");
            m = scanner.nextInt();
            System.out.println("nhập vào số cột của hai ma trận: ");
            n = scanner.nextInt();
        } while ( m<1 || n<1) ;
        int A[][]= new int [m][n];
        int B[][]= new int [m][n];
        System.out.println("nhập giá trị cho ma trận A: ");
         for (int i=0; i<m; i++) {
            for (int j =0; j<n; j++) {
                System.out.print("nhập vào phần tử A[" +i+ 
                        "]" + "[" + j +"]=");
                A[i][j] = scanner.nextInt();
           
            }
        }
               System.out.println("------");
          System.out.println("nhập giá trị cho ma trận B: ");
         for (int i=0; i<m; i++) {
            for (int j =0; j<n; j++) {
                System.out.print("nhập vào phần tử B[" +i+ 
                        "]" + "[" + j +"]=");
                B[i][j] = scanner.nextInt();
               // System.out.println("");
            }
        }
        
        // tính tồng hai ma trận A+B= C
        int C[][] = new int [m][n];
         for (int i=0; i<m; i++) {
            for (int j =0; j<n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
         }
        
         // xuất mảng A, B, C
         System.out.println("-------------");
         System.out.println("Ma trận A: ");
          for (int i=0; i<m; i++) {
            for (int j =0; j<n; j++) {
                System.out.print(A[i][j] + "\t");
            }
              System.out.println("");
          }
          
           System.out.println("Ma trận B: ");
          for (int i=0; i<m; i++) {
            for (int j =0; j<n; j++) {
                System.out.print(B[i][j] + "\t");
            }
              System.out.println("");
          }
          
           System.out.println("Ma trận C: ");
          for (int i=0; i<m; i++) {
            for (int j =0; j<n; j++) {
                System.out.print(C[i][j] + "\t");
            }
              System.out.println("");
          }
          
          
         
    }
}
