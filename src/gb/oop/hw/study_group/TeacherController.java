package gb.oop.hw.study_group;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }

    public void edit(Long id, String firstName, String lastName, String middleName) {
        teacherService.editTeacher(id, firstName, lastName, middleName);
    }

    public void print() {
        List<Teacher> teacherList = teacherService.getTeacherList();
        teacherView.sendOnConsole(teacherList);
    }
}
