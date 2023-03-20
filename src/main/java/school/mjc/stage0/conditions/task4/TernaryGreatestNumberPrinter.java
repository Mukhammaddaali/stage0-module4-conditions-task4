package school.mjc.stage0.conditions.task4;

import java.util.Scanner;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        System.out.println(first>second?first:second);
    }
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        printGreatest(x,y);
    }
}
