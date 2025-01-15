package gb.oop.hw.mvc.service;

import gb.oop.hw.mvc.model.Student;
import gb.oop.hw.mvc.model.StudyGroup;
import gb.oop.hw.mvc.model.Teacher;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }
}
