public class FizzBuzz {
  private static String getFizzBuzzString(int number) {
    if (number % 15 == 0) {
      return "fizzBuzz";
    }

    if (number % 5 == 0) {
      return "buzz";
    }

    if (number % 3 == 0) {
      return "fizz";
    }

    return Integer.toString(number);
  }

  public static void main(String[] args) {
    int max = Integer.parseInt(args[0]);

    for (int i = 1; i <= max; i++) {
      System.out.print(getFizzBuzzString(i) + "\n");
    }
  }
}