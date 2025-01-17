package teacher;

import java.io.*;
import java.util.List;

public class TeacherService {
    public static void readTeacherFile(List<Teacher>teachers, String filePath){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = br.readLine())!=null){
                String[] fields = line.split(",", -1);
                for(int i = 0; i < fields.length; i++){
                    if(fields[i].isEmpty()){
                        fields[i] = "null";
                    }
                }
                Teacher teacher = new Teacher(fields[0],fields[1],fields[2],fields[3]);
                teachers.add(teacher);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(Teacher teacher : teachers){
            System.out.println(teacher);
        }
    }

    public static void writeTeacherFile(List<Teacher> teachers){
        String destinationPath = System.getProperty("user.home") + "/IdeaProjects/Assignment/src/resource/teacher/";
        try{
            FileWriter fw = new FileWriter(destinationPath + "/teacher_output_data.csv");
            for(Teacher teacher : teachers){
                fw.write(teacher.getTeacherId() + ",");
                fw.write(teacher.geteMail() + ",");
                fw.write(teacher.getFirstName() + ",");
                fw.write(teacher.getLastName() + "\n");

            }
            fw.close();
            System.out.println("Successfully written to a new file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
