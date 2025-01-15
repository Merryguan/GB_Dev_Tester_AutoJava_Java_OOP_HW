package gb.oop.hw.study_group;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private List<Teacher> teacherList;
    private Long teacherCounter;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
        this.teacherCounter = 0L;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherCounter = teacherCounter + 1;
        teacherList.add(new Teacher(teacherCounter, firstName, lastName, middleName));
    }

    private Integer findById(Long teacherId) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getTeacherId().equals(teacherId)) {
                return i;
            }
        }
        return null;
    }

    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
        int index;
        if (findById(teacherId) != null) {
            index = findById(teacherId);
            teacherList.get(index).setFirstName(firstName);
            teacherList.get(index).setMiddleName(middleName);
            teacherList.get(index).setLastName(lastName);
        }
    }
}
