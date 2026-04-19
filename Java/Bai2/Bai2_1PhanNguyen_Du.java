package Bai2;

import java.util.Scanner;

public class Bai2_1PhanNguyen_Du {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        long a= scanner.nextLong();
        long b=scanner.nextLong();

        System.out.printf("%d ",a/b);
        System.out.printf("%d",a%b);
    }
}
