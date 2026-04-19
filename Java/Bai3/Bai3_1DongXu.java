package Bai3;

import java.util.Scanner;

public class Bai3_1DongXu {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        long a=scanner.nextLong();
        long b=scanner.nextLong();
        long c=scanner.nextLong();
        long n=scanner.nextLong();
        //Tim so lon nhat
        long max=Math.max(a,Math.max(b,c));
        //Dieu kien >= max vi Poly khong the lay lai xu cua nguoi khac
        //Neu trung binh nho hon max thi co nghia la 1 nguoi da bi mat xu, tuc la ko chia duoc
        if((n+a+b+c)%3==0&&((n+a+b+c)/3)>=max){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }

    }
}
