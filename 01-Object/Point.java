public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public distanceTo(Point P2){
    return Math.sqrt(Math.pow(p.x - P2.x,2) + Math.pow(p.y - P2.y,2));
  }

  public static distance(Point P1, Point P2){
    return Math.sqrt(Math.pow(P1.x - P2.x,2) + Math.pow(P1.y - P2.y,2));
  }
}
