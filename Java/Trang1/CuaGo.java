package Trang1;

import java.util.Scanner;

public class CuaGo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long L= scanner.nextLong();
        long l= scanner.nextLong();
        // Dem so manh se cat, phai de L+l-1 de so manh ra dung o ca 2 truong hop
        //VD neu L=6,l=2: (6+2-1)/2=7/2=3 manh(Dung)
        //neu L=8,l=2: (8+2-1)/2=9/2=4 manh(Dung)
        long count=(L+l-1)/l;
        long lanCua=count-1;

        System.out.printf("%d",(L-l)+lanCua);

    }
}
