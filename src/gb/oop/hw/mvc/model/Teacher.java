package gb.oop.hw.mvc.model;

public class Teacher extends User {

    private int teacherId;

    public Teacher(int teacherId, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
