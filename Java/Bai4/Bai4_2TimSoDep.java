package Bai4;

import java.util.Scanner;

//So luong so chan va so le bang nhau
public class Bai4_2TimSoDep {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        long n= scanner.nextLong();;
        String s=Long.toString(n);
        int chan=0;
        int le=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)%2==0){
                chan+=1;
            }
            else{
                le+=1;
            }
        }
        if(chan==le){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}

