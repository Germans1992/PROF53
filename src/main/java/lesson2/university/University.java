package lesson2.university;

public class University {
    public static void main(String[] args) {

        Student max = new Student("Max", 20, 2, "Music");
        Staff alex = new Staff("Alex", 43, 50_000, "Math");

        Student margareth = new Student("Margareth", 21, 3, "politics");

        Person[] people = new Person[10];
        people[0] = max;
        people[1] = alex;
        people[2] = margareth;

        int sum = 0;
        for(int i = 0; i < people.length; i++)//пробегаемся по всем людям
        {
            if(people[i] != null) { // если не равно нулю
                sum += people[i].getAge(); // мы складываем возраст каждого по очереди
                people[i].introduce();
            }
        }
        System.out.println("Summary age: " + sum);
    }
}
