package Bai2;

import java.util.Scanner;

public class Bai2_5SoChiaHetChoCa3va5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long a= scanner.nextLong();

        if(a%3==0&&a%5==0){
            System.out.printf("1");
        }
        else{
            System.out.printf("0");
        }
    }
}
