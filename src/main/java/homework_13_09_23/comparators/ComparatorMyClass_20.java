package homework_13_09_23.comparators;

import homework_13_09_23.MyClass;

import java.util.Comparator;

public class ComparatorMyClass_20 implements Comparator<MyClass> {

    @Override
    public int compare(MyClass o1, MyClass o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
