package Bai2;

import java.util.Scanner;

public class Bai2_4SoChiaHetNhoNhat {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        long a= scanner.nextLong();
        long b= scanner.nextLong();

        //Phep chia chi lay phan nguyen

        System.out.printf("%d",((a+b-1)/b)*b);

    }
}
