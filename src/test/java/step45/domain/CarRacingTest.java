package step45.domain;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CarRacingTest {

  @Test
  void isFinishTest() {
    //given
    int tryNum = 10;
    String[] carNames = {"car1", "car2", "car3"};
    CarRacing carRacing = new CarRacing(carNames, tryNum, new RandomMoveStrategy());

    //then
    for (int i = 0; i < 10; i++) {
      assertThat(carRacing.isFinish()).isEqualTo(false);
      carRacing.moveCars();
    }
    assertThat(carRacing.isFinish()).isEqualTo(true);
  }
}