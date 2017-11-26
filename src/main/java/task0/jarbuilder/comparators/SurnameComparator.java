package task0.jarbuilder.comparators;

import task0.jarbuilder.Person;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
