package baseball.utils.valid;

import baseball.utils.constant.ValidatorKey;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Validators {

    public static Map<ValidatorKey, Validator> getInstance() {
        return Singleton.VALIDATOR_MAP;
    }

    public static Validator getValidator(ValidatorKey key) {
        return Singleton.VALIDATOR_MAP.get(key);
    }

    private static class Singleton {
        private static final Map<ValidatorKey, Validator> VALIDATOR_MAP = createValidatorMap();

        private static Map<ValidatorKey, Validator> createValidatorMap() {
            Map<ValidatorKey, Validator> validatorMap = new HashMap<>();
            validatorMap.put(ValidatorKey.COMMAND, new CommandValidator());
            return Collections.unmodifiableMap(validatorMap); // 불변 맵으로 변환
        }
    }
}
