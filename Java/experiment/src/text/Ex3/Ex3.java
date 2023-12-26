package text.Ex3;

import java.io.File;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception{
        String equation = "";
        Scanner scan = new Scanner(new File("/teach/data/java/SEx4.txt"));
        while (scan.hasNext()) {
            equation = scan.nextLine();
            if (equation == null || equation.length() == 0)
                break;
            double num1 = 0, num2 = 0, num3 = 0;
            char c1, c2;
            int i;
            for (i = 0; equation.charAt(i) != ' '; i++) {
                num1 = num1 * 10 + (equation.charAt(i) - 48);
            }
            c1 = equation.charAt(++i);
            for (i += 2; i < equation.length() && equation.charAt(i) != ' '; i++) {
                num2 = num2 * 10 + (equation.charAt(i) - 48);
            }
            if (i < equation.length()) {
                do {
                    c2 = equation.charAt(++i);
                    for (i += 2; i < equation.length() && equation.charAt(i) != ' '; i++) {
                        num3 = num3 * 10 + (equation.charAt(i) - 48);
                    }
                    if (c2 == '*' && c1 != '/') {
                        num2 *= num3;
                    } else if (c2 == '/') {
                        num2 /= num3;
                    } else {
                        switch (c1) {
                            case '+':
                                num1 += num2;
                                break;
                            case '-':
                                num1 -= num2;
                                break;
                            case '*':
                                num1 *= num2;
                                break;
                            case '/':
                                num1 /= num2;
                                break;
                        }
                        c1 = c2;
                        num2 = num3;
                    }
                    num3 = 0;
                } while (i < equation.length());
            }
            switch (c1) {
                case '+':
                    num1 += num2;
                    break;
                case '-':
                    num1 -= num2;
                    break;
                case '*':
                    num1 *= num2;
                    break;
                case '/':
                    num1 /= num2;
                    break;
            }
            System.out.println(equation + "=" + num1);
        }
    }
}
