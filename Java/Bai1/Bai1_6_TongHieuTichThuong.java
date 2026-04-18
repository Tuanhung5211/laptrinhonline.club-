package Bai1;

import java.util.Scanner;

public class Bai1_6_TongHieuTichThuong {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        long a= scanner.nextLong();
        long b= scanner.nextLong();

        System.out.printf("%d ",a+b);
        System.out.printf("%d ",a-b);
        System.out.printf("%d ",a*b);
        System.out.printf("%.2f ",(double)a/b);
    }
}
