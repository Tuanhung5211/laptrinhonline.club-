package Trang1;

import java.util.Scanner;

public class DienTichTB_DienTichMax {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        double l,r;
        double Tong=0;
        double max=0;
        for(long i=0;i<n;i++){
            l= scanner.nextDouble();
            r= scanner.nextDouble();
            double dienTich=l*r;
            Tong+=dienTich;
            if(max<dienTich){
                max=dienTich;
            }
        }
        System.out.printf("%.3f\n",Tong/n);
        System.out.printf("%.3f",max);
    }
}
