public class Main {
    public static void main(String[] args) {
        // Teachers
        Teacher t1 = new Teacher("Alice", "Math", 50000);
        Teacher t2 = new Teacher("Bob", "CS", 60000);

        // Students
        Student s1 = new Student("John", "S001", 20000);
        Student s2 = new Student("Mary", "S002", 25000);

        // Department
        Department csDept = new Department("Computer Science");
        csDept.add(t2);
        csDept.add(s1);
        csDept.add(s2);

        // College
        College engCollege = new College("College of Engineering");
        engCollege.add(t1);
        engCollege.add(csDept);

        // Display details
        engCollege.getDetails();

        // Total students
        System.out.println("Total Students: " + engCollege.getStudentCount());

        // Total budget
        System.out.println("Total Budget: " + engCollege.getBudget());
    }
}
