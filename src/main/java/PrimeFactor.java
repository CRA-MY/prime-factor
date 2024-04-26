import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int i) {
        List<Integer> factors = new ArrayList<>();
        if (i == 2) {
            factors.add(2);
        }
        return factors;
    }
}
