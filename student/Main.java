package student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       String filePath = "/Users/deca/Desktop/student_data_file.csv.csv";
        List<Student> students = new ArrayList<>();

        StudentService.readFile(students, filePath);
        StudentService.writeFile(students);
    }
}
