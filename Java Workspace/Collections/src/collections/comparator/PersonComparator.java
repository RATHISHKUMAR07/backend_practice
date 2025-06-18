package collections.comparator;

import java.util.*;

public class PersonComparator {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", "Doe", 25),
            new Person("John", "Doe", 30),
            new Person("Alice", "Smith", 30),
            new Person("Bob", "Smith", 22),
            new Person("Charlie", "Brown", 22)
        );

        // Comparator with multiple comparing criteria
        Comparator<Person> personComparator = Comparator
            .comparing(Person::getLastName)
            .thenComparing(Person::getFirstName)
            .thenComparing(Person::getAge);

        // Sort the list using the comparator
        Collections.sort(people, personComparator);

        // Print sorted list
        people.forEach(System.out::println);
    }
}
