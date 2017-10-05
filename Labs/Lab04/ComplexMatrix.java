public class ComplexMatrix extends GenericMatrix<Complex>{
    protected Complex add(Complex c1, Complex c2){
      return c1.add(c2);
    }

    protected Complex multiply(Complex c1, Complex c2){
      return c1.mul(c2);
    }

    protected Complex zero(){
      return new Complex();
    }

    public static void main(String[] args) {
// Create Integer arrays m1, m2
        Complex[][] m1 = new Complex[3][3];

        m1[0][0] = new Complex(1,0);
        m1[0][1] = new Complex(2,0);
        m1[0][2] = new Complex(3,0);

        m1[1][0] = new Complex(4,0);
        m1[1][1] = new Complex(5,0);
        m1[1][2] = new Complex(6,0);

        m1[2][0] = new Complex(1,0);
        m1[2][1] = new Complex(1,0);
        m1[2][2] = new Complex(1,0);


        Complex[][] m2 = new Complex[3][3];

        m1[0][0] = new Complex(1,0);
        m1[0][1] = new Complex(1,0);
        m1[0][2] = new Complex(1,0);

        m1[1][0] = new Complex(2,0);
        m1[1][1] = new Complex(2,0);
        m1[1][2] = new Complex(2,0);

        m1[2][0] = new Complex(0,0);
        m1[2][1] = new Complex(0,0);
        m1[2][2] = new Complex(0,0);

// Create an instance of IntegerMatrix
        ComplexMatrix complexMatrix = new ComplexMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(
                m1, m2, complexMatrix.addMatrix(m1, m2), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(
                m1, m2, complexMatrix.multiplyMatrix(m1, m2), '*');
    }
}
