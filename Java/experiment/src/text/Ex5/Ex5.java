package text.Ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean isLeapYear = isLeapYear(year);
        int n = firstDay(year);
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print("\t\t\t" + (i * 3 + j) + "\t\t\t\t\t");
            System.out.println();
            for (int j = 0; j < 3; j++)
                System.out.print("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t\t");
            System.out.println();
            int[] marks = new int[13];
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear)
                days[2] = 29;
            for (int j = i * 3 + 1; j < i * 3 + 4; j++) {
                marks[j] = 7 - n;
                for (int k = 0; k < n; k++)
                    System.out.print("\t");
                for (int k = 1; k <= 7 - n; k++)
                    System.out.print(k + "\t");
                System.out.print("\t");
                switch (j) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        n += 3;
                        break;
                    case 2:
                        if (isLeapYear)
                            n += 1;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        n += 2;
                        break;
                }
                n %= 7;
            }
            System.out.println();
            for (int l = 0; l < 3; l++) {
                for (int j = i * 3 + 1; j < i * 3 + 4; j++) {
                    for (int k = 0; k < 7; k++) {
                        marks[j]++;
                        System.out.print(marks[j] + "\t");
                    }
                    System.out.print("\t");
                }
                System.out.println();
            }
            for (int l = 0; l < 2; l++) {
                for (int j = i * 3 + 1; j < i * 3 + 4; j++) {
                    int count = 0;
                    while (marks[j] < days[j] && count < 7) {
                        marks[j]++;
                        System.out.print(marks[j] + "\t");
                        count++;
                    }
                    for (int k = 0; k < 8 - count; k++)
                        System.out.print("\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int firstDay(int year) {
        year += (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
        return year % 7;
   }
}