package task0.jarbuilder.comparators;

import task0.jarbuilder.Person;
import java.util.Comparator;

public class NameComparator implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}
