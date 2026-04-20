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
                if(j%2==0&&j!=2)) continue;
                for(int k=2;k<=sqrt(j);k++){ //Chay tu 2 den can bac 2 (j)
                    if(j%k==0){
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
