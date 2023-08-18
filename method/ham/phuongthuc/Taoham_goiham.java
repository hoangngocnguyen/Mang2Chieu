/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method.ham.phuongthuc;

 import java.text.DecimalFormat;
public class Taoham_goiham {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int a = 19, b = 11;
        int tong = tinhtong(a,b);
        System.out.println("tổng hai số " + a + " và " + b +" là: " + tong);
        
        int r=2;
        float chuvi = r * pi();
        System.out.println("chu vi hình tròn bán kính bằng 2 là: " + chuvi);
        System.out.println("------------------");
        int A[] = new int[] {1,2,2,3,4};
        for (int i:A) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("trung bình cộng của mảng A là: " + decimalFormat.format(average(A) ));
    }
    
    public static int tinhtong(int a, int b) {
        int tong = a + b;        // hàm trả về có truyền tham số
        
        return tong;
    }
    
    public static float pi() {
        float pi =  3.14f;       // hàm trả về, không truyền tham số
        return pi;
    }
    
    public static float average(int A[]) {
        int sum=0;
        for (int i:A) {
           sum+= i ;
        }
    //   float average = (float) sum/ A.length;
      // return average;
      return (float) sum/ A.length;
    }
}
