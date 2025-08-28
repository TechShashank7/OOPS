package Student;
public class Search {
    public void search(int roll_No){
        System.out.println("Searching student with roll number: " + roll_No);
    }
    public void search(String name,String department){
        System.out.println("Searching student with name: " + name + " in department: " + department);
    }
    public void search(String name,int roll_No){
        System.out.println("Searching student with name: " + name + " and roll number: " + roll_No);
    }
    public static void main(String[] args){
        Search search = new Search();
        search.search(101);
        search.search("Shashank", "Computer Science and Engineering(Artificial Intelligence)");
        search.search("Raj", 226);
    }
}
