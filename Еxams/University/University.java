package Еxams.University;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    public List<Student> students;
    public int capacity;

    public University(int capacity) {
        this.capacity = capacity;
        students = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return students.size();
    }

    public String registerStudent(Student student) {
        String result = null;
        if (getStudentCount() >= capacity) {
            result = "No seats in the university";
        }
        for (Student s : students) {
            if (s.getFirstName().equals(student.getFirstName()) && s.getLastName().equals(student.getLastName())) {
                result = "Student is already in the university";
                break;
            }
        }
        if (result == null) {
            students.add(student);
            result = "Added student " + student.getFirstName() + " " + student.getLastName();
        }
        return result;
    }

    public Student getStudent(String firstName, String lastName) {
        return students.stream().filter(student -> student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
                .findFirst().orElse(null);
    }

    public String dismissStudent(Student student) {
        boolean haveStudent = students.removeIf(student1 -> student1.getFirstName().equals(student.firstName)
                && student1.getLastName().equals(student.lastName));
        if (haveStudent) {
            return String.format("Removed student %s %s", student.firstName, student.lastName);
        }
        return "Student not found";
    }

    public String getStatistics() {
        return students.stream().map(s -> String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s",
                s.getFirstName(), s.getLastName(), s.getBestSubject())).collect(Collectors.joining(System.lineSeparator()));
    }

}
