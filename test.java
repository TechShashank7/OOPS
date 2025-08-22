import Student.Student_Management_System.Student;  // ✅ Import inner class

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("Shashank", "CSE(AI)", 101, 21);
        System.out.println("Student Name: " + s1.name);
        System.out.println("Department: " + s1.department); 
        System.out.println("Roll No: " + s1.roll_no);
        System.out.println("Age: " + s1.age);
    }
}
