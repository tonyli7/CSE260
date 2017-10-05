public class Max{
  public static <E extends Comparable<E>> E max(E[] list){

    E temp = list[0];
    for (E item: list){
      if (item.compareTo(temp) > 0){
        temp = item;
      }
    }
    return temp;
  }
}
