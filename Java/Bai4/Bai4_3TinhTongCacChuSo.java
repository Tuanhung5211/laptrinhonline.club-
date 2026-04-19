package Bai4;

import java.util.Scanner;

public class Bai4_3TinhTongCacChuSo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long n= scanner.nextLong();;
        String s=Long.toString(n);
        int Tong=0;
        for (int i=0;i<s.length();i++){
            Tong+=(s.charAt(i)-'0'); //Tru '0' đe ep i(dang la char) ve dung voi gia tri that
        }
        System.out.printf("%d",Tong);
    }
}
