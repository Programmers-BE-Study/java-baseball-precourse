package baseball.domain;

import java.util.Objects;

public final class Pitch {
    private final int pitch;

    public Pitch(int input) {
        if (input < 1 || input > 9) {
            throw new IllegalArgumentException();
        }
        this.pitch = input;
    }

    public int getPitch() {
        return pitch;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Pitch param = (Pitch) obj;
        return pitch == param.pitch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pitch);
    }
}
