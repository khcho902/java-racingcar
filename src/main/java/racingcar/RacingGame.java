package racingcar;

import racingcar.ui.RacingDataInput;
import racingcar.ui.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final List<Car> racingCars = new ArrayList<>();
    private final RacingData racingData;

    public RacingGame(RacingDataInput racingDataInput) {

        racingData = racingDataInput.getRacingData();

        for (int i = 0; i < racingData.getNumberOfCars(); i++) {
            racingCars.add(new Car());
        }
    }

    public void start() {

        ResultView.lineFeed();
        ResultView.printStart();

        for (int i = 0; i < racingData.getTryCount(); i++) {
            moveCar(Fuel.inject());
            printCurrentStatus();

            ResultView.lineFeed();
        }
    }

    private void moveCar(int fuel) {
        for (int i = 0; i < racingData.getNumberOfCars(); i++) {
            racingCars.get(i).moveAndStop(fuel);
        }
    }

    private void printCurrentStatus() {
        for (int i = 0; i < racingData.getNumberOfCars(); i++) {
            ResultView.printResult(racingCars.get(i));
        }
    }
}