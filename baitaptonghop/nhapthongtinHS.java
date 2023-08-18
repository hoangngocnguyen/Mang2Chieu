/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptonghop;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class nhapthongtinHS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String keyboard;
        do {
            System.out.println("nhập số học sinh trong lớp: ");
            n = scanner.nextInt();
           keyboard = scanner.nextLine();
        } while ( n<=0 || n>42 );
        
        String ten[] = new String[n];
        String gioitinh[] = new String[n];
        String ngaysinh[] = new String[n];
        String noisinh[] = new String[n];
        String lop[] = new String[n];
        
    
        for (int i=0; i<n; i++) {
            System.out.println("Học sinh " + (i+1) + ":");
            
            System.out.print("tên: ");
             ten[i] = scanner.nextLine();
            
            System.out.print("giới tính: ");
            gioitinh[i] = scanner.nextLine();
           
            
            System.out.print("ngày sinh (/): ");
            ngaysinh[i] = scanner.nextLine();
           
            
            System.out.print("nơi sinh(tỉnh/TP): ");
            noisinh[i] = scanner.nextLine();
            
            System.out.print("học lớp: ");
            lop[i] = scanner.nextLine();
            System.out.println("");
        }
        
         System.out.println("------------------");
         System.out.println("Danh sách học sinh: ");
        for (int i=0; i<n; i++) {
            System.out.println("Họ và tên: " + ten [i]);
            System.out.println("Giới tính: " + gioitinh[i]);
            System.out.println("Ngày sinh: " + ngaysinh[i]);
            System.out.println("Nơi sinh: " + noisinh [i]);
            System.out.println("Lớp: " + lop [i]);
            System.out.println("");
        }
    }
    
}
