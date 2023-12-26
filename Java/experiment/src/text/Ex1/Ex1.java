package text.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void m1(Scanner in) {
        int num = in.nextInt();
//        String ret = Integer.toOctalString(num);
//        System.out.println(ret);
        int a, b, c, d, ret;
        a = num % 8;
        num /= 8;
        b = num % 8;
        num /= 8;
        c = num % 8;
        num /= 8;
        d = num % 8;
        num /= 8;
        ret = a + b * 10 + c * 100 + d * 1000;
        System.out.println(ret);
    }

    public static void m2(Scanner in) {
//        System.out.println("请输入各项系数：");
        double a, b, c;
        double x1, x2;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1=" + x1 + ",x2=" + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("x1=" + x1 + ",x2=" + x1);
        } else {
            System.out.println("方程无解。");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m1(in);
        m2(in);
    }
}
