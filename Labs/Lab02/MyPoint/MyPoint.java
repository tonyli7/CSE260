public class MyPoint{
  private double x;
  private double y;

  public MyPoint(){
    x = 0;
    y = 0;
  }

  public MyPoint(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distance(MyPoint other){
    return Math.sqrt((x - other.getX()) * (x - other.getX()) +
                     (y - other.getY()) * (y - other.getY()));
  }
                    
  public double distance(double other_x, double other_y){
    return Math.sqrt((x - other_x) * (x - other_x) +
                     (y - other_y) * (y - other_y));
  }
}
