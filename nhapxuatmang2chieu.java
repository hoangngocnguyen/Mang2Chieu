/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class nhapxuatmang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng của mảng 2 chiều: ");
        int soDong = scanner.nextInt();
        System.out.println("nhập số cột của mảng 2 chiều: ");
        int soCot = scanner.nextInt();
        
        int A[][] = new int [soDong][soCot];
        
        // nhập giá trị vào mảng
        for (int i=0; i<soDong; i++) {
            for (int j =0; j<soCot; j++) {
                System.out.println("nhập vào phần tử A[" +i+ 
                        "]" + "[" + j +"]");
                A[i][j] = scanner.nextInt();
                
            }
        }
        System.out.println("xuất phần tử mảng hai chiều");
        for (int i=0; i<soDong; i++) {
            for (int j =0; j<soCot; j++) { 
                System.out.print( A[i][j] + " ");
            }
            System.out.println("");
        }
        
        
    }
}
