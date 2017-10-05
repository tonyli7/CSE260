import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;

public class NumberStuff{
  public static void main(String[] args){
    LinkedList<Integer> l = new LinkedList<Integer>();
    while(true){
      Scanner scn = new Scanner(System.in);
      int input = scn.nextInt();

      l.add(input);
      shuffle(l);
      System.out.print("Shuffled: ");
      System.out.println(l);
      Collections.sort(l);
      System.out.print("Sorted: ");
      System.out.println(l);
      System.out.println(reverse(l));
    }
  }

  public static void shuffle(LinkedList<Integer> list){
    Random rand = new Random();
    for (int i = 0; i < list.size(); i++){
      int randNum = rand.nextInt(list.size());
      int temp = list.get(i);
      list.set(i, list.get(randNum));
      list.set(randNum, temp);
    }
  }

  public static LinkedList<Integer> reverse(LinkedList<Integer> list){
    LinkedList<Integer> temp = new LinkedList<Integer>(0);
    for(Integer i: list){
      temp.addLast(i);
    }
    return temp;
  }
}
