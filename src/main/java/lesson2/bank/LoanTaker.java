package lesson2.bank;

public class LoanTaker {

    private String Name;
    private double yearlyIncome;
    private int age;

    public LoanTaker(String name, double yearlyIncome, int age) {
        Name = name;
        this.yearlyIncome = yearlyIncome;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
