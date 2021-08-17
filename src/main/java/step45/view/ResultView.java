package step45.view;

import java.util.List;
import step45.domain.Car;

public class ResultView {

  private static final String RESULT_DIVIDER = "\n";

  public static void printResultTitle() {
    System.out.println("\n실행 결과");
  }

  public static void printCurrentRoundResult(List<Car> carList) {
    for (Car car : carList) {
      System.out.print(car.getName() + " : ");
      printCarLocation(car);
    }
  }

  public static void printRoundDivider() {
    System.out.print(RESULT_DIVIDER);
  }

  public static void printWinnerList(final List<Car> winners) {
    if (winners.size() == 0) {
      System.out.println("우승자가 없습니다.");
      return;
    }
    System.out.print(winners.get(0).getName());
    for (int i = 1; i < winners.size(); i++) {
      System.out.print(", " + winners.get(i).getName());
    }
    System.out.println("가 최종 우승했습니다.");
  }

  private static void printCarLocation(Car car) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < car.getLocation(); i++) {
      sb.append("-");
    }
    System.out.println(sb);
  }
}
