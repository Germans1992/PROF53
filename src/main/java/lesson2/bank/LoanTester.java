package lesson2.bank;

public class LoanTester {
    public static void main(String[] args) {
        LoanTaker misha = new LoanTaker("Misha", 21_000, 73);
        LoanIssuer dina = new LoanIssuer("dina", true, false);

        System.out.println(dina.toIssue(misha));

        LoanTaker alex = new LoanTaker("alex", 26_000, 30);
        LoanIssuer foma = new LoanIssuer("foma", false, false);

        System.out.println(foma.toIssue(alex));

        Account a1 = new Account("123", "Misha Semenov", 30);
        Account a2 = new Account("456", "Sergey Petrov", 45);
        a1.transfer(a2, 30);
        System.out.println(a1.balance);
        System.out.println(a2.balance);
    }
}
