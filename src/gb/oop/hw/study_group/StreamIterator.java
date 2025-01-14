package gb.oop.hw.study_group;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private Integer count;
    private final List<StudentGroup> studentGroupList;

    public StreamIterator(Stream stream) {
        this.count = 0;
        this.studentGroupList = stream.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupList.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return studentGroupList.get(count);
    }

    @Override
    public void remove() {
        studentGroupList.remove(count);
    }
}
