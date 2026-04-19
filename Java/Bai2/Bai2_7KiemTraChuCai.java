package Bai2;

import java.util.Scanner;

public class Bai2_7KiemTraChuCai {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Nhap chu cai
        char b=scanner.next().charAt(0);

        //Co the dung Character.isLetter(b) hoac thu cong
        if((b>='a'&&b<='z')||(b>='A'&&b<='Z')){
            System.out.printf("YES");

        }
        else{
            System.out.printf("NO");
        }
    }
}
