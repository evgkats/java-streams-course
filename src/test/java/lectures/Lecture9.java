package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import org.junit.Test;

public class Lecture9 {

  @Test
  public void reduce() throws Exception {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    int sum = Arrays.stream(integers).reduce(0, (a, b) -> a + b);
//    int sum = Arrays.stream(integers).reduce(0, Integer::sum); // returns the same result
    System.out.println(sum);
  }


}

