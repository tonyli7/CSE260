public class Complex{
    private double a;
    private double b;

    public Complex(double a, double b){
      this.a = a;
      this.b = b;
    }

    public Complex(double a){
      this(a, 0);
    }

    public Complex(){
      this(0,0);
    }

    public double getRealPart(){
      return a;
    }

    public double getImaginaryPart(){
      return b;
    }

    public Complex add(Complex other){
      double real_sum = a + other.getRealPart();
      double i_sum = b + other.getImaginaryPart();

      Complex sum = new Complex(real_sum, i_sum);
      return sum;
    }

    public Complex sub(Complex other){
      double real_dif = a - other.getRealPart();
      double i_dif = b - other.getImaginaryPart();

      Complex dif = new Complex(real_dif, i_dif);
      return dif;
    }

    public Complex mul(Complex other){
      double real_prod = a * other.getRealPart() - b * other.getImaginaryPart();
      double i_prod = b * other.getRealPart() + a * other.getImaginaryPart();

      Complex prod = new Complex(real_prod, i_prod);
      return prod;
    }

    public Complex div(Complex other){
      double real_div = (a * other.getRealPart() + b * other.getImaginaryPart()) / (2 * other.getRealPart() + 2 * other.getImaginaryPart());
      double i_div = (b * other.getRealPart() - a * other.getImaginaryPart()) / (2 * other.getRealPart() + 2 * other.getImaginaryPart());

      Complex div = new Complex(real_div, i_div);
      return div;
    }

    public String toString(){
      return "" + a + " + " + b + "i";
    }



}
