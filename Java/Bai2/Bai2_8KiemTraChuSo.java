package Bai2;

import java.util.Scanner;

public class Bai2_8KiemTraChuSo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Nhap so duoi dang char de so sanh
        char b=scanner.next().charAt(0);

        if(b>='0'&&b<='9'){
            System.out.printf("YES");

        }
        else{
            System.out.printf("NO");
        }
    }
}
