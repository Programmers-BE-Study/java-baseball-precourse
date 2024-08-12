package baseball.model;

import baseball.utils.generate.Generator;

import java.util.List;

public class Computer {

    private final Generator numberGenerator;
    private List<Integer> computerNumbers;

    public Computer(Generator generator) {
        this.numberGenerator = generator;
    }

    public List<Integer> getComputerNumbers() {
        return this.computerNumbers;
    }

    public void createAnswer() {
        computerNumbers = numberGenerator.generate();
    }
}
