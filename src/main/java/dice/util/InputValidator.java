package dice.util;

import dice.constant.ErrorMessage;

public class InputValidator {
    public static void validateNullOrBlank(String str) {
        if (str.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.PLAYER_NAME_NULL_OR_BLANK);
        }
    }
}
