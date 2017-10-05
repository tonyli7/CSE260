import java.util.ArrayList;
public class LargestInArrayList{
  public static void main(String[] args){
    ArrayList<String> a = new ArrayList<String>(0);
    a.add("Edward");
    a.add("Bob");
    a.add("Cathy");
    a.add("Abe");
    a.add("Dave");

    System.out.println(max(a));
  }

  public static <E extends Comparable<E>> E max(ArrayList<E> list){
    E curr = list.get(0);
    for(E element: list){
      if (element.compareTo(curr) > 0){
        curr = element;
      }
    }
    return curr;
  }
}
