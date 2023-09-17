package homework_13_09_23.comparators;

import homework_13_09_23.MyClass;

import java.util.Comparator;

public class NameComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
