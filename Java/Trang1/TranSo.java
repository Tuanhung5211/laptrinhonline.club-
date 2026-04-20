package Trang1;

import java.util.Scanner;

public class TranSo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        try{
            long a= scanner.nextLong();
            long b= scanner.nextLong();

            long sum=Math.addExact(a,b);
            System.out.printf("%d",sum);
        }
        // Exception kiem tra ca so nhap vao a,b co phu hop khong,Kiem tra sum co phu hop khong
        catch(Exception e){
            System.out.printf("OVERFLOW");
        }

    }
}
