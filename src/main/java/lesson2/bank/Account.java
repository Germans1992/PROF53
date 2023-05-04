package lesson2.bank;

public class Account {
    private final int id;
    private final String owner;
    private static int balance;
    private int account;

    public Account(int id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        Account.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    //дописать методы
    //добавление денег насчет
    //возвращение полученного баланса
    public int debit(int money) {
        if (money < 0) {
            System.out.println("Отрицательная сумма денег дебита");
        } else {
            balance += money;
        }
        return balance;
    }

    //Удаление денег со счета, нельзя удалить больше чем на счете есть
    // При попытке удалить больше, не нужно менять баланс счета, но нужно
    // печатать об этом сообщение!
    //возвращается количество денег на балансе
    public static int credit(int money) {
        if (money > balance) {
            System.out.println("Сумма больше баланса");
            return 0;
        }
        balance -= money;
        return balance;
    }

    //перевод денег со счета на счет
    //кредитуем свой счет и дебетуем account
    //возвращается баланс счета при
    //попытке снять больше чем есть на счете нужно печатать сообщения
//    public static int transfer(String account, int amount) {
//        if (balance < amount) {
//            System.out.println("Денег недостаточно ");
//            return balance;
//        } else {
//            int amountDebited = (balance - credit(amount));
//            account.debit(amountDebited);
//            return balance;
//        }
//    }
}