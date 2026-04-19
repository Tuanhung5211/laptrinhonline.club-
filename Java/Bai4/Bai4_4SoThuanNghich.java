package Bai4;

import java.util.Scanner;

public class Bai4_4SoThuanNghich {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long n= scanner.nextLong();
        String s=Long.toString(n);
        int len=s.length(); //Neu nhap 123321, len=6
        int check=0;

        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                check=1;
            }
        }
        if(check==0){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}
