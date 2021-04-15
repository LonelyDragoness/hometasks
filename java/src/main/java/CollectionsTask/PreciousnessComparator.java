package CollectionsTask;

import java.util.Comparator;

public class PreciousnessComparator implements Comparator<Gemstone> {

    public int compare(Gemstone o1, Gemstone o2) {
        return o1.getPreciousness().ordinal() - o2.getPreciousness().ordinal();
    }
}
