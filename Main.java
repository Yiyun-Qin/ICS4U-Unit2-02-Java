import java.util.Scanner;
/**
 * This is the standard Main() class starting point.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2020-11-06
 */

final class Main {
  static String someNumberString;
  static int someNumber;
  /**
   * Prevent instantiation.
   * Throw an exception IllegalStateException.
   * if this ever is called
   *
   * @throws IllegalStateException
   *
   */

  private Main() {
    throw new IllegalStateException("Cannot be instantiation");
  }

  /**
   * The starting main() function.
   *
   */
  public static void main(final String[] args) {
    MrCoxallStack newStack = new MrCoxallStack();
    Scanner myobj = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    someNumberString = myobj.next();
    try {
      someNumber = Integer.parseInt(someNumberString);
      newStack.push(someNumber);
      newStack.showStack();
    } catch (Exception e) {
      System.out.println("Invalid number!");
    } finally {
      System.out.println("\nDone.");
    }
  }
}

