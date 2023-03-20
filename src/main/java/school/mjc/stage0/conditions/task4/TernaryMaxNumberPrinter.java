package school.mjc.stage0.conditions.task4;

import java.util.Scanner;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max,f;
        f=second>third?second:third;
        max=first>f?first:f;
        System.out.println(max);
    }
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        printGreatest(x,y,z);
    }
}
