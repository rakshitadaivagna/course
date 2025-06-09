public class Course {
    String name;
    int marks;

    Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Student {
    String name = "Priya";
    String program = "DevOps";
    int semester = 4;

    Course[] courses = {
            new Course("Java", 95),
            new Course("Math", 35),
            new Course("Python", 85)
    };

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
    }

    void displayLowMarks() {
        System.out.println("\nCourses with marks below 40:");
        boolean found = false;
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println(c.name + " - " + c.marks);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
        s.displayLowMarks();
    }
}
