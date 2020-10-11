package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> solution = new ArrayList<>();
        final int limit = 10;
        int count = 0;
        for (Person person : people) {
            if (person.getAge() <= 18) {
                solution.add(person);
                count ++;
            }
            if (count == limit) break;
        }
        for (Person p : solution) {
            System.out.println(p);
        }
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        ImmutableList<Person> people = MockData.getPeople();

        List<Person> young = people.stream()
                .filter(person -> person.getAge() >= 18)
                .limit(10)
                .collect(Collectors.toList());

        young.forEach(System.out::println);

        /* One command approach */
        System.out.println("-------- One command approach --------");
        MockData.getPeople()
                .stream()
                .filter(person -> person.getAge() >= 18)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
