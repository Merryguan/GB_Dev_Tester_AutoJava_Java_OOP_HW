package gb.oop.hw.study_group;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private List<Stream> streamList;

    public StreamService(List<Stream> streamList) {
        this.streamList = streamList;
    }

    public StreamService() {
        this(new ArrayList<>());
    }

    public List<Stream> getSortedStreamList(List<Stream> streamList) {
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
