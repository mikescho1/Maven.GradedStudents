package io.zipcoder;

import java.util.Comparator;

public class StudentAvgExamSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getAverageExamScore() - o1.getAverageExamScore() < 0) {
            return -1;
        } else if (o2.getAverageExamScore() - o1.getAverageExamScore() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
