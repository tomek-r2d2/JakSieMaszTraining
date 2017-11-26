package task0.jarbuilder.comparators;

import task0.jarbuilder.Person;

import java.util.Comparator;

public class EmailComparator implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
