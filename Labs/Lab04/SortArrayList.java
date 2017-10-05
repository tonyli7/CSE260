import java.util.ArrayList;
public class SortArrayList{
  public static void main(String[] args){
    ArrayList<String> a = new ArrayList<String>(0);
    a.add("Bob");
    a.add("Cathy");
    a.add("Abe");
    a.add("Dave");
    sort(a);
    System.out.println(a);
  }


  //selection_sort
  public static <E extends Comparable<E>> void sort(ArrayList<E> list){

    for (int i = 0; i < list.size(); i++){
      E min = list.get(i);
      int index = i;
      for (int j = i + 1; j < list.size(); j++){
        if (min.compareTo(list.get(j)) > 0){
          min = list.get(j);
          index = j;
        }
      }
      list.set(index, list.get(i));
      list.set(i, min);
    }
  }
}
