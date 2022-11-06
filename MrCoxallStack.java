import java.util.ArrayList;
import java.util.List;
/**
 * The MrCoxall stack.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-11-06
 */

public class MrCoxallStack {
  /**
   * a list that contains the input number.
   *
   */
  List<String> stackAsList = new ArrayList<String>();
  /**
   * The push() function.
   *
   */

  public void push(int someNumber) {
    stackAsList.add(String.valueOf(someNumber));
  }
  
  /**
   * The show() function.
   *
   */

  public void showStack() {
    System.out.println(stackAsList);
  }
}

