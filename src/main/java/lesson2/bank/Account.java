package lesson2.bank;

public class Account {
    private String id;
    private String owner;
    private static int balance;

    public Account(String id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getId() {
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
        if(money < 0 )
        {
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
    public int credit(int money) {
        if(money > balance){
            System.out.println("Сумма больше баланса");
            return 0;
        }
      balance -= money;
        return balance;
    }

    //перевод денег со счета на счет
    //кредитуем свой счет и дебитуем account
    //возвращается баланс счета при
    //попытке снять больше чем есть на счете нужно печатать сообщения
    public static int transfer(String account, int amount) {

        System.out.println("Сумма в размере " + amount + " руб " + "переведена на " + account);
        balance -= amount;
        if( amount > balance){
            System.out.println("Сумма больше баланса");
            return amount;
        } else {
            System.out.println("Сумма в размере " + amount + " руб " + "переведена на " + account);
            balance -= amount;
        }
        return balance;
    }
}
