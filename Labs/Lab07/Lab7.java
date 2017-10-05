import java.util.LinkedList;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class Lab7{
  public static void main(String[] args){


    //My Collections
    LinkedList<Integer> l = new LinkedList<Integer>();
    int[] arr = new int[50000];
    ArrayList<Integer> arrlist = new ArrayList<Integer>();


    //Insertion
    long startTime = System.nanoTime();
    for (int i = 0; i < 50000; i++){
      l.add(i);

    }
    long endTime = System.nanoTime();

    long duration = (endTime - startTime);
    System.out.println("LinkedList insertion: " + duration/1000000000.0);

    startTime = System.nanoTime();
    for (int i = 0; i < 50000; i++){
      arrlist.add(i);

    }
    endTime = System.nanoTime();

    duration = (endTime - startTime);
    System.out.println("ArrayList insertion: " + duration/1000000000.0);

    startTime = System.nanoTime();
    for (int i = 0; i < 50000; i++){
      arr[i] = i;
    }
    endTime = System.nanoTime();

    duration = (endTime - startTime);
    System.out.println("Array insertion: " + duration/1000000000.0);

    //Traversal

    startTime = System.nanoTime();
    for (int i: l){

    }
    endTime = System.nanoTime();

    duration = (endTime - startTime);
    System.out.println("LinkedList traversal: " + duration/1000000000.0);

    startTime = System.nanoTime();
    for (int i: arrlist){

    }
    endTime = System.nanoTime();

    duration = (endTime - startTime);
    System.out.println("ArrayList traversal: " + duration/1000000000.0);

    startTime = System.nanoTime();
    for (int i: arr){

    }
    endTime = System.nanoTime();

    duration = (endTime - startTime);
    System.out.println("Array traversal: " + duration/1000000000.0);

    //Deletion

    startTime = System.nanoTime();
    for (int i = 0; i < 50000; i++){
      l.remove();
    }
    endTime = System.nanoTime();

    duration = (endTime - startTime);
    System.out.println("LinkedList deletion: " + duration/1000000000.0);

    startTime = System.nanoTime();
    for (int i = 0; i < 50000; i++){
      arrlist.remove(0);
    }
    endTime = System.nanoTime();

    duration = (endTime - startTime);
    System.out.println("ArrayList deletion: " + duration/1000000000.0);

    startTime = System.nanoTime();
    for (int i = 0; i < 50000; i++){
      arr[i] = 0;
    }
    endTime = System.nanoTime();

    duration = (endTime - startTime);
    System.out.println("Array deletion: " + duration/1000000000.0);

    PriorityQueue<String> pq1 = new PriorityQueue<String>();
    PriorityQueue<String> pq2 = new PriorityQueue<String>();

    pq1.add("George");
    pq1.add("Jim");
    pq1.add("John");
    pq1.add("Blake");
    pq1.add("Kevin");
    pq1.add("Michael");

    pq2.add("George");
    pq2.add("Katie");
    pq2.add("Kevin");
    pq2.add("Michelle");
    pq2.add("Ryan");



    PriorityQueue<String> temp = new PriorityQueue<String>();

    temp.add("George");
    temp.add("Jim");
    temp.add("John");
    temp.add("Blake");
    temp.add("Kevin");
    temp.add("Michael");
    //union
    for (String name: pq2){
      if (!pq1.contains(name)){
        temp.add(name);
      }
    }
    System.out.println(temp);
    temp.clear();
    temp.add("George");
    temp.add("Jim");
    temp.add("John");
    temp.add("Blake");
    temp.add("Kevin");
    temp.add("Michael");
    //difference
    for (String name: pq2){
      temp.remove(name);
    }
    System.out.println(temp);
    //intersection
    temp.clear();
    for (String name: pq2){
      if (pq1.contains(name)){
        temp.add(name);
      }
    }
    System.out.println(temp);
  }


  public static PriorityQueue<String> union(PriorityQueue<String> pq1, PriorityQueue<String> pq2){
    for(String s: pq2){
      pq1.offer(s);
    }
    return pq1;
  }
}
