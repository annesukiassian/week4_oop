package Exercise3;

import java.util.Scanner;

public class University {
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int maxAgeOfStudent;
    int minAgeOfStudent;

    University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudent, int minAgeOfStudent) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudent = maxAgeOfStudent;
        this.minAgeOfStudent = minAgeOfStudent;
    }

    void printInfo() {
        System.out.println(this.name + " " + this.countOfStudents + " " + this.maxCountOfStudents + " " + this.maxAgeOfStudent + " " +
                this.minAgeOfStudent);
    }

    boolean checkAge(int age) {
        if (age >= minAgeOfStudent && age <= maxAgeOfStudent) {
            return true;
        }
        return false;
    }

    void admission() {
        System.out.println("Applied Mathematics -- 1”\n" +
                "“Computer science -- 2”\n" +
                "Business English -- 3");
    }

    void checkFaculty(String option) {
        if (option.charAt(0) == '1' || option.charAt(0) == '2' || option.charAt(0) == '3') {
            System.out.println("Input your age");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (checkAge(age)) {
                register();
            }
        }
    }

    void register() {
        countOfStudents++;
    }

    void display() {
        System.out.println(countOfStudents);
    }
}