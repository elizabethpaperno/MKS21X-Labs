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
    System.out.println(Triangle1); //{(0.0, 1.0), (4.0, 0.0), (0.0, 3.0)}


    Triangle Triangle2 = new Triangle(0.0,0.0,5.0,0.0,0.0,12.0);
    System.out.println(Triangle2); //{(0.0, 0.0), (5.0, 0.0), (0.0, 12.0)}
    System.out.println(Triangle2.getVertex(1)); //(0.0,0.0)
    System.out.println(Triangle2.getVertex(2)); //(5.0,0.0)
    System.out.println(Triangle2.getVertex(3)); //(0.0,12.0)
    System.out.println(Triangle2.getPerimeter()); //30.0
    Triangle1.setVertex(2, p);
    System.out.println(Triangle2.getVertex(2)); //(0.0,1.0)
    System.out.println(Triangle2); //{(0.0, 0.0), (0.0, 1.0), (0.0, 12.0)}

    System.out.println(Point.closeEnough(100.0, 99.9999));//true
    System.out.println(Point.closeEnough(200.0, 99.9999)); //false
    System.out.println(Point.closeEnough(0.00001, 0.0000099999)); //true
    System.out.println(Point.closeEnough(0.0, 0.0));//true
    System.out.println(Point.closeEnough(0.0, 5.0));//false

    Point P1 = new Point(1.0,1.00000000001);
    Point P2 = new Point (1.0,1.0);
    System.out.println(P1.equals(P2)); //true

    System.out.println(Triangle1.equals(Triangle2)); //false

    Triangle scalene1 = new Triangle(0.0,0.0,2.0,2.0,3.0,-4.0);
    System.out.println(scalene1.classify()); //scalene1

    Triangle isoceles1 = new Triangle(5.0,4.0,2.0,0.0,-2.0,3.0);
    System.out.println(isoceles1.classify()); //isoceles

    Triangle equi1 = new Triangle(0.0,0.0,0.0,6.0,3.0,3.0 * Math.sqrt(3.0));
    System.out.println(equi1.classify()); //equilateral

    Triangle TriangleA = new Triangle(-1.0,2.0,2.0,3.0,4.0,-3.0);
    System.out.println(TriangleA.area()); //10

    Triangle TriangleB = new Triangle(3.0,4.0,4.0,7.0,6.0,-3.0);
    System.out.println(TriangleB.area()); //8
  }
}
