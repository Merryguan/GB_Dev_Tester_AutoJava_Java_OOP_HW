package gb.oop.hw.study_group;

import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO() {
        return studentGroupService.getSortedStudentByFIO();
    }

    private final StreamService streamService = new StreamService();

    public List<Stream> getSortedStreamList() {
        return streamService.getSortedStreamList();
    }
}
