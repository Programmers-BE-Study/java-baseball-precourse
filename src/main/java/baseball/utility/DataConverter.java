package baseball.utility;

import baseball.domain.Pitch;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;


public final class DataConverter {

    public static List<Pitch> readData() {
        try {
            int input = Integer.parseInt(Console.readLine());
            return convertToPitch(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    private static List<Pitch> convertToPitch(int input) {
        Pitch first = new Pitch(input / 100);
        Pitch second = new Pitch((input/10)%10);
        Pitch third = new Pitch(input % 10);

        return Arrays.asList(first, second, third);
    }

    private DataConverter() {

    }
}
