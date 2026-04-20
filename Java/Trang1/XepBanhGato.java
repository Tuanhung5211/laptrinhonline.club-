package Trang1;

import java.util.Scanner;

public class XepBanhGato {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n;
        double check=0;
        long a;
        long k;
        int t=scanner.nextInt();

        for(int i=0;i<t;i++){
            n=scanner.nextInt();

            for(int j=0;j<n;j++){
                a=scanner.nextLong();
                k= scanner.nextLong();
                check+=(double)a/k;
            }
            if(check==1){
                System.out.printf("YES\n");
            }
            else{
                System.out.printf("NO\n");
            }
            check=0;
        }
    }
}
