public class Driver {
  public static void main(String[] args){
    Point v1 = new Point(0.0,0.0);
    Point v2 = new Point(4.0,0.0);
    Point v3 = new Point(0.0,3.0);
    Triangle Triangle1 = new Triangle(v1,v2,v3);
    System.out.println(Triangle1); //{(0.0, 0.0), (4.0, 0.0), (0.0, 3.0)}
    System.out.println(Triangle1.getVertex(1)); //(0.0,0.0)
    System.out.println(Triangle1.getVertex(2)); //(4.0,0.0)
    System.out.println(Triangle1.getVertex(3)); //(0.0,3.0)
    System.out.println(Triangle1.getPerimeter()); //12.0

    Point p = new Point(0.0,1.0);
    Triangle1.setVertex(1, p);
    System.out.println(Triangle1.getVertex(1)); //(0.0,1.0)

    Triangle Triangle2 = new Triangle(0.0,0.0,5.0,0.0,0.0,12.0);
    System.out.println(Triangle2); //{(0.0, 0.0), (5.0, 0.0), (0.0, 12.0)}
    System.out.println(Triangle2.getVertex(1)); //(0.0,0.0)
    System.out.println(Triangle2.getVertex(2)); //(5.0,0.0)
    System.out.println(Triangle2.getVertex(3)); //(0.0,12.0)
    System.out.println(Triangle2.getPerimeter()); //30.0
    Triangle1.setVertex(2, p);
    System.out.println(Triangle1.getVertex(2)); //(0.0,1.0)

  }
}
