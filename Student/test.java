package Student;

public class test {
    public static void main(String[] args) {
        // Inner class, so we need OuterClass.InnerClass syntax
        Student_Management_System.Student s1 =
            new Student_Management_System.Student("Shashank", "CSE(AI)", 101, 21);

        System.out.println("Student Name: " + s1.name);
        System.out.println("Department: " + s1.department);
        System.out.println("Roll No: " + s1.roll_no);
        System.out.println("Age: " + s1.age);
    }
}
