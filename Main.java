/**
 * This is the standard Main() class starting point.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2020-11-06
 */

final class Main {
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
    System.out.println("The first number is 12.");
    newStack.push(12);
    System.out.println(newStack.getStack());

    System.out.println("The second number is 18.");
    newStack.push(18);
    System.out.println(newStack.getStack());

    System.out.println("\nPop out the first item in the stack.");
    newStack.pop();
    System.out.println(newStack.getStack());

    System.out.println("\nDone.");
  }
}

