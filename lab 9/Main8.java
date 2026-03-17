class University {
    class Student {
        String name;
        String major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void display() {
            System.out.println(name + " - " + major);
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        university u = new university();
        university.Student s = u.new Student("Ali", "IT");
        s.display();
    }
}