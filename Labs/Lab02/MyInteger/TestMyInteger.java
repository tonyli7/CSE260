public class TestMyInteger{
  public static void main(String[] args){
    MyInteger n = new MyInteger(100);
    MyInteger m = new MyInteger(3);
    int i = 17;

    System.out.println("\nTesting getVal: " + n.getVal());
    System.out.println("\nTesting isOdd(), isEven(), isPrime(): for n contains 100. \n");
    System.out.println("" + n.isOdd() + " " + n.isEven() + " " + n.isPrime());
    System.out.println("\nTesting isOdd(), isEven(), isPrime(): for m contains 3. \n");
    System.out.println("" + m.isOdd() + " " + m.isEven() + " " + m.isPrime());

    System.out.println("\nTesting isOdd(), isEven(), isPrime(): for i = 17. \n");
    System.out.println("" + MyInteger.isOdd(i) + " " + MyInteger.isEven(i) + " " + MyInteger.isPrime(i));

    System.out.println("\nTesting isOdd(), isEven(), isPrime(): for n contains 100. \n");
    System.out.println("" + MyInteger.isOdd(n) + " " + MyInteger.isEven(n) + " " + MyInteger.isPrime(n));

    System.out.println("\nTesting equals\n");
    System.out.println("" + n.equals(100) + " " + n.equals(new MyInteger(100)));

    System.out.println("\nTesting parseInt\n");
    System.out.println("" + (MyInteger.parseInt("100") + 1));
    System.out.println("\n" + (MyInteger.parseInt("-100") + 1));

  }
}
