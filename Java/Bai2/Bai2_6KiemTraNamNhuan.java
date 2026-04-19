package Bai2;

import java.util.Scanner;

public class Bai2_6KiemTraNamNhuan {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long n= scanner.nextLong();
        if(n<=0){
            System.out.printf("INVALID");
        }
        else if(n%400==0||(n%4==0&&n%100!=0)){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}
