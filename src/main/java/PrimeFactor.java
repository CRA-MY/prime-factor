import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int i) {
        List<Integer> factors = new ArrayList<>();
        if (i > 1) {
            factors.add(i);
        }
        return factors;
    }
}
