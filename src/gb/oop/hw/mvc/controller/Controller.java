package gb.oop.hw.mvc.controller;

import gb.oop.hw.mvc.model.*;
import gb.oop.hw.mvc.service.DataService;
import gb.oop.hw.mvc.service.StudyGroupService;
import gb.oop.hw.mvc.view.StudentView;

import java.util.List;

public class Controller {

    private final DataService service = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudentView view = new StudentView();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllUsers();
        for (User user: userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        return studyGroupService.createStudyGroup(teacher, studentList);
    }
}
