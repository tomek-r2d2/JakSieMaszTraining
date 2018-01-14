package task1.company.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Position {
    Manager, Developer;

    private static final List<Position> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Position randomRole() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
