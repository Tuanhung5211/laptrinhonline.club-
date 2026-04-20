package Trang1;
// Chay van ton qua nhieu thoi gian
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TimSoNguyenTo_OLD {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        long[] a=new long[n];
        long[] b=new long[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextLong();
            b[i]=scanner.nextLong();
        }

        boolean check=true;
        for(int i=0;i<n;i++){
            for(long j=a[i];j<=b[i];j++){ //Chay tu a[i] den b[i]
                if(j<2||(j%2==0&&j!=2)||(j%3==0&&j!=3)) continue; // kiem tra xem co chia het cho 2 va 3 khong, neu co, ket thuc vong lap nay
                //Moi so nguyen to lon hon 3(Prime >3) deu co dang 6k+-1 (VD: 6*1-1=5;6*2+1=13;...)
                for(int k=6;k<=sqrt(j)+1;k+=6){
                    if(j%(k-1)==0||j%(k+1)==0){ //Kiem tra xem co chia het cho so nguyen to khong, neu co check=false
                        check=false;
                        break;
                    }
                }
                if(check){
                    System.out.printf("%d ",j);
                }
                check=true;
            }
            System.out.println();
        }
    }
}
