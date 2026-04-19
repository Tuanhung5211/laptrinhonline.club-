package Bai3;

import java.util.Scanner;

public class Bai3_2SoYeuThichCuaAnton_NEW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k2 = scanner.nextLong();
        long k3 = scanner.nextLong();
        long k5 = scanner.nextLong();
        long k6 = scanner.nextLong();
        //So luong 256 co the tao duoc
        long ghep256=Math.min(k2,Math.min(k5,k6));
        long So2ConLai=k2-ghep256;
        //So luong 32 co the tao duoc
        long ghep32=Math.min(So2ConLai,k3);

        System.out.printf("%d",256*ghep256+32*ghep32);
    }
}
