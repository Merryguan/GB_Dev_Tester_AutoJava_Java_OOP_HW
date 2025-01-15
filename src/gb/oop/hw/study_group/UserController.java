package gb.oop.hw.study_group;

public interface UserController<T extends User> {

    void create(String firstName, String lastName, String middleName);
}
