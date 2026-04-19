package Bai2;

import java.util.Scanner;

public class Bai2_3SoChiHetLonNhat {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        long a= scanner.nextLong();
        long b= scanner.nextLong();

        //Cong thuc
        System.out.printf("%d",((a-1)/b)*b);
    }
}
