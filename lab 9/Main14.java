class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println(name + " studies " + courseName);
        }
    }
}

public class Main14 {
    public static void main(String[] args) {
        Course c = new Course("Java");
        Course.Student s = c.new Student("Aruzhan");
        s.display();
    }
}