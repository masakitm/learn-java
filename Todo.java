import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Todo {
  static List<String> todos = new ArrayList<String>();

  public static void print (Object param) {
    System.out.print(param);
  }

  public static void addTodo (String todoName) {
    todos.add(todoName);
  }

  public static void main (String[] args) {
    List<String> argsList = Arrays.asList(args);
    argsList.forEach(e -> addTodo(e));
    print(todos);
  }
}