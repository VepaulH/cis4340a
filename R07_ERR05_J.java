// Noncompliant code
// Rule 07. Exceptional Behavior (ERR) - ERR05-J

public class Operation {
  public static void doOperation(String some_file) {
    // ... Code to check or set character encoding ...
    try {
      BufferedReader reader =
          new BufferedReader(new FileReader(some_file));
      try {
        // Do operations 
      } finally {
        reader.close();
        // ... Other cleanup code ...
      }
    } catch (IOException x) {
      // Forward to handler
    }
  }
}
