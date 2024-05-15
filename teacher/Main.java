package teacher;

import student.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/deca/Desktop/teacher_data_file .csv.csv";
        List<Teacher> teachers = new ArrayList<>();
        TeacherService.readTeacherFile(teachers, filePath);
        TeacherService.writeTeacherFile(teachers);
    }
}
