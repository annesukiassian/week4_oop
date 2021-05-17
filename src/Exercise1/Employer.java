package Exercise1;

public class Employer {
    String name;
    int age;
    String workPlace;
    int salary;

    public Employer() {

    }

    public Employer(String name, int age, String workPlace, int salary) {
        this.name = name;
        this.age = age;
        this.workPlace = workPlace;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age + " " + this.workPlace + " " + this.salary);
    }

}
