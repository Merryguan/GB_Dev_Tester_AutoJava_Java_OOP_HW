package gb.oop.hw.mvc.model;

public class Student extends User{

    private int studentId;

    public Student(int studentId, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
