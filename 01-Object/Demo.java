public class Demo{
  /* more methods can go here*/
  public static void distance(Point P1, Point P2){
    return Math.sqrt(Math.pow(P1.getX() - P2.getX(),2) + Math.pow(P1.getY() - P2.getY(),2));
  }
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
