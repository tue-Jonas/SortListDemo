package at.htlhl.sortlistdemo;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int lastNameCompare = p1.getLastName().compareTo(p2.getLastName());

        // if the lastnames are equal, compare the firstnames
        if (lastNameCompare == 0) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }

        return lastNameCompare;
    }

}
