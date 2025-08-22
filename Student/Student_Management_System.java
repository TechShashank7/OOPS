package Student;

public class Student_Management_System {
    public static class Student {
        public String name;
        private String department;
        protected int roll_no;
        int age;
        static String clgname = "KIET";

        public void studies(int hours){
            System.out.println("The student " + name + " is studying for " + hours + " hours");
        }
        public void readAndwrite(){
            System.out.println("The student can read and write");
        }
        public void display(String name){
            System.out.println("Name is " + name);
        }
        public Student(String name, String department, int roll_no, int age){
            this.name = name;
            this.department = department;
            this.roll_no = roll_no;
            this.age = age;
        }
        public Student(){
            this.name = null;
            this.department = null;
            this.roll_no = 0;
            this.age = 0;
        }
    }

    public static void main(String[] args){
        Student student = new Student();
        Student student1 = new Student();
        student.readAndwrite();
        student.display("Shashank");
        student1.studies(5);

        System.out.println(student1.clgname);
        student1.clgname = "IIT Delhi";
        System.out.println(student1.clgname);

        Student s1 = new Student("Shashank","CSE AI",6,20);
        System.out.println(s1.name+" from "+s1.department+
            " has Roll No. "+ s1.roll_no+" and is "+ s1.age+" years old");
    }
}
