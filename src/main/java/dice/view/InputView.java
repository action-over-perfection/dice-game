package dice.view;

import camp.nextstep.edu.missionutils.Console;
import dice.constant.DiceGameMessage;
import dice.util.InputValidator;

public class InputView {
    public String readPlayerName() {
        System.out.println(DiceGameMessage.PLAYER_NAME_PROMPT);
        String name = Console.readLine();
        InputValidator.validateNullOrBlank(name);
        return name;
    }
}