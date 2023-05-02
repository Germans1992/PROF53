package lesson1.japanese;

import java.util.EmptyStackException;

public class JapaneseEmployee {

    public static void main(String[] args) {
        JapaneseEmployee Mitsuo = new JapaneseEmployee("Mitsuo","Baso",120_000,4);
        JapaneseEmployee Akira = new JapaneseEmployee("Akira", "Kurosava", 100_000,12);

        System.out.println(Akira.getFirstName() + " " + Akira.calculateSalary());
        System.out.println(Mitsuo.getFirstName() + " " + Mitsuo.calculateSalary());

        Mitsuo.hello();
        Akira.hello();
    }

    public void hello(){
        if(years >= 10)
            System.out.println("Добрый день " + firstName + " " + secondName);
         else System.out.println("Привет " + firstName);
    }

    private String firstName;
    private String secondName;
    private double baseSalary;
    private int years;

    private double deltaSalary;

    public static int delta = 10_000;

    public double calculateSalary(){
       return baseSalary + delta * years;
    }


    public JapaneseEmployee(String firstName, String secondName, double baseSalary, int years) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.baseSalary = baseSalary;
        this.years = years;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
