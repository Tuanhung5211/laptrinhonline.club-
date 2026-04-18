package Bai1;
import java.util.Scanner;
public class Bai1_1_LTOL {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.printf("L");
            }
            if(i%2!=0){
                System.out.printf("%d",i);
            }
            if(i%4==0){
                System.out.printf("T");
            }
            if(i%8==0){
                System.out.printf("O");
            }
            if(i%16==0){
                System.out.printf("L");
            }
            System.out.printf("\n");
        }

    }
}
