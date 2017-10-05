public class TestComplex{
  public static void main(String [] args){
    Complex c1 = new Complex(5, 5);
    Complex c2 = new Complex(5, 5);


    System.out.println(c1.add(c2));
    System.out.println(c1.sub(c2));
    System.out.println(c1.mul(c2));
    System.out.println(c1.div(c2));

  }
}
