package Collection.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ArrayListJava {
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(55,66,77)); //giving this array as a list to the constructor
        Vector<Integer> list3= new Vector<>();
        System.out.println(list2);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(2,50); //Pushes forward, makes place and then inserts
        list1.set(2,60); //Replaces
        list1.remove(1);
        list1.removeIf(x->x%2!=0);
        System.out.println(list1.contains(50));
        System.out.println(list1);
//        for(int i=0;i<list1.size();i++){
//            System.out.print(list1.get(i)+" ");
//        }
        System.out.println();
        for(int i:list1){
            System.out.print(i+" ");
        }
    }
}
