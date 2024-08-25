package baseball.service.criteria;

@FunctionalInterface
public interface StrikeCriteria<T> {
    boolean evaluate(T p1, T p2);
}
