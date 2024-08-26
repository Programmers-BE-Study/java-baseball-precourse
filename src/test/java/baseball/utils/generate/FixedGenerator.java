package baseball.utils.generate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedGenerator implements Generator{
    @Override
    public List<Integer> generate() {
        return new ArrayList<>(Arrays.asList(1,2,3));
    }

}
