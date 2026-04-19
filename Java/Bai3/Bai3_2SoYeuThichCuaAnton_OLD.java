//Bi StackOverflow neu so qua lon
package Bai3;

import java.util.Scanner;

public class Bai3_2SoYeuThichCuaAnton_OLD {
    static long S=0;
    static long So2DaDung=0;

    public static void ghep256(long k2,long k5,long k6){
        if(k2<=0||k5<=0||k6<=0){
            return;
        }
        S=S+ 256;
        So2DaDung+=1;
        ghep256(k2-1,k5-1,k6-1);
    }
    public static void ghep32(long k2,long k3){
        if(k2<=0||k3<=0){
            return;
        }
        S=S+32;
        ghep32(k2-1,k3-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k2 = scanner.nextLong();
        long k3 = scanner.nextLong();
        long k5 = scanner.nextLong();
        long k6 = scanner.nextLong();

        ghep256(k2,k5,k6);
        k2-=So2DaDung;
        ghep32(k2,k3);

        System.out.printf("%d", S);
    }
}
