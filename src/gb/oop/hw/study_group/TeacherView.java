package gb.oop.hw.study_group;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Teacher teacher: list) {
            stringBuilder.append(teacher.getTeacherId()).append(", ")
                    .append(teacher.getFirstName()).append(", ")
                    .append(teacher.getMiddleName()).append(", ")
                    .append(teacher.getLastName());
            System.out.println(stringBuilder);
        }
    }
}
