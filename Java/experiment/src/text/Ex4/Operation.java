package text.Ex4;

public class Operation {
    public static void main(String[] args) {

        BankAccount zhangSan = new BankAccount("001", "zhangsan", 100);
        BankAccount liSi = new BankAccount("002", "lisi", 500);

        zhangSan.saveMoney(Math.random() * 200 + 1);
        zhangSan.withdrawMoney(Math.random() * 200 + 1);
        zhangSan.checkBalance();

        liSi.saveMoney(Math.random() * 200 + 1);
        liSi.withdrawMoney(Math.random() * 200 + 1);
        liSi.checkBalance();
    }
}
