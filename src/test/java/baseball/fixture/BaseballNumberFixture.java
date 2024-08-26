package baseball.fixture;

import baseball.model.vo.BaseballNumber;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("NonAsciiCharacters")
public class BaseballNumberFixture {

    public static List<Integer> 숫자_4자리_생성() {
        List<Integer> lists = new ArrayList<>();
        lists.add(1); lists.add(2); lists.add(3); lists.add(4);
        return lists;
    }

    public static List<Integer> 숫자_첫째_셋째_중복_생성() {
        List<Integer> lists = new ArrayList<>();
        lists.add(1); lists.add(3); lists.add(1);
        return lists;
    }

    public static List<Integer> 숫자_0포함_생성() {
        List<Integer> lists = new ArrayList<>();
        lists.add(1); lists.add(2); lists.add(0);
        return lists;
    }

    public static BaseballNumber 야구숫자_생성(int... num) {
        List<Integer> lists = new ArrayList<>();
        lists.add(num[0]); lists.add(num[1]); lists.add(num[2]);
        return BaseballNumber.of(lists);
    }

}
