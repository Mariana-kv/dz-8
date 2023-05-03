import java.util.Iterator;
import java.util.List;

public class Group {
    private Student starostaGroup;
    private List<Student> studentsList;
    private List<String> tasks;

    public Student getStarostaGroup() {
        return starostaGroup;
    }

    public void setStarostaGroup(Student starostaGroup) {
        this.starostaGroup = starostaGroup;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public Group(Student starostaGroup, List<Student> studentsList, List<String> tasks) {
        this.starostaGroup = starostaGroup;
        this.studentsList = studentsList;
        this.tasks = tasks;
    }

    //ADD STAROSTA

    public void changeStarosta(Student newStarosta) {
        this.starostaGroup = newStarosta;
    }


    //ADD NEW STUDENT
    public void addNewStudent(Student newStudent) {
        this.studentsList.add(newStudent);
    }

    //RENAME STUDENT
    public void renameStudent(Student renStudent, String name, String surname) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getNameStudent() == renStudent.getNameStudent() &&
                    studentsList.get(i).getSurnameStudent() == renStudent.getSurnameStudent()) {
                studentsList.get(i).setNameStudent(name);
                studentsList.get(i).setSurnameStudent(surname);
                break;
            }
        }
    }

    // DELETE STUDENT
    public void deleteStudent(Student delStudent) {
        Iterator<Student> itr = studentsList.iterator();
        while (itr.hasNext()) {
            Student student = itr.next();
            if (student.equals(delStudent)) {
                itr.remove();
            }
        }
    }

    //ADD NEW TASK
    public void addNewTask(String newTask) {
        this.tasks.add(newTask);
    }
}




