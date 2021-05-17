package Exercise3;

public class Main {
    public static void main(String[] args) {
        University university1 = new University("UFAR", 516, 1100, 65, 16);
        university1.printInfo();
        university1.checkFaculty(String.valueOf(2));
        university1.display();

    }
}
