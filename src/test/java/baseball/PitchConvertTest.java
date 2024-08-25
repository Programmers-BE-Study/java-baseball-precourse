package baseball;

import baseball.domain.Computer;
import baseball.domain.Pitch;
import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PitchConvertTest {

    @Test
    void random() {
        int random = Randoms.pickNumberInRange(1, 9);
        System.out.println(random);
        Assertions.assertThat(random).isNotNull();
    }
    
    @Test
    void computerSetTest() {
        Computer computer = new Computer();
        computer.setPitches();
        for (Pitch pitch : computer.getPitches()) {
            System.out.println("pitch.toString() = " + pitch.toString());
            
        }
        Assertions.assertThat(computer.getPitches()).isNotNull();
    }
}
