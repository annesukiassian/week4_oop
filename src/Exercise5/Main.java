package Exercise5;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("lalod", 24, 64);
        Student student3 = new Student("galod", 27, 74);
        Student student4 = new Student("talod", 5, 121);
        Student student5 = new Student("Malod", 1, 8);
        Student student2 = new Student("Hakobik", 0, 0);
        Student[] students = new Student[5];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        Sort.sort(students, student1.name);
        System.out.println("Sorting by names");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println("Sorting by age");
        Sort.sort(students, student1.age);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
        Sort.sort(students, 52.6);
        System.out.println("Sorting by weight");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

    }
}
