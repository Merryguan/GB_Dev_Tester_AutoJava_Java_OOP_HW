package gb.oop.hw.study_group;

public class Teacher extends User implements Comparable<Teacher> {

    private Long teacherId;

    public Teacher(Long teacherId, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
