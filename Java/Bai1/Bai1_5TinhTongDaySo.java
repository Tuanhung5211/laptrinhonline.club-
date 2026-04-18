package Bai1;
import java.util.Scanner;
public class Bai1_5TinhTongDaySo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        long n= scanner.nextLong();

        System.out.printf("%.1f",(double)(n*(n+1))/2);
    }
}
