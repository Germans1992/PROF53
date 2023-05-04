package lesson2.bank;

public class LoanTester {
    public static void main(String[] args) {
        LoanTaker misha = new LoanTaker("Misha", 21_000,73);
        LoanIssuer dina = new LoanIssuer("dina", true,false);

        System.out.println(dina.toIssue(misha));

        LoanTaker alex = new LoanTaker("alex",26_000,30);
        LoanIssuer foma = new LoanIssuer("foma",false,false);

        System.out.println(foma.toIssue(alex));


    }
        }
