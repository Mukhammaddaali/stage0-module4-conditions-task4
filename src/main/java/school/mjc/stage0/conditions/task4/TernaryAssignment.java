package school.mjc.stage0.conditions.task4;

import java.util.Scanner;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result;
        result=first>second?10:-10;
        System.out.println(result);
    }
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        assignAndPrintBasedOnWhichBigger(x,y);
    }

}
