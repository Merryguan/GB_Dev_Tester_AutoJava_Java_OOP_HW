package gb.oop.hw.study_group;

import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();
    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Stream> getSortedStreamList(List<Stream> streamList) {
        return streamService.getSortedStreamList(streamList);
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
