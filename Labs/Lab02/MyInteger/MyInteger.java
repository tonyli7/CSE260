public class MyInteger{

  private int value;

  public MyInteger(int value){
    this.value = value;
  }

  public int getVal(){
    return value;
  }

  public boolean isEven(){
    return value % 2 == 0;
  }

  public boolean isOdd(){
    return value % 2 == 1;
  }

  public boolean isPrime(){
    for (int i = 2; i < value / 2; i ++){
      if (value % i == 0){
        return true;
      }
    }
    return false;
  }

  public boolean equals(int n){
    return value == n;
  }

  public boolean equals(MyInteger n){
    return value == n.getVal();
  }

  public static boolean isEven(int n){
      return n % 2 == 0;
  }

  public static boolean isOdd(int n){
    return n % 2 == 1;
  }

  public static boolean isPrime(int n){
    for (int i = 2; i < n / 2; i ++){
      if (n % i == 0){
        return true;
      }
    }
    return false;
  }

  public static boolean isEven(MyInteger n){
      return n.getVal() % 2 == 0;
  }

  public static boolean isOdd(MyInteger n){
    return n.getVal() % 2 == 1;
  }

  public static boolean isPrime(MyInteger n){
    for (int i = 2; i < n.getVal() / 2; i ++){
      if (n.getVal() % i == 0){
        return true;
      }
    }
    return false;
  }

  public static int parseInt(String s){
    String[] ref = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int n = 0;
    int place_val = 1;

    for (int i = s.length() - 1; i >= 0; i--){
      int val = indexOf(s.substring(i, i + 1), ref);
      if (val >= 0){
        n += val * place_val;
        place_val *= 10;
      }
    }
    if (s.substring(0, 1).equals("-")){
      n *= -1;
    }
    return n;
  }

  public static int indexOf(String c, String[] arr){
    for (int i = 0; i < arr.length; i++){
      if (c.equals(arr[i])){
        return i;
      }
    }
    return -1;
  }


}
