package Exercise5;

public class Sort {
    public static void sort(Student[] students, String str) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].name.compareToIgnoreCase(students[j + 1].name) > 0) {
                    Student temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }

        }
    }

    public static void sort(Student[] students, int n) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].age > students[j + 1].age) {
                    Student temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public static void sort(Student[] students, double d) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].weight > students[j + 1].weight) {
                    Student temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}
