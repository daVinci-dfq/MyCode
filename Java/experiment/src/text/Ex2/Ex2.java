package text.Ex2;

import java.util.Scanner;

public class Ex2 {
    public static void m1(Scanner in) {
        final int num = 10;
        int n;
        int sum = 0, max = 0, min = 100;
        int secondMax = 0, secondMin = 100;
        for(int i = 0; i < num; i++){
            n = (int)(Math.random()*100+1);
            sum += n;
            if(n > max){
                secondMax = max;
                max = n;
            } else {
                if(n > secondMax) {
                    secondMax = n;
                }
            }
            if(n < min){
                secondMin = min;
                min = n;
            } else{
                if (n < secondMin) {
                    secondMin = n;
                }
            }
        }
        double average = sum*1.0/10;
        System.out.println("sum="+sum+
                ";" +
                "avg=" +average+
                ";" +
                "maxl=" +secondMax+
                ";" +
                "min=" +min+
                ";" +
                "minl=" +secondMin+
                ";" +
                "max=" +max
        );
    }

    public static void m2(Scanner in) {
        int n = in.nextInt();
        int i, j;
        for (i = 0; i < n - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < 2 * (i + 2) - 3; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (i = 0; i < n - 2; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < 2 * (n - i - 1) - 3; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        if (n != 1) {
            for (i = 0; i < n - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m1(in);
        m2(in);
    }
}
