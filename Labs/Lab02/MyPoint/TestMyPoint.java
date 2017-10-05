public class TestMyPoint{
  public static void main(String[] args){
    MyPoint p1 = new MyPoint(0, 0);
    MyPoint p2 = new MyPoint(10, 30.5);

    System.out.println(p1.distance(p2));

  }
}
