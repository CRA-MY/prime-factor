import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> factors = new ArrayList<>();
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        if (number > 2) {
            factors.add(number);
        }
        return factors;
    }
}
