import java.util.Comparator;

public class SortByType implements Comparator<Clothes> {
    public int compare(Clothes obj1, Clothes obj2) {
        return obj1.getType().compareToIgnoreCase(obj2.getType());
    }
}
