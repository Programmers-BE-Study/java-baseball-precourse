package baseball.service.criteria;

import java.util.Collection;

@FunctionalInterface
public interface BallCriteria<T> {
    boolean evaluate(T pitch, Collection<T> pitches);
}
