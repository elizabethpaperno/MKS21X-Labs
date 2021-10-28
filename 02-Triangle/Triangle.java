public class Triangle {
  private Point v1,v2,v3;
  public Triangle(Point v_1, Point v_2, Point v_3){
    v1 = v_1;
    v2 = v_2;
    v3 = v_3;
  }

  public Triangle(double v1x, double v1y, double v2x, double v2y, double v3x, double v3y){
    v1 = new Point(v1x, v1y);
    v2 = new Point(v2x, v2y);
    v3 = new Point(v3x, v3y);
  }

  public Point getVertex(int num){
    if (num == 1){
      return v1;
    }else if (num == 2){
      return v2;
    }else {
      //assuming valid input of 1, 2, or 3
      return v3;
    }
  }
  public void setVertex(int num,Point p){
    if (num == 1){
      v1 = p;
    }else if (num == 2){
      v2 = p;
    }else {
      //assuming valid input of 1, 2, or 3
      v3 = p;
    }
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public String toString(){
    return "{" + v1.toString() + ", " + v2.toString() + ", "  +  v3.toString() + "}";
  }

  public static boolean closeEnough(double a, double b){
    if (a == 0.0 || b == 0.0) {
      return (a == 0.0 && b == 0.0);
    }else{
      return (Math.abs((a-b)/a)* 100 < .001);
    }
  }

  public boolean equals(Triangle other){
    if (other != null){
      return(v1.equals(other.v1) && v2.equals(other.v2) && v3.equals(other.v3));
    } else {
      return false;
    }
  }

  public String classify(){
    int numSidesEqual = 0;
    double s1 = v1.distanceTo(v2);
    double s2 = v2.distanceTo(v3);
    double s3 = v3.distanceTo(v1);
    if (!(closeEnough(s1,s2)||closeEnough(s2,s3)||closeEnough(s1,s3))){
      return "scalene";
    }else if (closeEnough(s1,s2) && closeEnough(s2,s3) && closeEnough(s1,s3)){
      return "equilateral";
    }else{
      return "isoceles";
    }
  }

  public double area(){
    double s = getPerimeter()/2.0;
    System.out.println(v1.distanceTo(v2));
    System.out.println(v2.distanceTo(v3));
    System.out.println(v3.distanceTo(v1));
    return Math.sqrt(s * (s - v1.distanceTo(v2)) * (s-v2.distanceTo(v3)) * (s-v3.distanceTo(v1)));
  }
}
