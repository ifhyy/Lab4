import java.util.Comparator;

public class SortByPrice implements Comparator<Clothes> {
    public int compare(Clothes obj1, Clothes obj2) {
        return obj1.getPrice() - obj2.getPrice();
    }
}
