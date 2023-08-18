/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class kiemtra_matranDoiXung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        do {
            System.out.print("nhập số dòng của mảng: ");
            m = scanner.nextInt();
            System.out.print("nhập số cột của mảng: ");
            n = scanner.nextInt();

        } while (m < 1 || n < 1);

        int A[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]" + "[" + j + "]=");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("------");
        System.out.println("MA TRẬN A: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // kiểm tra ma trận đối xứng
        if (m != n) {
            System.out.println("ma trận vừa nhập không đối xứng!");
        } else {
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] != A[j][i]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > 0) {
                System.out.println("ma trận vừa nhập không đối xứng!");
            } else {
                System.out.println("ma trận vừa nhập đối xứng!");
            }
        }

    }
}
