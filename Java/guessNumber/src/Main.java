import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int target = (int) (Math.random()*100+1);
        int num;
        System.out.println("我想好了一个1到100数字，请猜一下：");
        do{
            num = in.nextInt();
            if (num > target){
                System.out.println("你猜的偏大了，再试一次：");
            } else if (num < target) {
                System.out.println("你猜的偏小了，再试一次：");
            }
            count++;
        }while(num != target);
        if(count <= 7){
            System.out.println("恭喜你猜对了。你仅仅用了"+count+"次，你真牛！");
        } else {
            System.out.println("你终于猜对了，用了"+count+"次，真菜！");
        }
    }
}