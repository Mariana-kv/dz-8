import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student starosta = new Student("Diana  ", "S0");
        Student st1 = new Student("Maria  ", "S1");
        Student st2 = new Student("Petro  ", "S2");
        Student st3 = new Student("Mark  ", "S3");
        Student newStudent = new Student("Oksana  ", "S4");
        String task1 = "do homework";
        String task2 = "delete";
        String task3 = "perform";

        List<Student> students = new ArrayList<Student>(Arrays.asList(starosta, st1, st2, st3));
        List<String> tasks = new ArrayList<String>(Arrays.asList(task1, task2, task3));
        Group group = new Group(starosta, students, tasks);



        group.addNewStudent(newStudent);
        group.getStudentsList().forEach(student -> System.out.println("NAME: " + student.getNameStudent() +
                "SURNAME: " + student.getSurnameStudent()));

        System.out.println("_____________________\n");


        group.deleteStudent(st2);
        group.getStudentsList().forEach(student -> System.out.println("NAME: " + student.getNameStudent() +
                "SURNAME: "+ student.getSurnameStudent()));

    }
}