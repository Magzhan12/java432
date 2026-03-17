class Company {
    class Employee {
        String name;
        String position;

        Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        void display() {
            System.out.println(name + " - " + position);
        }
    }
}

public class Main13 {
    public static void main(String[] args) {
        Company c = new Company();
        Company.Employee e = c.new Employee("Ali", "Manager");
        e.display();
    }
}