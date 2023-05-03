public class Student {

    private String nameStudent;
    private String surnameStudent;

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public Student(String nameStudent, String surnameStudent) {
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;
    }
}
