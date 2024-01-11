package at.htlhl.sortlistdemo;

import java.util.ArrayList;
import java.util.List;

public class SortListDemo {

    private List<Person> personList;

    public SortListDemo() {
        personList = new ArrayList<>();

        fillList();
    }

    private void fillList() {
        personList.add(new Person("Franciszek", "Wywial"));
        personList.add(new Person("Sebastian", "Kufner"));
        personList.add(new Person("Matthias", "Bigl"));
        personList.add(new Person("Thomas", "Baumeister"));
        personList.add(new Person("Mario", "Toifl"));
        personList.add(new Person("Noah", "Mayerhuber"));
    }

    public static void main(String[] args) {
        new SortListDemo();
    }
}