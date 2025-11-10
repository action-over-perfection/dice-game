package dice.util;

import java.util.function.Function;
import java.util.function.Supplier;

public class InputRepeater {
    public static <T> String askUntilValid(Supplier<T> supplier, Function<String, T> validator) {
        try {
            String data = supplier.get().toString();
            validator.apply(data);
            return data;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askUntilValid(supplier, validator);
        }
    }
}
