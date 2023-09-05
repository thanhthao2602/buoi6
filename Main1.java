
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh : ");
        int n = s.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap hoc sinh thu " + (i + 1) + ": ");
            Student student = new Student();
            student.input();
            students.add(student);

        }
        System.out.println("***************************");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin hoc sinh thu  "+(i + 1)+" : ");
        }
        for (Student student : students) {
            student.output();
        }

    }
}
