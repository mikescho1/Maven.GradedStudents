package io.zipcoder;

import java.util.Comparator;

public class StudentNameSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getLastName().compareTo(o2.getLastName()) < 0) {
            return -1;
        } else if (o1.getLastName().compareTo(o2.getLastName()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
