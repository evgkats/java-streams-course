package lectures;

import beans.Person;
import java.util.List;
import java.util.stream.IntStream;
import mockdata.MockData;
import org.junit.Test;

public class Lecture2 {

  @Test
  public void range() throws Exception {

    /* The old way */
    System.out.println("0 to 10 using the old way:");
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }

    /* Using streams */
    System.out.println("0 to 10 using streams:");
    IntStream.range(0, 10).forEach(System.out::println);

    System.out.println("0 to 10 using streams inclusive:");
    IntStream.rangeClosed(0, 10).forEach(System.out::println);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();

  }

  @Test
  public void intStreamIterate() throws Exception {
      IntStream.iterate(0, operand -> operand + 1)
          .filter(number -> number % 2 == 0)
          .limit(20)
          .forEach(System.out::println);
  }
}
