import java.util.ArrayList;
public class GenericStackExtendsArrayList<E> extends ArrayList<E>{

  public boolean empty(){
    return super.size() == 0;
  }

  public E peek(){
    return super.get((super.size() - 1));
  }

  public E pop(){
    return super.remove((super.size() - 1));
  }

  public E push(E item){
    super.add(item);
    return item;
  }

  public int search(Object o){
    for (int i = super.size() - 1; i >= 0; i--){
      if (o.equals(super.get(i))){
        return super.size() - i;
      }
    }
    return -1;
  }

  public String toString(){
    String s = "[";
    for (int i = super.size() - 1; i >= 0; i--){
      s += super.get(i) + ", ";
    }
    return s.substring(0, s.length() - 2) + "]";
  }
}
